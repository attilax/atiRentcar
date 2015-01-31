package com.kunpeng.www.dao;

import java.util.List;

import com.kunpeng.www.domain.ComVo;


public interface ComDAO {
	int save(ComVo e) throws Exception;
	int update(ComVo e) throws Exception;
	int delete(ComVo e) throws Exception;
	List<ComVo> select(String sql) throws Exception;
}
