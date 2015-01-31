/**
 * @author attilax 老哇的爪子
	@since  o92 j_48_u$
 */
package com.attilax.cfg;
import com.attilax.core;
//import com.attilax.db.DBX;
//import com.attilax.db.DbxMybatis;
import com.attilax.persistence.Hbx;
import com.attilax.persistence.HbxX;
import com.attilax.persistence.PX;
//import com.focustar.ServiceLoctor4vod;
//import com.focustar.downtask.GvDownloadTaskSvs;
import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.name.Names;
 import static  com.attilax.core.*;
import java.util.*;
import java.net.*;
import java.io.*;

import www.Hbx4shp;
//import org.directwebremoting.extend.AbstractCreator;
//import org.directwebremoting.extend.Creator;
/**
 * @author  attilax 老哇的爪子
 *@since  o92 j_48_u$
 */
public class IocX   {
	static Injector ati;
	
	public static boolean update=false;
	/**
	@author attilax 老哇的爪子
		@since  o92 j_48_40   
	
	 * @param class1
	 * @return
	 */
	public static <t> t getBean(Class<t> class1) {
		// attilax 老哇的爪子  j_48_40   o92 
		if(ati==null)   //ini   singleon patter..
		{
		  ati = Guice.createInjector(new Module(){

				@Override public void configure(Binder bd) {
				//	ServiceLoctor4vod.inidb();
					// attilax 老哇的爪子  j_s_37   o92 
				//	bd.bind(DBX.class).to(DbxMybatis.class);
				//	bd.bind(guiceT.class);  ///jeig bind self def zeush okd ,can not jwemen bind..
					//all def inj can def bind self...can auto bind
					bd.bind(PX.class).to(HbxX.class);
					bd.bind(Hbx.class).toInstance(Hbx4shp.getStance());
				//	bd.bind(GvDownloadTaskSvs.class);
					bd.bindConstant().annotatedWith(Names.named("thql")).to(" from TUserUsers ");
				}});
		}
				
		return ati.getInstance(class1);
		
	}
 
//	 Injector inj=  Guice.createInjector(new Module() {
//		 2       @Override
//		 3       public void configure(Binder binder) {
//		 4           binder.bind(HelloWorld.class).toProvider(new Provider<HelloWorld>() {
//		 5               @Override
//		 6               public HelloWorld get() {
//		 7                   return new HelloWorldImpl();
//		 8               }
//		 9           });
//		10       }
//		11   });
	
	
	 public static IocX getInstanceAti(String iocxName)  {
		return null;
			// attilax 老哇的爪子  l_d_c   o93 
	//	   return new IocX4zip();
		//	return null;
			
		}
	/**
	@author attilax 老哇的爪子
		@since  o02 4_f_56   
	
	 * @param string
	 */
	public static  <t> t getBean(String className) {
		// attilax 老哇的爪子  4_f_56   o02 
		try {
			Class c=Class.forName(className);
			return (t) getBean(c);
		} catch (ClassNotFoundException e) {
			//  attilax 老哇的爪子 4_h_t   o02   
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	//	return null;
		
	}
}

//  attilax 老哇的爪子