/**
 * 
 */
package com.attilax.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import www.attilax.lang.getConnEx;

import com.attilax.core;
import com.attilax.io.pathx;
import com.attilax.util.PropX;
 
 

/**
 * @author ASIMO
 *
 */
public class DbutilX {

	/**
	@author attilax 老哇的爪子
	@since   p1p g_r_w
	 
	 */
	public static void main(String[] args) {
		 String sql = " SELECT * FROM `mall_shop_info` sp left join  mall_user_info  ui on  sp.user_id=ui.user_id where sp.user_id=8 ";
		//  sql= " update mall_shop_info set shop_intro='myintro5' where shop_id=8 ";
		//  sql=sql+" ; update  mall_user_info set  user_mobile='1358891563'    where user_id=8 ";
sql="SELECT * FROM  mall_user_info   where  user_id=6 ; SELECT * FROM  mall_user_info   where  user_id=8 ";
		 
		 DbutilX c=new DbutilX();
	//	 System.out.println(c.update(sql));
	 	 List li=c.findBySql(sql);
		 
		  System.out.println(core.toJsonStrO88(li));
		 System.out.println("--f");

	}
	
	public Connection getConnection() throws getConnEx {
		// com.microsoft.sqlserver.jdbc.SQLServerDriver
		String path = pathx.classPath() + "/website.properties";
		System.out.println(PropX.getConfig(path, "jdbc.url"));
		try {

			Class.forName(PropX.getConfig(path, "jdbc.driverClassName"));
		} catch (ClassNotFoundException e) {
			throw new getConnEx("getconnex" + e.getMessage());
		}
		Connection conn;
		try {
			conn = DriverManager.getConnection(
					PropX.getConfig(path, "jdbc.url"),
					PropX.getConfig(path, "jdbc.username"),
					PropX.getConfig(path, "jdbc.password"));
		} catch (SQLException e) {
			throw new getConnEx("getconnex" + e.getMessage());
		}
		return conn;
	}
	
	
	public List findBySql(String sql)  {
		Connection conn;
		 try{
			conn = getConnection();

			// 创建一个QueryRunner
			QueryRunner queryRunner = new QueryRunner(true);
			List<Map<String, Object>> list;

			list = queryRunner.query(conn,
					sql,
					new MapListHandler());
		 
			return list;
	 
		 }
		catch (Exception e) {

			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}
	
	public int update(String sql)  {
		Connection conn;
		 try{
			conn = getConnection();

			// 创建一个QueryRunner
			QueryRunner queryRunner = new QueryRunner(true);
			int list;

			list = queryRunner.update(conn, sql);
		 
			return list;
	 
		 }
		catch (Exception e) {

			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}


}
