package com.kunpeng.www.db;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnAccess implements DBConnInte {

	public static final String DBDRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";

	public static Connection conn = null;

	public ResultSet rs = null;

	@Override
	public Connection getConn(String url, String user, String password,
			String dbname) {
		// String driverClass="sun.jdbc.odbc.JdbcOdbcDriver";
		URL url2 = DBConnAccess.class.getResource("db.mdb");
		String path = url2.getPath().replaceAll("%20", " ")
				.replaceFirst("/", "");
		String strconn = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ="
				+ path;

		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�������ݿ�ʧ��");
		}
		try {
			conn = DriverManager.getConnection(strconn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�������ݿ�ʧ��");
		}

		return conn;
	}

	@Override
	public ResultSet getResult(String sql) {
		try {
			java.sql.Statement sm = conn.createStatement();
			rs = sm.executeQuery(sql);// ��ѯ�������rs
			rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("��ȡ���ݳ���");
		}

		return rs;
	}

	@Override
	public boolean runSql(String sql) {
		boolean flat = false;
		try {
			java.sql.Statement sm = conn.createStatement();
			sm.execute(sql);// ִ��
			flat = true;

			System.out.println("ִ��sql�ɹ�");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ִ��sql����");
		}
		return flat;
	}

	@Override
	public void closeResult() {
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void closeConn() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public DBConnAccess(String url, String user, String password, String dbname) {
		// TODO Auto-generated constructor stub
	//	getConn(url, user, password, dbname);

	}
}
