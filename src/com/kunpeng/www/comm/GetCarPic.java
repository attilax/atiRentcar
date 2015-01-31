package com.kunpeng.www.comm;

import java.util.Iterator;
import java.util.List;

import com.kunpeng.www.dao.CarpicDAO;
import com.kunpeng.www.dao.ComDAO;
import com.kunpeng.www.dao.TalkDAO;
import com.kunpeng.www.domain.CarPicVo;
import com.kunpeng.www.domain.ComVo;
import com.kunpeng.www.domain.TalkVo;

public class GetCarPic {
	private static ComDAO comdao;
	private static String json = "";
	private static String sql;

	public static String PicListJson(String typeid, String id) throws Exception {
		json = "";
		comdao = new CarpicDAO();
		CarPicVo carpic = new CarPicVo();
		
		if (typeid.equals("")) {
			sql = "SELECT * FROM  `" + carpic.getTable() + "`";
		} else {
			sql = "SELECT * FROM  `" + carpic.getTable() + "` WHERE  `"
					+ typeid + "` =  '" + id + "'";
		}
		try {
		List<ComVo> carpiclist = comdao.select(sql);
		Iterator<?> carpics = carpiclist.iterator();
		while (carpics.hasNext()) {
			carpic = (CarPicVo) carpics.next();
			json = json + "{\"id\":\"" + carpic.getId() + "\",\"car_id\":\""
					+ carpic.getCar_id() + "\",\"picname\":\""
					+ carpic.getPicname() + "\",\"picurl\":\""
					+ carpic.getPicurl() + "\"},";
		}

		
			json = json.substring(0, json.length() - 1);
		} catch (Exception e) {
			json = "";
		}

		json = "\"carpics\":[" + json + "]";

		return json;
	}
}
