/**
 * 
 * com.attilax.api.HandlerChain
 * @author attilax 老哇的爪子
	@since  o7l h41t$
 */
package com.attilax.api;
import com.attilax.core;
import com.attilax.collection.CollX;
import com.attilax.io.filex;
import com.attilax.log.Ilogx;
import com.attilax.log.Level;
import com.attilax.log.logRec;
import com.attilax.net.requestImp;
//import com.attilax.noticer.jsonFldSerialIgone;
import com.attilax.persistence.Hbx;
import com.attilax.persistence.HbxX;
import com.attilax.persistence.baseDAO;
//import com.attilax.secury.propertyReader;
import com.attilax.time.timeUtil;
import com.attilax.util.god;
//import com.focustar.listener.cmd_vod;
//import com.focustar.playRec.baseDAO;
//import com.focustar.push.submeth;
//import com.focustar.util.HbX4vod;
import com.google.inject.Inject;
 
 

 import static  com.attilax.core.*;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.net.*;
import java.io.*;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
//import org.apache.poi.hpsf.SummaryInformation;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
//import org.slf4j.Marker;


import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
/**
 * @author  attilax 老哇的爪子
 *@since  o7l h41t$
 */ @SuppressWarnings("all") @Deprecated
public class HandlerChain {
	public static Logger logger = Logger.getLogger("apiReceiverLoger");
	  public static Map mp=new ConcurrentHashMap <String,Handler>();
	  public static Session sess;
	  
	  @Inject
	public  Hbx hbx;
	  
	  public HandlerChain()
	  {
		  System.out.println("");
		 this.reg("query", new Handler() {
			
			@Override public Object handleReq(Object arg) throws Exception {
				// attilax 老哇的爪子  l_43_u   o87 
				
				Query q =sess.createSQLQuery(arg.toString()); 
				 q.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
                 List li=q.list();
				return li;
				
			}
		});
		 
		 
		 this.reg("sql", new Handler() {
				
				@Override public Object handleReq(Object arg) throws Exception {
					// attilax 老哇的爪子  l_43_u   o87 
					
				 
	                 List li=hbx.findBySql(arg.toString());
	                 
					return core.toJsonStrO88(li);
					
				}
			});
		 
		 this.reg("queryHql", new Handler() {
				
				@Override public Object handleReq(Object arg) throws Exception {
					// attilax 老哇的爪子  l_43_u   o87 
					
					Query q =sess.createQuery(arg.toString()); 
					 q.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
	                 List li=q.list();
					return li;
					
				}
			});
		 
		 this.reg("hql", new Handler() {
				
				@Override public Object handleReq(Object arg) throws Exception {
					
					//Old
				 try {
					filex.save_SF(arg.toString(), "c:\\hqlDir\\hql"+filex.getUUidName()+".txt");
				} catch (Exception e) {
					core.err(e);
				}
					// attilax 老哇的爪子  l_43_u   o87 
					 List li=new ArrayList();
					try {
						Query q =hbx.getSession().createQuery(arg.toString()); 
					//	hbx.findByHql(hql)
					 
			               li =q.list();
			              
					} 
					catch(IllegalArgumentException e)
					{
						if(e.getMessage().contains("node to traverse cannot be null"))
						{
							core.err(e);
							throw new RuntimeException("hql req err,maybe hql fmt e, hql:"+arg.toString(),e);
						}
					}
					 
					   Object jsonFldSerialIgone;
					   return null;
				//	return     core.toJsonStrO88(li,((Object) jsonFldSerialIgone).jsonConfig_4reqPubFromTVB());
	                 
	                
				//	 li;
					
				}
			});
		 
//		 this.reg("executeUpdate", new Handler() {
//				
//				@Override public Object handleReq(Object arg) throws Exception {
//					// attilax 老哇的爪子  l_43_u   o87 
//					
//					Query q =sess.createQuery(hql); 
//					 q.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
//	                 List li=q.list();
//					return li;
//					
//				}
//			});
		  
	  }
 synchronized public static void  reg(String subMeth,Handler handler)
 {
	 mp.put(subMeth,handler);
	 
 }
 
 /**
@author attilax 老哇的爪子
	@since  o09 h_0_8   

 */
public String showHandlerState() {
	// attilax 老哇的爪子  h_0_8   o09 
	try {
		return  CollX.joinOa9(this.mp.keySet(), ",");
	} catch (Exception e) {
		core.err(e);
		return core.getTrace(e);
	}
	
}

Ilogx logx=new Ilogx(){

	@Override
	public void log(Object obj) {
		
		try {
			HttpServletRequest req=(HttpServletRequest) obj;
			
			String req2str = core.req2str(req);
			String subMeth = req.getParameter("submethod");
			logReq(req,subMeth);
//			if(subMeth.equals(cmd_vod.postDownTaskBackfeed))
//			{
//				filex.save_SF(req2str, "c:\\apiback\\postDownTaskBackfeed\\"+filex.getUUidName()+".txt");
//			
//			}
		} catch (Exception e) {
			filex.save_SF(core.getTrace(e), "c:\\apiback\\postDownTaskBackfeed\\"+filex.getUUidName()+".txt");
		}
		
		
	}};

