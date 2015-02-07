package com.kunpeng.www.comm;

import java.util.Iterator;
import java.util.List;

import com.kunpeng.www.dao.CarDAOImp;
import com.kunpeng.www.dao.ComDAO;
import com.kunpeng.www.dao.SpeedtypeDAO;
import com.kunpeng.www.domain.CarVo;
import com.kunpeng.www.domain.ComVo;
import com.kunpeng.www.domain.SpeedtypeVo;

public class GetCarList {
	private static ComDAO comdao;
	private static String json = "";
	private static String sql;

	public static String carJson(String typeid, String id, String page,
			String num,String order) throws Exception {
				return "";
//		int npage=1;
//		try {
//			 npage=Integer.valueOf(page);
//			 if(npage<1)
//			 {
//				 npage=1; 
//			 }
//		} catch (Exception e) {
//			npage=1;
//		}
//		int nums=20;
//		try {
//			nums=Integer.valueOf(num);
//			 if(nums<1)
//			 {
//				 nums=20; 
//			 }
//		} catch (Exception e) {
//			nums=20;
//		}
//		if(order.equals("") || order==null)
//		{
//			order="desc";
//		}
//		
//		comdao = new CarDAOImp();
//		CarVo car = new CarVo();
//		json = "";
//		if(typeid.equals("") || typeid==null){
//			sql = "SELECT * FROM  `" + car.getTable() + "` order by id "+order +"  LIMIT "+(npage-1)*nums+","+nums;
//		}else{
//			sql = "SELECT * FROM  `" + car.getTable() + "` WHERE  `" + typeid
//					+ "` =  '" + id + "' "+ " order by id "+order +" LIMIT "+(npage-1)*nums+","+nums ;
//		}
	
		
//		try {
//		List<ComVo> citylist = comdao.select(sql);
//		Iterator<?> citys = citylist.iterator();
//		while (citys.hasNext()) {
//			car = (CarVo) citys.next();
//			json = json + "{\"id\":\"" + car.getId() + "\",\"name\":\""
//					+ car.getName() + "\",\"pailiang\":\""
//					+ car.getPailiang() + "\","
//					+"\"is_use\":\""+ car.getIs_use() + "\","+""
//					+"@brandid@:#brdid,".replaceAll("@", "\"").replaceAll("#brdid", car.);
//					+"\"seller_note\":\""
//					+ car.getSeller_note() + "\",\"hometown\":\""
//					+ car.getHometown() + "\",\"workplace\":\""
//					+ car.getWorkplace() + "\",\"sn\":\""
//					+ car.getSn() + "\",\"price\":\""
//					+ car.getPrice() + "\","
//					+  GetPublic.daytypeJson("id", car.getPrice_name()) + ","
//					+  GetUser.userJson("id", car.getCustomer_id()) + ","
//					+  GetTalk.talkListJson("car_id", car.getId()) + ","
//					+  GetSpeedtype.cartypeJson("id", car.getSpeedtype()) + ","
//					+  GetCartype.cartypeJson("id", car.getCartype()) + ","
//					+  GetCarPic.PicListJson("car_id", car.getId())  + ","
//					+  GetLocation.provinceJson("id", car.getProvince_id())  + ","
//					+  GetLocation.cityJson("id", car.getCity_id())  + ","
//					+  GetLocation.areasJson("id", car.getArea_id())  + ","
//					+  GetLocation.streetsJson("id", car.getStreet_id())  + ","
//					+ GetPublic.sntypeJson("id", car.getSn_id())+ "},";
//		}
//			json = json.substring(0, json.length() - 1);
//		} catch (Exception e) {
//			json = "";
//		}
//		json = "\"cars\":[" + json + "]";
//		return json;
	}
	
	public static String carJson(String typeid, String id, String page,
			String num) throws Exception {
		int npage=1;
		try {
			 npage=Integer.valueOf(page);
			 if(npage<1)
			 {
				 npage=1; 
			 }
		} catch (Exception e) {
			npage=1;
		}
		int nums=20;
		try {
			nums=Integer.valueOf(num);
			 if(nums<1)
			 {
				 nums=20; 
			 }
		} catch (Exception e) {
			nums=20;
		}
		
		comdao = new CarDAOImp();
		CarVo car = new CarVo();
		json = "";
		if(typeid.equals("")){
			sql = "SELECT * FROM  `" + car.getTable() + "`  LIMIT "+(npage-1)*nums+","+nums ;
		}else{
			sql = "SELECT * FROM  `" + car.getTable() + "` WHERE  `" + typeid
					+ "` =  '" + id + "' LIMIT "+(npage-1)*nums+","+nums ;
		}
	
		List<ComVo> citylist = comdao.select(sql);
		Iterator<?> citys = citylist.iterator();
		while (citys.hasNext()) {
			car = (CarVo) citys.next();
			json = json + "{\"id\":\"" + car.getId() + "\",\"name\":\""
					+ car.getName() + "\",\"pailiang\":\""
					+ car.getPailiang() + "\",\"is_use\":\""
					+ car.getIs_use() + "\",\"seller_note\":\""
					+ car.getSeller_note() + "\",\"hometown\":\""
					+ car.getHometown() + "\",\"workplace\":\""
					+ car.getWorkplace() + "\",\"sn\":\""
					+ car.getSn() + "\",\"price\":\""
					+ car.getPrice() + "\","
					+  GetPublic.daytypeJson("id", car.getPrice_name()) + ","
					+  GetUser.userJson("id", car.getCustomer_id()) + ","
					+  GetTalk.talkListJson("car_id", car.getId()) + ","
					+  GetSpeedtype.cartypeJson("id", car.getSpeedtype()) + ","
					+  GetCartype.cartypeJson("id", car.getCartype()) + ","
					+  GetCarPic.PicListJson("car_id", car.getId())  + ","
					+  GetLocation.provinceJson("id", car.getProvince_id())  + ","
					+  GetLocation.cityJson("id", car.getCity_id())  + ","
					+  GetLocation.areasJson("id", car.getArea_id())  + ","
					+  GetLocation.streetsJson("id", car.getStreet_id())  + ","
					+ GetPublic.sntypeJson("id", car.getSn_id())+ "},";
		}
		try {
			json = json.substring(0, json.length() - 1);
		} catch (Exception e) {
			json = "";
		}
		json = "\"cars\":[" + json + "]";
		return json;
	}
}

