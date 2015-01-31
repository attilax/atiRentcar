package com.kunpeng.www.comm;

import java.util.Iterator;
import java.util.List;

import com.kunpeng.www.dao.AreaDAO;
import com.kunpeng.www.dao.CityDAO;
import com.kunpeng.www.dao.ComDAO;
import com.kunpeng.www.dao.ProvinceDAO;
import com.kunpeng.www.dao.StreetDAO;
import com.kunpeng.www.domain.AreasVo;
import com.kunpeng.www.domain.CityVo;
import com.kunpeng.www.domain.ComVo;
import com.kunpeng.www.domain.ProvinceVo;
import com.kunpeng.www.domain.StreetsVo;

public class GetLocation {
	private static ComDAO comdao;
	private static String json="";
	private static String sql;
	
	public static String cityJson(String typeid,String id) throws Exception{
		comdao = new CityDAO();
		CityVo city=new CityVo();
		json="";
		if(typeid.equals("")){
			sql="SELECT * FROM  `"+city.getTable()+"`";
			}else{
			sql="SELECT * FROM  `"+city.getTable()+"` WHERE  `"+typeid+"` =  '"+id+"'";
		}
		try {
		List<ComVo> citylist = comdao.select(sql);
		Iterator<?> citys = citylist.iterator();
		while(citys.hasNext()){
			city=(CityVo)citys.next();
			json=json+"{\"id\":\""+city.getId()+"\",\"name\":\""+city.getName()+"\"},";
		}
			json = json.substring(0, json.length() - 1);
		} catch (Exception e) {
			json = "";
		}
		json="\"citys\":["+json+"]";
		return json;
	}
	
	public static String provinceJson(String typeid,String id) throws Exception{
		comdao = new ProvinceDAO();
		ProvinceVo province=new ProvinceVo();
		json="";
		if(typeid.equals("")){
			sql="SELECT * FROM  `"+province.getTable()+"`";
			}else{
			sql="SELECT * FROM  `"+province.getTable()+"` WHERE  `"+typeid+"` =  '"+id+"'";
		}
		try {
		List<ComVo> provincelist = comdao.select(sql);
		Iterator<?> provinces = provincelist.iterator();
		while(provinces.hasNext()){
			province=(ProvinceVo)provinces.next();
			json=json+"{\"id\":\""+province.getId()+"\",\"name\":\""+province.getName()+"\"},";
		}
			json = json.substring(0, json.length() - 1);
		} catch (Exception e) {
			json = "";
		}
		json="\"provinces\":["+json+"]";
		return json;
	}
	public static String areasJson(String typeid,String id) throws Exception{
		comdao = new AreaDAO();
		AreasVo area=new AreasVo();
		json="";
		if(typeid.equals("")){
			sql="SELECT * FROM  `"+area.getTable()+"`";
			}else{
			sql="SELECT * FROM  `"+area.getTable()+"` WHERE  `"+typeid+"` =  '"+id+"'";
		}
		try {
		List<ComVo> arealist = comdao.select(sql);
		Iterator<?> areas = arealist.iterator();
		while(areas.hasNext()){
			area=(AreasVo)areas.next();
			json=json+"{\"id\":\""+area.getId()+"\",\"name\":\""+area.getName()+"\"},";
		}
			json = json.substring(0, json.length() - 1);
		} catch (Exception e) {
			json = "";
		}
		json="\"areas\":["+json+"]";
		return json;
	}
	
	public static String streetsJson(String typeid,String id) throws Exception{
		comdao = new StreetDAO();
		StreetsVo street=new StreetsVo();
		json="";
		if(typeid.equals("")){
			sql="SELECT * FROM  `"+street.getTable()+"`";
			}else{
			sql="SELECT * FROM  `"+street.getTable()+"` WHERE  `"+typeid+"` =  '"+id+"'";
		}
		try {
		List<ComVo> streetlist = comdao.select(sql);
		Iterator<?> streets = streetlist.iterator();
		while(streets.hasNext()){
			street=(StreetsVo)streets.next();
			json=json+"{\"id\":\""+street.getId()+"\",\"name\":\""+street.getName()+"\"},";
		}
			json = json.substring(0, json.length() - 1);
		} catch (Exception e) {
			json = "";
		}
		json="\"streets\":["+json+"]";
		return json;
	}
	
	
}