	public String handleReq(final HttpServletRequest req) throws Exception {
		// core.logMap(req.getParameterMap());
		try {
			logReq(req);
			logx.log(req);
		} catch (Exception e) {
			filex.saveLog(e, "c:\\apiback");
		}

		// log 4 db

		try {

			// attilax 老哇的爪子 h_51_s o7t
			try {
				new paramCheckor(req);
			} catch (paramCheckorFailEx e) {
				return core.toJsonStrO88(e);
			}
			String data = req.getParameter("data");
			JSONObject jo = JSONObject.fromObject(data);
			String subMeth = jo.getString("method");
			Object parameter = jo.get("param");

			String r = api(subMeth, parameter);
			logReq_api(req, r);
			return r;
			// j5937 o7l 老哇的爪子 Attilax

		} catch (Exception e) {
			logReq_api(req, e.getMessage());
			
			JsonConfig config=new JsonConfig();
			//设置循环策略为忽略    解决json最头疼的问题 死循环
			//CycleDetectionStrategy.   
		//	config.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);//宽大的
			config.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);//宽大的
		//	return	core.toJsonStrO88(e, config);
		  	return core.toJsonStrO88(e);

		}

	}
 
 	/**
	@author attilax 老哇的爪子
	@since   oao c_0_u
	 
	 */
protected void logReq_api(HttpServletRequest req, String retmsg) {
	try {
		String req2str = core.req2str(req);
	//	filex.save_SF(req2str, "c:\\reqLogDir\\reqLogDir"+filex.getUUidName()+".txt");
		String submeth = req.getParameter("submethod");
		
			logRec o=new logRec();
			 o.setLevel(Level.info);
 
			 o.setCreateTime(timeUtil.getTimestamp());
			 o.setLogger(submeth);
			 o.setMsg(req2str );
			  o.setMsgA(retmsg);
			//  o.setMsg2(String.valueOf(arg));
			  o.setSend("");
			  o.setThread(submeth);
			  o.setCate(submeth);
		 	//this.dbx.save(o);
				new baseDAO().save(o);
		} catch (Exception e) {
			core.log(e);
			filex.saveLog(e, "c:\\e");
		}
	
}
private void logReq(final HttpServletRequest req,String submeth) {
		try {
		String req2str = core.req2str(req);
	//	filex.save_SF(req2str, "c:\\reqLogDir\\reqLogDir"+filex.getUUidName()+".txt");
		
		
			logRec o=new logRec();
			 o.setLevel(Level.info);
 
			 o.setCreateTime(timeUtil.getTimestamp());
			 o.setLogger(submeth);
			 o.setMsg(req2str );
			  o.setMsgA(String.valueOf(req2str));
			//  o.setMsg2(String.valueOf(arg));
			  o.setSend("");
			  o.setThread(submeth);
			  o.setCate(submeth);
		 	//this.dbx.save(o);
				new baseDAO().save(o);
		} catch (Exception e) {
			core.log(e);
		}
	}
protected void logReq(final HttpServletRequest req) {
	try {
	String req2str = core.req2str(req);
	filex.save_SF(req2str, "c:\\reqLogDir\\reqLogDir"+filex.getUUidName()+".txt");
	
	
		logRec o=new logRec();
		 o.setLevel(Level.info);
	//	 o.setIdx( gvdr.getDrId());
//		 o.setIdx2(tsk.getRltID2());
//		 o.setIdx3(tsk.getRltID3());
		 o.setCreateTime(timeUtil.getTimestamp());
		 o.setLogger("reqLog");
		 o.setMsg(req2str );
		  o.setMsgA(String.valueOf(req2str));
		//  o.setMsg2(String.valueOf(arg));
		  o.setSend("");
		  o.setThread("reqLog");
		  o.setCate("reqLog");
	 	//this.dbx.save(o);
			new baseDAO().save(o);
	} catch (Exception e) {
		core.log(e);
	}
}
	protected String api(String subMeth, Object parameter) throws Exception   {
		subMeth=subMeth.toLowerCase().trim();
		Handler hd = (Handler) mp.get(subMeth);	
		if(hd==null)
			 hd = (Handler) mp.get("sql");	
		if(hd==null)
			throw new RuntimeException("handle is null::"+subMeth);
		String r="";
		//try {
			r = hd.handleReq(parameter).toString();
//		} catch (Exception e) {
//			//  attilax 老哇的爪子 4_m_0   o8r   
//			e.printStackTrace();
//			core.warn(e);
//			throw new RuntimeException(e);
//		}
		return r;
	}
	/**
	@author attilax 老哇的爪子
		@since  o7l h41t$
	
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// attilax 老哇的爪子  h41t   o7l 
	 requestImp ri=new requestImp();
	 ri.setParam("submethod", "aa");
	 
System.out.println(new HandlerChain().handleReq(ri));
	}
	//  attilax 老哇的爪子 h41t   o7l   
	/**
	@author attilax 老哇的爪子
		@since  o7t 2_0_1$
	
	 * @param pram
	 * @param string
	 * @return
	 */
	public static String addActNSecuryINfo(String pram, String meth) {
		// attilax 老哇的爪子  2_0_1   o7t 
		JSONObject jo=new JSONObject();
		jo.put("submethod", meth);
		jo.put("param", pram);
		jo.put("sign", "..");
		return jo.toString();
		 
		
	}
	/**
	@author attilax 老哇的爪子
		@since  o88 2_48_0$
	
	 * @param callMeth
	 */
	public static void unreg(String subMeth) {
		// attilax 老哇的爪子  2_48_0   o88 
		 mp.remove(subMeth);
		
	}
}

//  attilax 老哇的爪子