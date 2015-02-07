package com.attilax.user;

import java.util.Map;

import com.attilax.persistence.Hbx;
import com.attilax.persistence.PX;
import com.google.inject.Inject;

public class UserService {

	  @Inject
		public  PX px;
	public Map getByTel(Object object) {
		 String sql=" SELECT * FROM `hx_members` where username='"+object.toString()+"' ";
		 
		return (Map) px.findBySql(sql).get(0);
	}

}
