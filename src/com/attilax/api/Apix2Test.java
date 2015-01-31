/**
 * 
 */
package com.attilax.api;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.attilax.io.filex;
import com.attilax.io.pathx;
import com.attilax.net.websitex;

/**
 * @author ASIMO
 *
 */
public class Apix2Test {

	/**
	@author attilax 老哇的爪子
	 * @throws UnsupportedEncodingException 
	@since   p1q f_51_50
	 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		//String f=pathx.classPath(ApiTest.class)+"goodslist.json";
		//String t=filex.read(f);
		
		String	t= " getUserInfo (  SELECT * FROM `mall_user_info` where user_id=8 ) ";	 
		String url="http://localhost:8090/shopitfs/api2.jsp?data="+URLEncoder.encode(t,"utf8");
	//	url="http://192.168.1.33/vod/api.jsp?sign=xxxx&submethod=postDownTaskBackfeed4notice&param=%7B%22dsId%22%3A1554%2C%22equipmentId%22%3A1081%7D&appid=863778010205109";
		System.out.println(url);
		System.out.println(websitex.WebpageContent(url));;

	}

}
