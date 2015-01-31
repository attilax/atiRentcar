package com.kunpeng.www.test;

import java.util.Iterator;
import java.util.List;

import com.kunpeng.www.dao.UserDAOImp;
import com.kunpeng.www.domain.ComVo;
import com.kunpeng.www.domain.UserVo;
import com.kunpeng.www.tool.Comm;

public class TestDao {

	public static void main(String[] args) throws Exception {
		UserDAOImp user=new UserDAOImp();
		String sql="SELECT * FROM  hx_members LIMIT 0 , 30";
		List<ComVo> users= user.select(sql);
		Iterator<?> userit=users.iterator();
		while(userit.hasNext())
		{
			UserVo useri=(UserVo)userit.next();
			System.out.println(useri.getUsername());
		}
		
		System.out.println(Comm.getPicName());
	}
}
