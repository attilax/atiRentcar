package com.kunpeng.www.domain;

public class CarPicVo implements ComVo {
	private String id;
	private String car_id;
	private String picname;
	private String picurl;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCar_id() {
		return car_id;
	}

	public void setCar_id(String car_id) {
		this.car_id = car_id;
	}

	public String getPicname() {
		return picname;
	}

	public void setPicname(String picname) {
		this.picname = picname;
	}

	public String getPicurl() {
		return picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}

	@Override
	public String getTable() {
		// TODO Auto-generated method stub
		return "hx_carpic";
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
