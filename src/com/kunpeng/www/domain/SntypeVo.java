package com.kunpeng.www.domain;

public class SntypeVo implements ComVo {
	private String id;
	private String name;
	private String typename;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	@Override
	public String getTable() {
		// TODO Auto-generated method stub
		return "hx_sntype";
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return "id";
	}

	@Override
	public String getKeyValue() {
		// TODO Auto-generated method stub
		return id;
	}

}