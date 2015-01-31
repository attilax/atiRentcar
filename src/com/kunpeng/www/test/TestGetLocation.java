package com.kunpeng.www.test;

import com.kunpeng.www.comm.GetCarPic;
import com.kunpeng.www.comm.GetLocation;
import com.kunpeng.www.comm.GetTalk;

public class TestGetLocation {
	public static void main(String[] args) throws Exception {
		String json = GetLocation.cityJson("", "");
		System.out.println(json);
		
		System.out.println(GetLocation.provinceJson("id", "2"));
		System.out.println(GetLocation.areasJson("id", "2"));
		System.out.println(GetLocation.streetsJson("id", "2"));
		
		System.out.println(GetTalk.talkListJson("car_id", "2"));
		System.out.println(GetCarPic.PicListJson("car_id", "0"));
	}
}
