package com.kunpeng.www.test;

import com.kunpeng.www.comm.GetCarList;
import com.kunpeng.www.comm.GetPublic;

public class TestCarList {
public static void main(String[] args) throws Exception {
	System.out.println(GetCarList.carJson("", "", "1", "2","desc")); 
	
	/*System.out.println(GetPublic.daytypeJson("", ""));
	System.out.println(GetPublic.sntypeJson("", ""));
	System.out.println(GetPublic.typemoneyJson("", ""));*/
}
}
