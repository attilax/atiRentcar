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

/**   com.kunpeng.www.controller.AppServlet
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
	//	response.setContentType(arg0)
		 //这句话的意思，是让浏览器用utf8来解析返回的数据  
        response.setHeader("Content-type", "text/html;charset=UTF-8");  
		response.setCharacterEncoding("utf-8");

		String action = null;
		try {
			action = request.getParameter("action");
			// response.getWriter().append(action);
			if (action.equals(null)) {
				response.getWriter().append("�������ݴ���");
				return;
			}
		} catch (Exception e) {
			response.getWriter().append("�������ݴ���");
			return;
		}
		//response.getWriter().append("������ز���");
		try {
			System.out.println("action="+action);
			AppAction appserver=new AppAction(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
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
