package com.kunpeng.www.comm;

import java.util.Iterator;
import java.util.List;

import com.kunpeng.www.dao.CartypeDAO;
import com.kunpeng.www.dao.ComDAO;
import com.kunpeng.www.dao.SpeedtypeDAO;
import com.kunpeng.www.domain.CartypeVo;
import com.kunpeng.www.domain.ComVo;
import com.kunpeng.www.domain.SpeedtypeVo;

public class GetSpeedtype {
	private static ComDAO comdao;
	private static String json="";
	private static String sql;
	
	public static String cartypeJson(String typeid,String id) throws Exception{
		comdao = new SpeedtypeDAO();
		SpeedtypeVo cartype=new SpeedtypeVo();
		json="";
		if (typeid.equals("")) {
			sql = "SELECT * FROM  `" + cartype.getTable() + "`";
		} else {
			sql="SELECT * FROM  `"+cartype.getTable()+"` WHERE  `"+typeid+"` =  '"+id+"'";
		}
		try {
		List<ComVo> citylist = comdao.select(sql);
		Iterator<?> citys = citylist.iterator();
		while(citys.hasNext()){
			cartype=(SpeedtypeVo)citys.next();
			json=json+"{\"id\":\""+cartype.getId()+"\",\"name\":\""+cartype.getName()+"\"},";
		}
			json = json.substring(0, json.length() - 1);
		} catch (Exception e) {
			json = "";
		}
		json="\"speedtypes\":["+json+"]";
		return json;
	}
}
