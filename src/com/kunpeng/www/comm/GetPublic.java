package com.kunpeng.www.comm;

import java.util.Iterator;
import java.util.List;

import com.kunpeng.www.dao.CityDAO;
import com.kunpeng.www.dao.ComDAO;
import com.kunpeng.www.dao.DaytypeDAO;
import com.kunpeng.www.dao.SntypeDAO;
import com.kunpeng.www.dao.TypemoneyDAO;
import com.kunpeng.www.domain.CityVo;
import com.kunpeng.www.domain.ComVo;
import com.kunpeng.www.domain.DaytypeVo;
import com.kunpeng.www.domain.SntypeVo;
import com.kunpeng.www.domain.TypemoneyVo;

public class GetPublic {
	private static ComDAO comdao;
	private static String json = "";
	private static String sql;

	public static String daytypeJson(String typeid, String id) throws Exception {
		comdao = new DaytypeDAO();
		DaytypeVo commvo = new DaytypeVo();
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
			commvo = (DaytypeVo) comms.next();
			json = json + "{\"id\":\"" + commvo.getId() + "\",\"name\":\""
					+ commvo.getName() + "\",\"typename\":\""
					+ commvo.getTypename() + "\"},";
		}
			json = json.substring(0, json.length() - 1);
		} catch (Exception e) {
			json = "";
		}
		json = "\"daytypes\":[" + json + "]";
		return json;
	}

	public static String sntypeJson(String typeid, String id) throws Exception {
		comdao = new SntypeDAO();
		SntypeVo commvo = new SntypeVo();
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
			commvo = (SntypeVo) comms.next();
			json = json + "{\"id\":\"" + commvo.getId() + "\",\"name\":\""
					+ commvo.getName() + "\",\"typename\":\""
					+ commvo.getTypename() + "\"},";
		}
			json = json.substring(0, json.length() - 1);
		} catch (Exception e) {
			json = "";
		}
		json = "\"sntypes\":[" + json + "]";
		return json;
	}

	public static String typemoneyJson(String typeid, String id)
			throws Exception {
		comdao = new TypemoneyDAO();
		TypemoneyVo commvo = new TypemoneyVo();
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
			commvo = (TypemoneyVo) comms.next();
			json = json + "{\"id\":\"" + commvo.getId() + "\",\"car_id\":\""
					+ commvo.getCar_id() + "\",\"daytype_id\":\""
					+ commvo.getDaytype_id() + "\",\"pice\":\""
					+ commvo.getPice() + "\"},";
		}
			json = json.substring(0, json.length() - 1);
		} catch (Exception e) {
			json = "";
		}
		json = "\"typemoneys\":[" + json + "]";
		return json;
	}
}
