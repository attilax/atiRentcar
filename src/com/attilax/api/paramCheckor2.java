/**
 * 
 */
package com.attilax.api;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

/**
 * @author ASIMO
 *
 */
public class paramCheckor2 {
	
	
	/**
	 * @param req
	 */
	 

	public   paramCheckor2(HttpServletRequest req) throws paramCheckorFailEx {
		//  attilax 老哇的爪子 j_58_z   o83   
		
		String datas = req.getParameter("data");
		if(datas==null ||  datas.trim().length()==0)
			throw new paramCheckorFailEx(" miss the \"data\" param ");
//		JSONObject jo=null;
//		try {
//			jo=JSONObject.fromObject(datas);
//		} catch (Exception e) {
//			throw new paramCheckorFailEx(e.getMessage());
//		}
		
		
		 
//		Object method=jo.get("method");
//		if(method==null || method.equals(""))
//			 throw new paramCheckorFailEx( "miss method ");
//		Object param=jo.get("param");
//		if(param==null || param.equals(""))
//			 throw new paramCheckorFailEx( "miss param ");
//		subMeth = req.getParameter("param");
//		if(subMeth==null || subMeth.equals(""))
//			 throw new paramCheckorFailEx( errcode. errcode(errcode.miss_param_param));
	}

}
