package com.attilax.user;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.attilax.net.websitex;

public class ExExamp {

	public static void main(String[] args) {
		
		login(  );
	

	}

	private static void login() {
		String url = "http://xxxxxxxx?data=method(param)";
		try {
			//....正常状态处理流程
			JSONObject obj = login_api(url);
			
			//bindUi(obj);  //绑定用户相关信息到ui控件上
			
		} catch (UserNotExistEx e) {
			// 用户不存的异常处理
			e.printStackTrace();
		} catch (PwdErrEx e) {
			//密码错误的异常处理
			e.printStackTrace();
		} catch (ExprireEx e) {
			// 用户过期的异常处理
			e.printStackTrace();
		} catch (LockEx e) {
			//锁定的异常处理规则
			e.printStackTrace();
		} catch (UsernameAndPwdNotMatch e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * 获取web内容通过url，带业务异常处理
	 * @param url
	 * @return
	 * @throws UserNotExistEx 
	 * @throws PwdErrEx 
	 * @throws ExprireEx    用户过期异常
	 * @throws LockEx     锁定异常
	 * @throws UsernameAndPwdNotMatch 
	 */
	private static JSONObject login_api(String url) throws UserNotExistEx, PwdErrEx, ExprireEx, LockEx, UsernameAndPwdNotMatch {
		String txt = websitex.WebpageContent(url); // 获取内容
		if(txt==null || txt.trim().length()==0) //无返回或者返回为空
			  throw new UsernameAndPwdNotMatch("用户名密码不匹配");
		JSONObject jo = null;

		try {
			//尝试反序列化异常对象，因为异常对象是序列化为jsonobject
			jo = JSONObject.fromObject(txt);

		} catch (Exception e) {
			// 解析json出错，说明不是异常对象,是正常对象。。返回
			jo=JSONArray.fromObject(txt).getJSONObject(0);
			return jo;
		}
		if (!jo.containsKey("cause") || !jo.containsKey("stackTrace"))
			return jo; // 不包含异常对象属性。说明不是异常对象。返回
		
		if(jo.containsKey("typex"))
		{
			String typex=jo.getString("typex");
			//此处注册多个本地异常与接口异常的转换。很适合使用命令模式/查表模式来注册多个异常转换器
			if(typex!=null && typex.equals("com.kunpeng.www.server.UserNotExistEx"))
			{
				throw new UserNotExistEx(jo.getString("message"));
			}
			 if(typex!=null && typex.equals("com.kunpeng.PwdErrEx") )
			{
				throw new PwdErrEx(jo.getString("message"));
			}
			 if(typex!=null && typex.equals("com.kunpeng.ExprireEx") )
				{
					throw new ExprireEx(jo.getString("message"));
				}
			 if(typex!=null && typex.equals("com.kunpeng.LockEx") )
				{
					throw new LockEx(jo.getString("message"));
				}
		}

		return jo;
	}

}
