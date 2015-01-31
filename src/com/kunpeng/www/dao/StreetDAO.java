package com.kunpeng.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kunpeng.www.db.DBConneConfig;
import com.kunpeng.www.domain.AreasVo;
import com.kunpeng.www.domain.ComVo;
import com.kunpeng.www.domain.StreetsVo;

public class StreetDAO implements ComDAO {
	private DBConneConfig dbconn;
	protected Connection conn = null;
	protected Statement stme = null;
	protected ResultSet rs = null;
	protected PreparedStatement pstm = null;
	public StreetDAO() throws Exception {
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
			StreetsVo streets = new StreetsVo();
			streets.setId(String.valueOf(rs.getInt("id")));
			streets.setName(rs.getString("name"));
			streets.setLongitude(rs.getString("longitude"));
			streets.setLatitude(rs.getString("latitude"));
			streets.setArea_id(rs.getString("area_id"));
			list.add(streets);
		}
		// dbconn.closeResult();
		rs.close();
		dbconn.closeConn();
		return list;
	}

}
