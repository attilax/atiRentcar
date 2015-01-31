package com.kunpeng.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kunpeng.www.db.DBConneConfig;
import com.kunpeng.www.domain.CarPicVo;
import com.kunpeng.www.domain.CarVo;
import com.kunpeng.www.domain.ComVo;
import com.kunpeng.www.domain.UserVo;

public class CarDAOImp implements ComDAO {
	private DBConneConfig dbconn;
	protected Connection conn = null;
	protected Statement stme = null;
	protected ResultSet rs = null;
	protected PreparedStatement pstm = null;
	
	public static void main(String[] args) {
		
	}

	public CarDAOImp() throws Exception {
		dbconn = new DBConneConfig();
	}

	@Override
	public int save(ComVo e) throws Exception {
		// TODO Auto-generated method stub
		int result = 0;
		CarVo comdao = (CarVo) e;
		String sql = "insert into "
				+ comdao.getTable()
				+ " (name,cartype,speedtype,hometown,pailiang,price,price_name,city_id,province_id,area_id,street_id,seller_note,is_check,sn_id,sn) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		conn = dbconn.getConn();
		pstm = conn.prepareStatement(sql);
		pstm.setString(1, comdao.getName());
		pstm.setString(2, comdao.getCartype());
		pstm.setString(3, comdao.getSpeedtype());
		pstm.setString(4, comdao.getHometown());
		pstm.setString(5, comdao.getPailiang());
		pstm.setString(6, comdao.getPrice());
		pstm.setString(7, comdao.getPrice_name());
		pstm.setString(8, comdao.getCar_id());
		pstm.setString(9, comdao.getProvince_id());
		pstm.setString(10, comdao.getArea_id());
		pstm.setString(11, comdao.getStreet_id());
		pstm.setString(12, comdao.getSeller_note());
		pstm.setString(13, comdao.getIs_use());
		pstm.setString(14, comdao.getSn_id());
		pstm.setString(15, comdao.getSn());
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
			CarVo car = new CarVo();
			car.setId(String.valueOf(rs.getInt("id")));
			car.setName(rs.getString("name"));
			car.setCartype(rs.getString("cartype"));
			car.setSpeedtype(rs.getString("speedtype"));
			car.setHometown(rs.getString("hometown"));
			car.setPailiang(rs.getString("pailiang"));
			car.setPrice(rs.getString("price"));
			car.setPrice_name(rs.getString("price_name"));
			car.setCity_id(rs.getString("city_id"));
			car.setProvince_id(rs.getString("province_id"));
			car.setArea_id(rs.getString("area_id"));
			car.setStreet_id(rs.getString("street_id"));
			car.setSn(rs.getString("sn"));
			car.setSeller_note(rs.getString("seller_note"));
			car.setIs_use(rs.getString("is_check"));
			car.setSn_id(rs.getString("sn_id"));
			list.add(car);
		}
		// dbconn.closeResult();
		rs.close();
		dbconn.closeConn();
		return list;
	}

}
