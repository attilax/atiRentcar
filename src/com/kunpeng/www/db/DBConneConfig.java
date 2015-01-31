package com.kunpeng.www.db;

import java.sql.Connection;
import java.sql.ResultSet;

import com.kunpeng.www.config.DBXMLTool;
import com.kunpeng.www.domain.DBVo;

public class DBConneConfig  {
    private DBConnInte dbconn;
    private DBVo dbvo=new DBVo();
    public DBConneConfig() throws Exception {
    	String type="mysql";
    	DBXMLTool xmltool=new DBXMLTool(type);
    	 dbvo=xmltool.getDbDao();
    	if(type.equals("mysql"))
    	{
    		dbconn=new DBConnMysql(dbvo.getUrl(), dbvo.getUser(), dbvo.getPassword(), dbvo.getDbname());
    	}else
    	{
    		dbconn=new DBConnAccess(dbvo.getUrl(), dbvo.getUser(), dbvo.getPassword(), dbvo.getDbname());
    	}
    	
	}
    
	public Connection getConn() {
		// TODO Auto-generated method stub
		
		return dbconn.getConn(dbvo.getUrl(), dbvo.getUser(), dbvo.getPassword(), dbvo.getDbname());
	}

	 
	public ResultSet getResult(String sql) {
		// TODO Auto-generated method stub
		return dbconn.getResult(sql);
	}

	public boolean runSql(String sql) {
		// TODO Auto-generated method stub
		return dbconn.runSql(sql);
	}

	public void closeResult() {
		// TODO Auto-generated method stub
		dbconn.closeResult();
	}

	public void closeConn() {
		// TODO Auto-generated method stub
		dbconn.closeConn();
	}

}
