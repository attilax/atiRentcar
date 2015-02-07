package com.kunpeng.www.server;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//
//import org.apache.tomcat.util.http.fileupload.FileItem;
//import org.apache.tomcat.util.http.fileupload.FileUploadException;
//import org.apache.tomcat.util.http.fileupload.RequestContext;
//import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
//import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.attilax.user.PwdErrEx;
import com.attilax.user.UserAlreadyExistEx;
 
import com.kunpeng.www.comm.CarPicController;
import com.kunpeng.www.comm.GetCarList;
import com.kunpeng.www.comm.GetCarPic;
import com.kunpeng.www.comm.GetCartype;
import com.kunpeng.www.comm.GetLocation;
import com.kunpeng.www.comm.GetPublic;
import com.kunpeng.www.comm.GetSpeedtype;
import com.kunpeng.www.comm.GetUser;
import com.kunpeng.www.comm.TalkController;
import com.kunpeng.www.dao.ComDAO;
import com.kunpeng.www.dao.UserDAOImp;
import com.kunpeng.www.domain.ComVo;
import com.kunpeng.www.domain.UserVo;
import com.kunpeng.www.tool.Comm;

public class AppAction {
	private HttpServletRequest request;
	private HttpServletResponse response;
	private UserVo uservo = new UserVo();
	private ComDAO comdao;

	public AppAction(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		this.request = request;
		this.response = response;

		String action = null;
		try {
			action = request.getParameter("action");
			// response.getWriter().append(action);
			if (action.equals(null)) {
				
				try {
					response.getWriter().append("�������ݴ���");
				} catch (Exception e) {
					// TODO: handle exception
				}
				return;
			}
		} catch (Exception e) {
			try {
				response.getWriter().append("�������ݴ���");
			} catch (Exception e2) {
				// TODO: handle exception
			}
			return;
		}
		Map<String, Integer> m=new HashMap<String, Integer>();
		m.put("SendReg", 1);
		m.put("GetCarList", 2);
		m.put("GetProvinceList", 3);
		m.put("GetCityList", 4);
		m.put("GetAreaList", 5);
		m.put("GetStreetList", 6);
		m.put("GetSpeedtypeList", 7);
		
		m.put("UploadCarPic", 9);
		m.put("SendLogin", 10);
		m.put("Login", 11);
		m.put("UserLogin", 12);
		 
		int cse_int=m.get(action);
		switch (cse_int) {
			 
		case 2:
			// response.getWriter().append("Login��¼������");
			getCarList();

			break;

		case 3:
			// response.getWriter().append("Login��¼������");
			getProvinceList();

			break;
		case 4:
			// response.getWriter().append("Login��¼������");
			getGetCityList();

			break;
		case 5:
			// response.getWriter().append("Login��¼������");
			getGetAreaList();

			break;
		case 6:
			// response.getWriter().append("Login��¼������");
			getGetStreetList();

			break;
		case 7:
			// response.getWriter().append("Login��¼������");
			GetSpeedtypeList();

			break;
//		case "GetDaytypeList":
//			// response.getWriter().append("Login��¼������");
//			GetDaytypeList();
//
//			break;
//		case "GetCartype":
//			// response.getWriter().append("Login��¼������");
//			GetCartypeList();
//
//			break;
//		case "GetSntype":
//			// response.getWriter().append("Login��¼������");
//		//	GetSntypeList();
//
//			break;
//		case "GetUser":
//			// response.getWriter().append("Login��¼������");
//		//	GetUserInfo();
//
//			break;
//		case "GetCarPic":
//			// response.getWriter().append("Login��¼������");
//		//	GetCarPic();
			
		//	break;
		case 9:
			// response.getWriter().append("Login��¼������");
			UploadCarPic();

			break;
		case 10:

			// response.getWriter().append("Login��¼������");
		//	doSendLogin();
			doLogin();

			break;
		
		case 11:
			// response.getWriter().append("Login��¼������");
			doLogin();

			break;
		case 12:
			// response.getWriter().append("Login��¼������");
			doUserLogin();

			break;
		case 1:
			// response.getWriter().append("Login��¼������");
			doSendReg();

			break;
//		case "SaveTalk":
//			// response.getWriter().append("Login��¼������");
//			SaveTalk();
//
//			break;
		default:
			response.getWriter().append("no this action");
			break;
		}

	}

