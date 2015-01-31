package com.attilax.net;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class ResponseX {

	public static HttpServletResponse getEmptyResp() {
		  RespImp ri=new RespImp();
		  PrintWriter  pw=new PrintWriterImp();
		return null;
	}

}
