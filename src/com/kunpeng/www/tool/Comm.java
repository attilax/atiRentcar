package com.kunpeng.www.tool;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Comm {
	
	//产生随机验证码
	public static String createCode(){
		
		int ran1=new Random().nextInt(9);
		int ran2=new Random().nextInt(9);
		int ran3=new Random().nextInt(9);
		int ran4=new Random().nextInt(9);
		
		return ""+ran1+""+ran2+""+ran3+""+ran4;
	}
	public static String getNowTime(){
		String fDate="2015-01-11";
		// 获取当前时间
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
			fDate=sd.format(date);
			return fDate;
	}
	public static String getPicName(){
		String fDate="2015-01-11";
		// 获取当前时间
			SimpleDateFormat sd = new SimpleDateFormat("yyyyMMddhhmmss");
			Date date = new Date();
			fDate=sd.format(date);
			return fDate;
	}
	
}
