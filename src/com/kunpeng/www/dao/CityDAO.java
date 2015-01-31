package com.kunpeng.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kunpeng.www.db.DBConneConfig;
import com.kunpeng.www.domain.CarVo;
import com.kunpeng.www.domain.CityVo;
import com.kunpeng.www.domain.ComVo;

public class CityDAO implements ComDAO {
	private DBConneConfig dbconn;
	protected Connection conn = null;
	protected Statement stme = null;
	protected ResultSet rs = null;
	protected PreparedStatement pstm = null;
	public CityDAO() throws Exception {
		dbconn = new DBConneConfig();
	}
	
	@Override
	public int save(ComVo e) throws Exception {
		// TODO Auto-generated method stub
		return 0;
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
			CityVo city = new CityVo();
			city.setId(String.valueOf(rs.getInt("id")));
			city.setName(rs.getString("name"));
			city.setStatus(rs.getString("status"));
			city.setLongitude(rs.getString("longitude"));
			city.setLatitude(rs.getString("latitude"));
			city.setProvince_id(rs.getString("province_id"));
			list.add(city);
		}
		// dbconn.closeResult();
		rs.close();
		dbconn.closeConn();
		return list;
	}

}
