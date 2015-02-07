<%@page import="com.attilax.api.ApiX2"%>
<%@page import="com.attilax.cfg.ApiInier"%>
<%@page import="www.Hbx4shp"%>
<%@page import="com.attilax.api.ApiX"%>
<%@page import="com.attilax.cfg.IocX"%>
<%@page import="com.attilax.api.HandlerChain"%>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*"   %>
<%
new ApiInier().ini();
ApiX2 ax= IocX.getBean(ApiX2.class);
//ax.hbx=Hbx4shp.getStance();
 %>
<%=ax.handleReq(request)%>