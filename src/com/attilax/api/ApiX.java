/**
 * @author attilax 老哇的爪子
	@since  o9n i_0_7$
 */
package com.attilax.api;
import com.attilax.core;
import com.attilax.cfg.ApiInier;

 import static  com.attilax.core.*;
import java.util.*;
import java.net.*;
import java.io.*;

import www.Hbx4shp;
/**
 * @author  attilax 老哇的爪子
 *@since  o9n i_0_7$
 */
public class ApiX extends HandlerChain {
	
	
	public ApiX()
	{
		super();
	}
	public static	String defOkRet= "{\"errcode\":0,\"errmsg\":\"ok\" }";
	/**
	@author attilax 老哇的爪子
		@since  o9n i_0_7   
	
	 * @param args
	 */
	public static void main(String[] args) {
		new ApiInier().ini();
		// attilax 老哇的爪子  i_0_7   o9n 
		ApiX c=new ApiX();
		c.hbx=Hbx4shp.getStance();

	}
	//  attilax 老哇的爪子 i_0_7   o9n   
}

//  attilax 老哇的爪子