	private void GetCarPic() throws Exception {
		// TODO Auto-generated method stub
		String typeid = "";
		String id = "";
		typeid = this.request.getParameter("typeid");
		id = this.request.getParameter("id");
		if (typeid == null) {
			typeid = "";
		}
		if (id == null) {
			id = "";
		}
		response.getWriter().append(
				"{\"table\":[{" + GetCarPic.PicListJson(typeid, id) + "}]}");
	}

	private void SaveTalk() throws Exception {

		String typeid = "";
		String id = "";

		String user_id = "";
		String content = "";
		String addtime = Comm.getNowTime();

		typeid = this.request.getParameter("typeid");
		id = this.request.getParameter("id");
		user_id = this.request.getParameter("user_id");
		content = this.request.getParameter("content");

		if (typeid == null) {
			typeid = "";
		}
		if (id == null) {
			id = "0";
		}

		response.getWriter().append(
				TalkController.saveTalk(typeid, id, user_id, content, addtime));

	}

	static int i = 0;

	private void UploadCarPic() throws Exception {
//		String typeid = "";
//		String id = "";
//
//		typeid = this.request.getParameter("typeid");
//		id = this.request.getParameter("id");
//		if (typeid == null) {
//			typeid = "";
//		}
//		if (id == null) {
//			id = "";
//		}
//
//		// System.out.println("typeid="+typeid);
//		// System.out.println("id="+id);
//
//		DiskFileItemFactory factory = new DiskFileItemFactory();
//		ServletFileUpload uploader = new ServletFileUpload(factory);
//
//		List<FileItem> items = null;
//		try {
//			items = uploader.parseRequest((RequestContext)request);
//			for (FileItem fileItem : items) {
//				if (fileItem.isFormField()) {
//					// ������ͨ����
//					String field = fileItem.getFieldName();// ������
//					System.out.println(field);
//
//					String value = fileItem.getString("UTF-8");
//					System.out.println(value);
//				} else {
//					// ����ʱ�ļ����浽ָ��Ŀ¼
//					String fileName = fileItem.getName();// �ļ����ƣ�ע��ʵ�ʿ�����ʱ���ļ���Ҫ�õ�ǰʱ������!
//
//					String picname = fileName.substring(0,
//							fileName.length() - 4);
//					String fileNewName = Comm.getPicName()
//							+ fileName.substring(fileName.length() - 4,
//									fileName.length());
//					String picurl = "uploadfiles/" + fileNewName;
//
//					String filepath = request.getSession().getServletContext()
//							.getRealPath("\\")
//							+ "uploadfiles" + File.separator + fileNewName;// �ϴ�·����ʵ�ʿ�������this.getServletContext().getRealPath("/uploadfiles")
//					// String filepath =
//					// request.getSession().getServletContext().getRealPath("\\")
//					// +"img"+File.separator+fileName;//�ϴ�·����ʵ�ʿ�������this.getServletContext().getRealPath("/uploadfiles")
//
//					System.out.println(request.getSession().getServletContext()
//							.getRealPath("\\")
//							+ "uploadfiles" + File.separator + fileName);
//					System.out.println(fileName);
//					try {
//						fileItem.write(new File(filepath));
//
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}// ִ�б���
//					CarPicController.saveCarPic(typeid, id, picname, picurl);
//				}
//			}
//		} catch (FileUploadException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// response.getWriter().append(
		// "{\"table\":[{" + GetPublic.sntypeJson(typeid, id) + "}]}");
	}

	private void GetUserInfo() throws Exception {
		String typeid = "";
		String id = "";

		typeid = this.request.getParameter("typeid");
		id = this.request.getParameter("id");
		if (typeid == null) {
			typeid = "";
		}
		if (id == null) {
			id = "";
		}
		response.getWriter().append(
				"{\"table\":[{" + GetUser.userJson(typeid, id) + "}]}");
	}

	private void GetSntypeList() throws Exception {
		String typeid = "";
		String id = "";

		typeid = this.request.getParameter("typeid");
		id = this.request.getParameter("id");
		if (typeid == null) {
			typeid = "";
		}
		if (id == null) {
			id = "";
		}
		response.getWriter().append(
				"{\"table\":[{" + GetPublic.sntypeJson(typeid, id) + "}]}");
	}

	private void GetCartypeList() throws Exception {
		// TODO Auto-generated method stub
		String typeid = "";
		String id = "";

		typeid = this.request.getParameter("typeid");
		id = this.request.getParameter("id");
		if (typeid == null) {
			typeid = "";
		}
		if (id == null) {
			id = "";
		}
		response.getWriter().append(
				"{\"table\":[{" + GetCartype.cartypeJson(typeid, id) + "}]}");
	}

	private void GetDaytypeList() throws Exception {
		// TODO Auto-generated method stub
		String typeid = "";
		String id = "";

		typeid = this.request.getParameter("typeid");
		id = this.request.getParameter("id");
		if (typeid == null) {
			typeid = "";
		}
		if (id == null) {
			id = "";
		}
		response.getWriter().append(
				"{\"table\":[{" + GetPublic.daytypeJson(typeid, id) + "}]}");
	}

	private void GetSpeedtypeList() throws Exception {
		String typeid = "";
		String id = "";

		typeid = this.request.getParameter("typeid");
		id = this.request.getParameter("id");
		if (typeid == null) {
			typeid = "";
		}
		if (id == null) {
			id = "";
		}
		response.getWriter().append(
				"{\"table\":[{" + GetSpeedtype.cartypeJson(typeid, id) + "}]}");
	}

	private void getGetStreetList() throws Exception {
		String typeid = "";
		String id = "";

		typeid = this.request.getParameter("typeid");
		id = this.request.getParameter("id");
		if (typeid == null) {
			typeid = "";
		}
		if (id == null) {
			id = "";
		}
		response.getWriter().append(
				"{\"table\":[{" + GetLocation.streetsJson(typeid, id) + "}]}");
	}

	private void getGetAreaList() throws Exception {
		String typeid = "";
		String id = "";

		typeid = this.request.getParameter("typeid");
		id = this.request.getParameter("id");
		if (typeid == null) {
			typeid = "";
		}
		if (id == null) {
			id = "";
		}
		response.getWriter().append(
				"{\"table\":[{" + GetLocation.areasJson(typeid, id) + "}]}");
	}

	private void getGetCityList() throws Exception, Exception {
		String typeid = "";
		String id = "";

		typeid = this.request.getParameter("typeid");
		id = this.request.getParameter("id");
		if (typeid == null) {
			typeid = "";
		}
		if (id == null) {
			id = "";
		}
		response.getWriter().append(
				"{\"table\":[{" + GetLocation.cityJson(typeid, id) + "}]}");
	}

	private void getProvinceList() throws Exception {
		String typeid = "";
		String id = "";

		typeid = this.request.getParameter("typeid");
		id = this.request.getParameter("id");
		if (typeid == null) {
			typeid = "";
		}
		if (id == null) {
			id = "";
		}
		response.getWriter().append(
				"{\"table\":[{" + GetLocation.provinceJson(typeid, id) + "}]}");
	}

	private void doUserLogin() throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String nickname = this.request.getParameter("nickname");
		String username = this.request.getParameter("username");
		String password = this.request.getParameter("password");
		String result = "0";

		String sql = "SELECT * FROM  " + uservo.getTable()
				+ " where username='" + username + "'";
		comdao = new UserDAOImp();
		List<ComVo> users = comdao.select(sql);

		if (users.size() != 0) {
			result = "-1";

		}
		Iterator<?> userit = users.iterator();

		while (userit.hasNext()) {
			uservo = (UserVo) userit.next();
			System.out.println(uservo.getUsername());
			if (uservo.getNickname().equals(nickname)) {
				if (uservo.getPassword().equals(password)) {
					result = "1";
				} else {
					result = "0";
				}
			} else {
				result = "2";
			}

		}

		response.getWriter().append(
				"{\"table\":[{\"msg\":\"" + result + "\"}]}");
	}

	private void doSendReg() throws Exception {
		// TODO Auto-generated method stub
		comdao = new UserDAOImp();
		String nickname = this.request.getParameter("nickname");
		String username = this.request.getParameter("username");
		String password = this.request.getParameter("password");
		String regtime = Comm.getNowTime();
		// response.getWriter().append(regtime);
		String result = "0";
		String sql = "SELECT * FROM  " + uservo.getTable()
				+ " where username='" + username + "'";
		List<ComVo> users = comdao.select(sql);
		if (users.size() != 0) {
			result = "-1";

		} else {

			if (!nickname.equals("")) {
				if (!password.equals("")) {
					uservo.setUsername(username);
					uservo.setPassword(password);
					uservo.setNickname(nickname);
					uservo.setRegtime(regtime);
					result = String.valueOf(comdao.save(uservo));
				} else {
					result = "3";
				}
			} else {
				result = "2";
			}

		}

		response.getWriter().append(
				"{\"table\":[{\"msg\":\"" + result + "\"}]}");
	}
	
	public void doSendReg_ex() throws Exception {
		// TODO Auto-generated method stub
		comdao = new UserDAOImp();
		String nickname = this.request.getParameter("nickname");
		String username = this.request.getParameter("username");
		String password = this.request.getParameter("password");
		String regtime = Comm.getNowTime();
		// response.getWriter().append(regtime);
		String result = "0";
		String sql = "SELECT * FROM  " + uservo.getTable()
				+ " where username='" + username + "'";
		List<ComVo> users = comdao.select(sql);
		if (users.size() != 0) {
		 	result = "-1";
		 	throw new UserAlreadyExistEx("-1,UserAlreadyExistEx");

		} else {

			if (!nickname.equals("")) {
				if (!password.equals("")) {
					uservo.setUsername(username);
					uservo.setPassword(password);
					uservo.setNickname(nickname);
					uservo.setRegtime(regtime);
					result = String.valueOf(comdao.save(uservo));
				} else {
					result = "3";
				}
			} else {
				result = "2";
			}

		}

//		response.getWriter().append(
//				"{\"table\":[{\"msg\":\"" + result + "\"}]}");
	}

	private void getCarList() throws Exception {
		
		
		// TODO Auto-generated method stub
		String page = "";
		String num = "";
		String typeid = "";
		String id = "";
		String order = "";

		page = this.request.getParameter("page");
		num = this.request.getParameter("num");
		typeid = this.request.getParameter("typeid");
		id = this.request.getParameter("id");
		order = this.request.getParameter("order");

		if (page == null) {
			page = "1";
		}
		if (num == null) {
			num = "20";
		}
		if (typeid == null) {
			typeid = "";
		}
		if (order == null) {
			order = "desc";
		}
		if (id == null) {
			id = "";
		}

		response.getWriter().append(
				"{\"table\":[{"
						+ GetCarList.carJson(typeid, id, page, num, order)
						+ "}],\"page\":\"" + page + "\"}");
	}
