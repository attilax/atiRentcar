package com.kunpeng.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kunpeng.www.db.DBConneConfig;
import com.kunpeng.www.domain.ComVo;
import com.kunpeng.www.domain.SpeedtypeVo;
import com.kunpeng.www.domain.TalkVo;
import com.kunpeng.www.domain.UserVo;

public class TalkDAO implements ComDAO {

	private DBConneConfig dbconn;
	protected Connection conn = null;
	protected Statement stme = null;
	protected ResultSet rs = null;
	protected PreparedStatement pstm = null;
	public TalkDAO() throws Exception {
		dbconn = new DBConneConfig();
	}
	@Override
	public int save(ComVo e) throws Exception {
		// TODO Auto-generated method stub
		int result = 0;
		TalkVo talk = (TalkVo)e;
		String sql = "insert into " + talk.getTable()
				+ " (car_id,user_id,content,addtime) values(?,?,?,?)";
		conn = dbconn.getConn();
		pstm = conn.prepareStatement(sql);
		pstm.setString(1, talk.getCar_id());
		pstm.setString(2, talk.getUser_id());
		pstm.setString(3, talk.getContent());
		pstm.setString(4, talk.getAddtime());
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
			TalkVo talk = new TalkVo();
			talk.setId(String.valueOf(rs.getInt("id")));
			talk.setCar_id(rs.getString("car_id"));
			talk.setUser_id(rs.getString("user_id"));
			talk.setContent(rs.getString("content"));
			list.add(talk);
		}
		// dbconn.closeResult();
		rs.close();
		dbconn.closeConn();
		return list;
	}

}
