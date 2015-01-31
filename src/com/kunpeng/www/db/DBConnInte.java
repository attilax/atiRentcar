package com.kunpeng.www.db;

import java.sql.Connection;
import java.sql.ResultSet;

public interface DBConnInte {

	public abstract Connection getConn(String url, String user,
			String password, String dbname);

	public abstract ResultSet getResult(String sql);

	public abstract boolean runSql(String sql);

	public abstract void closeResult();

	public abstract void closeConn();

}