package com.kunpeng.www.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnMysql implements DBConnInte {
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	// ����MySQL���ݿ�����ӵ�ַ
	// public static final String url = "jdbc:mysql://localhost:3306/zzzz";
	// MySQL���ݿ�������û���
	// public static final String user = "root";
	// MySQL���ݿ����������
	// public static final String password = "";
	public static Connection conn = null;
	public ResultSet rs = null;

	@Override
	public Connection getConn(String url, String user, String password,
			String dbname) {
		String dburl = "jdbc:mysql://" + url + "/" + dbname+"?zeroDateTimeBehavior=convertToNull&useUnicode=true&characterEncoding=utf8&allowMultiQueries=true";
//		System.out.println(dburl);
//		System.out.println("user:"+user+" password:"+password );
		
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�������ݿ�ʧ��");
		}
		try {
			conn = DriverManager.getConnection(dburl, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�������ݿ�ʧ��");
		}
//		 System.out.println(conn) ;  // �����ʱ���Դ�ӡ��ʾ��������
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

	public DBConnMysql(String url, String user, String password, String dbname) {

	//	getConn(url, user, password, dbname);

	}
}
