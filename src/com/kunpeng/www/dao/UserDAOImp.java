package com.kunpeng.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.kunpeng.www.db.DBConneConfig;
import com.kunpeng.www.domain.ComVo;
import com.kunpeng.www.domain.UserVo;

public class UserDAOImp implements ComDAO {
	private DBConneConfig dbconn; 
	protected Connection conn = null;
	protected Statement stme = null;
	protected ResultSet rs = null;
	protected PreparedStatement pstm = null;
	
	public UserDAOImp() throws Exception {
		dbconn=new DBConneConfig();
	}
	
	@Override
	public int save(ComVo e) throws Exception {
		// TODO Auto-generated method stub
		int result = 0;
		UserVo user= (UserVo)e;
		String sql = "insert into " + user.getTable()
				+ " (nickname,username,password,regtime) values(?,?,?,?)";
		
		conn = dbconn.getConn();
		pstm = conn.prepareStatement(sql);
		pstm.setString(1, user.getNickname());
		pstm.setString(2, user.getUsername());
		pstm.setString(3, user.getPassword());
		pstm.setString(4, user.getRegtime());
		result = pstm.executeUpdate();
		
		dbconn.closeConn();
		return result;
	}

	@Override
	public int update(ComVo e) throws Exception {
		// TODO Auto-generated method stub
		int result = 0;
		UserVo user= (UserVo)e;
		String  sql="UPDATE "+user.getTable()+" SET  u_password =  ? WHERE   username  ='"+user.getUsername()+"' ;";
		conn = dbconn.getConn();
		pstm = conn.prepareStatement(sql);
		pstm.setString(1, user.getU_password());
		result = pstm.executeUpdate();
		
		dbconn.closeConn();
		return result;
	}

	@Override
	public int delete(ComVo e) throws Exception {
		// TODO Auto-generated method stub
		int result = 0;
		UserVo user= (UserVo)e;
		String sql = "delete from " + user.getTable() + " where "
				+ user.getKey() + "=" + user.getId();
		conn=dbconn.getConn();
		stme=conn.createStatement();
		result=stme.executeUpdate(sql);
		
		return result;
	}

	@Override
	public List<ComVo> select(String sql) throws Exception {
		// TODO Auto-generated method stub
		List<ComVo> list =new ArrayList<ComVo>();
		
		conn=dbconn.getConn();
		pstm=conn.prepareStatement(sql);
		rs=pstm.executeQuery();
		while(rs.next()){
			UserVo user=new UserVo();
			user.setId(String.valueOf(rs.getInt("id")));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setNickname(rs.getString("nickname"));
			user.setPhoto(rs.getString("photo"));
			user.setEmail(rs.getString("email"));
			user.setSex(rs.getString("sex"));
			user.setStatus(rs.getString("status"));
			user.setRegtime(rs.getString("regtime"));
			user.setLatitude(rs.getString("latitude"));
			user.setLongitude(rs.getString("longitude"));
			list.add(user);
		}
		//dbconn.closeResult();
		rs.close();
		dbconn.closeConn();
		return list;
	}

}
