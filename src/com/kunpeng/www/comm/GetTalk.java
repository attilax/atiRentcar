package com.kunpeng.www.comm;

import java.util.Iterator;
import java.util.List;

import com.kunpeng.www.dao.ComDAO;
import com.kunpeng.www.dao.TalkDAO;
import com.kunpeng.www.domain.ComVo;
import com.kunpeng.www.domain.TalkVo;

public class GetTalk {
	private static ComDAO comdao;
	private static String json = "";
	private static String sql;

	public static String talkListJson(String typeid, String id)
			throws Exception {
		json = "";
		comdao = new TalkDAO();
		TalkVo talk = new TalkVo();
		sql = "SELECT * FROM  `" + talk.getTable() + "` WHERE  `" + typeid
				+ "` =  '" + id + "'";
		try {
		List<ComVo> talklist = comdao.select(sql);
		Iterator<?> talks = talklist.iterator();
		while (talks.hasNext()) {
			talk = (TalkVo) talks.next();
			json = json + "{\"id\":\"" + talk.getId() + "\",\"car_id\":\""
					+ talk.getCar_id() + "\",\"content\":\"" + talk.getContent()
					+ "\",\"user_id\":\"" + talk.getUser_id()
					+ "\",\"addtime\":\"" + talk.getAddtime() + "\"},";
		}
		
			json = json.substring(0, json.length() - 1);
		} catch (Exception e) {
			json = "";
		}
		json = "\"talks\":[" + json + "]";

		return json;
	}
}
