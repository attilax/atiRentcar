<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" %>
<%@page import="com.attilax.util.Uploader"%>
<%
Uploader up=new Uploader(request);
		up.uploadBase64("data");
	 
		
%>
<%=up.getUrl()%>