/**
 * @author attilax 老哇的爪子
	@since  o9n i_0_7$
 */
package com.attilax.api;

import com.attilax.core;
import com.attilax.cfg.ApiInier;
import com.attilax.io.filex;

import static com.attilax.core.*;
import java.util.*;
import java.net.*;
import java.io.*;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;

import www.Hbx4shp;

/**
 * @author attilax 老哇的爪子
 * @since o9n i_0_7$
 */
public class ApiX2 extends HandlerChain {

	public ApiX2() {
		super();
	}

	public static String defOkRet = "{\"errcode\":0,\"errmsg\":\"ok\" }";

	/**
	 * @author attilax 老哇的爪子
	 * @since o9n i_0_7
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String data = " method ( {'p1':'xxx','p2',33} )  ";
		// new ApiInier().ini();
		// // attilax 老哇的爪子 i_0_7 o9n
		// ApiX2 c=new ApiX2();
		// c.hbx=Hbx4shp.getStance();
		int brkLeftIndex = data.indexOf("(");

		String subMeth = data.substring(0, brkLeftIndex).trim();

		int brkLastRit = data.lastIndexOf(")");
		Object parameter = data.substring(brkLeftIndex + 1, brkLastRit);
		System.out.println("@@" + subMeth + "-----" + parameter + "@@end");

	}

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
				new paramCheckor2(req);
			} catch (paramCheckorFailEx e) {
				return core.toJsonStrO88(e);
			}
			String data = req.getParameter("data");
			// JSONObject jo = JSONObject.fromObject(data);
			int brkLeftIndex = data.indexOf("(");
			if (brkLeftIndex == -1)
				throw new RuntimeException(
						"cant find the left brack.不能找到左括号，格式错误？？");

			String subMeth = data.substring(0, brkLeftIndex).trim();
			int brkLastRit = data.lastIndexOf(")");
			if (brkLastRit == -1)
				throw new RuntimeException(
						"cant find the right brack.不能找到右边括号，格式错误？？");
			Object parameter = data.substring(brkLeftIndex + 1, brkLastRit);
			if (parameter.toString().trim().length() == 0)
				throw new RuntimeException(" param is empty.参数为空，格式错误？？");
			String r = api(subMeth, parameter);
			logReq_api(req, r);
			return r;
			// j5937 o7l 老哇的爪子 Attilax

		} catch (Exception e) {
			AtiEx ae = new AtiEx(e);
			logReq_api(req, e.getMessage());
			JsonConfig config = new JsonConfig();
			// 设置循环策略为忽略 解决json最头疼的问题 死循环
			// CycleDetectionStrategy.
			// config.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);//宽大的
			config.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);// 宽大的
			return core.toJsonStrO88(ae, config);

		}

	}
	// attilax 老哇的爪子 i_0_7 o9n
}

// attilax 老哇的爪子