@Deprecated
	private void doSendLogin() throws Exception {
		// TODO Auto-generated method stub
		comdao = new UserDAOImp();
		String username = this.request.getParameter("username");
		String u_password = Comm.createCode();
		// response.getWriter().append(u_password);
		String result = "0";
		String sql = "SELECT * FROM  " + uservo.getTable()
				+ " where username='" + username + "'";
		List<ComVo> users = comdao.select(sql);
		if (users.size() != 0) {
			uservo.setUsername(username);
			uservo.setU_password(u_password);

			// String
			// intosql="UPDATE hx_members SET  u_password =  '"+u_password+"' WHERE   username  ='"+username+"' ;";
			// user.select(intosql);
			result = String.valueOf(comdao.update(uservo));

		} else {
			result = "0";
		}

		response.getWriter().append(
				"{\"table\":[{\"msg\":\"" + result + "\"}]}");
	}

	private void doLogin() throws Exception {
		// TODO Auto-generated method stub
		String username = this.request.getParameter("username");
		String password = this.request.getParameter("password");
		String u_password = this.request.getParameter("u_password");

		String sql = "SELECT * FROM  " + uservo.getTable()
				+ " where username='" + username + "'";
		comdao = new UserDAOImp();
		List<ComVo> users = comdao.select(sql);
		Iterator<?> userit = users.iterator();
		String result = "0";

		while (userit.hasNext()) {
			uservo = (UserVo) userit.next();
			System.out.println(uservo.getUsername());
			if (uservo.getU_password().equals(u_password)) {
				if (uservo.getPassword().equals(password)) {
					result = "1";
				} else {
					result = "0";
				}
			} else {
				result = "-1";
			}

		}

		response.getWriter().append(
				"{\"table\":[{\"msg\":\"" + result + "\"}]}");

	}
	
	public void doLogin_ex() throws Exception {
		// TODO Auto-generated method stub
		String username = this.request.getParameter("username");
		String password = this.request.getParameter("password");
		String u_password = this.request.getParameter("u_password");

		String sql = "SELECT * FROM  " + uservo.getTable()
				+ " where username='" + username + "'";
		comdao = new UserDAOImp();
		List<ComVo> users = comdao.select(sql);
		Iterator<?> userit = users.iterator();
		String result = "0";

		while (userit.hasNext()) {
			uservo = (UserVo) userit.next();
			System.out.println(uservo.getUsername());
		 
				if (uservo.getPassword().equals(password)) {
					result = "1";
					return;
					
				} else {
					result = "0";
					throw new PwdErrEx(" 0,PwdErrEx");
				}
			 

		}
	result = "-1";
	throw new UserNotExistEx(" -1,UserNotExistEx");
//		response.getWriter().append(
//				"{\"table\":[{\"msg\":\"" + result + "\"}]}");

	}

}
