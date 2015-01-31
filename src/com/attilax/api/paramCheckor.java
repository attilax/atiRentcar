/**
 * @author attilax 老哇的爪子
	@since  o83 j_58_d$
 */
package com.attilax.api;
import com.attilax.core;
 import static  com.attilax.core.*;
import java.util.*;
import java.net.*;
import java.io.*;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;
/**
 * @author  attilax 老哇的爪子
 *@since  o83 j_58_d$
 */
public class paramCheckor {

	/**
	@author attilax 老哇的爪子
		@since  o83 j_58_z$
	
	 * @param req
	 * @throws paramCheckorFailEx 
	 */
	public   paramCheckor(HttpServletRequest req) throws paramCheckorFailEx {
		//  attilax 老哇的爪子 j_58_z   o83   
		
		String datas = req.getParameter("data");
		if(datas==null ||  datas.trim().length()==0)
			throw new paramCheckorFailEx(" miss the \"data\" param ");
		JSONObject jo=null;
		try {
			jo=JSONObject.fromObject(datas);
		} catch (Exception e) {
			throw new paramCheckorFailEx(e.getMessage());
		}
		
		
		 
		Object method=jo.get("method");
		if(method==null || method.equals(""))
			 throw new paramCheckorFailEx( "miss method ");
		Object param=jo.get("param");
		if(param==null || param.equals(""))
			 throw new paramCheckorFailEx( "miss param ");
//		subMeth = req.getParameter("param");
//		if(subMeth==null || subMeth.equals(""))
//			 throw new paramCheckorFailEx( errcode. errcode(errcode.miss_param_param));
	}
	//  attilax 老哇的爪子 j_58_d   o83   
}

//  attilax 老哇的爪子