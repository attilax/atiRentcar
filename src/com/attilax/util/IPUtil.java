package com.attilax.util;

public class IPUtil {

	public static boolean isInternalIp(String ipAddress){    
        boolean isInnerIp = false;    
        long ipNum = getIpNum(ipAddress);    
        /**   
        私有IP：

               A类  10.0.0.0-10.255.255.255   
               B类  172.16.0.0-172.31.255.255   
               C类  192.168.0.0-192.168.255.255   
        **/   
        long aBegin = getIpNum("10.0.0.0");    
        long aEnd = getIpNum("10.255.255.255");    
        long bBegin = getIpNum("172.16.0.0");    
        long bEnd = getIpNum("172.31.255.255");    
        long cBegin = getIpNum("192.168.0.0");    
        long cEnd = getIpNum("192.168.255.255");    
        isInnerIp = isInnerIp(ipNum,aBegin,aEnd) || isInnerIp(ipNum,bBegin,bEnd) || isInnerIp(ipNum,cBegin,cEnd) || ipAddress.equals("127.0.0.1");   //访问本地localhost获取为127.0.0.1
        return isInnerIp;               
	}  
	
	private static long getIpNum(String ipAddress) {    
	     String [] ip = ipAddress.split("\\.");    
	     long a = Integer.parseInt(ip[0]);    
	     long b = Integer.parseInt(ip[1]);    
	     long c = Integer.parseInt(ip[2]);    
	     long d = Integer.parseInt(ip[3]);    
	    
	     long ipNum = a * 256 * 256 * 256 + b * 256 * 256 + c * 256 + d;    
	     return ipNum;    
	}  
	
	private static boolean isInnerIp(long userIp,long begin,long end){    
	      return (userIp>=begin) && (userIp<=end);    
}
}
