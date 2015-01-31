package com.kunpeng.www.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kunpeng.www.config.DBXMLTool;
import com.kunpeng.www.domain.DBVo;
import com.kunpeng.www.server.AppAction;

/**
 * Servlet implementation class AppServlet
 */
@WebServlet("/AppServlet")
public class AppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AppServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		response.setCharacterEncoding("GB2312");

		String action = null;
		try {
			action = request.getParameter("action");
			// response.getWriter().append(action);
			if (action.equals(null)) {
				response.getWriter().append("参数传递错误！");
				return;
			}
		} catch (Exception e) {
			response.getWriter().append("参数传递错误！");
			return;
		}
		//response.getWriter().append("进行相关操作");
		try {
			System.out.println("action="+action);
			AppAction appserver=new AppAction(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
