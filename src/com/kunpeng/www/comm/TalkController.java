package com.kunpeng.www.comm;

import com.kunpeng.www.dao.CarpicDAO;
import com.kunpeng.www.dao.ComDAO;
import com.kunpeng.www.dao.TalkDAO;
import com.kunpeng.www.domain.TalkVo;

public class TalkController {
	private static ComDAO comdao;
	private static String json = "";
	private static String sql;
	
	public static String saveTalk(String typeid, String id,String user_id,String content,String addtime)
			throws Exception {
		
		comdao = new TalkDAO();
		TalkVo talk = new TalkVo();
		talk.setUser_id(user_id);
		talk.setCar_id(id);
		talk.setContent(content);
		talk.setAddtime(addtime);
		int result= comdao.save(talk);
		json="{\"table\":[{\"msg\":\"" + result + "\"}]}";
		return json;
	}
}
