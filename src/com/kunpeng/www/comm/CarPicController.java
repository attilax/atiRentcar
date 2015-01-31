package com.kunpeng.www.comm;

import com.kunpeng.www.dao.CarpicDAO;
import com.kunpeng.www.dao.ComDAO;
import com.kunpeng.www.dao.DaytypeDAO;
import com.kunpeng.www.domain.CarPicVo;
import com.kunpeng.www.domain.DaytypeVo;

public class CarPicController {
	
	private static ComDAO comdao;
	private static String json = "";
	private static String sql;
	
	public static void saveCarPic(String typeid, String id,String picname,String picurl) throws Exception{
		
		comdao = new CarpicDAO();
		CarPicVo commvo = new CarPicVo();
		commvo.setCar_id(id);
		commvo.setPicname(picname);
		commvo.setPicurl(picurl);
		
		comdao.save(commvo);
	}
}
