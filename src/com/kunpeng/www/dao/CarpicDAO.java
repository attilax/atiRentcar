package com.kunpeng.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kunpeng.www.db.DBConneConfig;
import com.kunpeng.www.domain.CarPicVo;
import com.kunpeng.www.domain.CartypeVo;
import com.kunpeng.www.domain.CityVo;
import com.kunpeng.www.domain.ComVo;

public class CarpicDAO implements ComDAO {
	private DBConneConfig dbconn;
	protected Connection conn = null;
	protected Statement stme = null;
	protected ResultSet rs = null;
	protected PreparedStatement pstm = null;
	public CarpicDAO() throws Exception {
		dbconn = new DBConneConfig();
	}
	@Override
	public int save(ComVo e) throws Exception {
		int result = 0;
		CarPicVo comdao =(CarPicVo)e;
		String sql = "insert into " + comdao.getTable()
				+ " (car_id,picname,picurl) values(?,?,?)";
		conn = dbconn.getConn();
		pstm = conn.prepareStatement(sql);
		pstm.setString(1, comdao.getCar_id());
		pstm.setString(2, comdao.getPicname());
		pstm.setString(3, comdao.getPicurl());
		result = pstm.executeUpdate();
		
		dbconn.closeConn();
		return result;
	}

	@Override
	public int update(ComVo e) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(ComVo e) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ComVo> select(String sql) throws Exception {
		List<ComVo> list = new ArrayList<ComVo>();

		conn = dbconn.getConn();
		pstm = conn.prepareStatement(sql);
		rs = pstm.executeQuery();
		while (rs.next()) {
			CarPicVo cartype = new CarPicVo();
			cartype.setId(String.valueOf(rs.getInt("id")));
			cartype.setCar_id(rs.getString("car_id"));
			cartype.setPicname(rs.getString("picname"));
			cartype.setPicurl(rs.getString("picurl"));
			list.add(cartype);
		}
		// dbconn.closeResult();
		rs.close();
		dbconn.closeConn();
		return list;
	}

}
