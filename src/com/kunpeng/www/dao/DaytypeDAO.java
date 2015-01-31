package com.kunpeng.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kunpeng.www.db.DBConneConfig;
import com.kunpeng.www.domain.ComVo;
import com.kunpeng.www.domain.DaytypeVo;
import com.kunpeng.www.domain.ProvinceVo;

public class DaytypeDAO implements ComDAO {
	private DBConneConfig dbconn;
	protected Connection conn = null;
	protected Statement stme = null;
	protected ResultSet rs = null;
	protected PreparedStatement pstm = null;
	public DaytypeDAO() throws Exception {
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
			DaytypeVo daytype = new DaytypeVo();
			daytype.setId(String.valueOf(rs.getInt("id")));
			daytype.setName(rs.getString("name"));
			daytype.setTypename(rs.getString("typename"));
			list.add(daytype);
		}
		// dbconn.closeResult();
		rs.close();
		dbconn.closeConn();
		return list;
	}

}
