package com.kunpeng.www.comm;

import java.util.Iterator;
import java.util.List;

import com.kunpeng.www.dao.ComDAO;
import com.kunpeng.www.dao.DaytypeDAO;
import com.kunpeng.www.dao.UserDAOImp;
import com.kunpeng.www.domain.ComVo;
import com.kunpeng.www.domain.DaytypeVo;
import com.kunpeng.www.domain.UserVo;

public class GetUser {
	private static ComDAO comdao;
	private static String json = "";
	private static String sql;
	public static String userJson(String typeid, String id) throws Exception{
		comdao = new UserDAOImp();
		UserVo commvo = new UserVo();
		json = "";
		if (typeid.equals("")) {
			sql = "SELECT * FROM  `" + commvo.getTable() + "`";
		} else {
			sql = "SELECT * FROM  `" + commvo.getTable() + "` WHERE  `"
					+ typeid + "` =  '" + id + "'";
		}
		try {
		List<ComVo> commlist = comdao.select(sql);
		Iterator<?> comms = commlist.iterator();
		while (comms.hasNext()) {
			commvo = (UserVo) comms.next();
			json = json + "{\"id\":\"" + commvo.getId() + "\",\"username\":\""
					+ commvo.getUsername() + "\",\"nickname\":\""
					+ commvo.getNickname() + "\",\"photo\":\""
					+ commvo.getPhoto() + "\",\"email\":\""
					+ commvo.getEmail() + "\",\"sex\":\""
					+ commvo.getSex() + "\",\"status\":\""
					+ commvo.getStatus() + "\",\"regtime\":\""
					+ commvo.getRegtime() + "\",\"latitude\":\""
					+ commvo.getLatitude() + "\",\"longitude\":\""
					+ commvo.getLongitude() + "\"},";
		}
			json = json.substring(0, json.length() - 1);
		} catch (Exception e) {
			json = "";
		}
		json = "\"user\":[" + json + "]";
		return json;
	}
}
