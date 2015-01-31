package com.kunpeng.www.domain;

public class TypemoneyVo implements ComVo {
	private String id;
	private String car_id;
	private String daytype_id;
	private String pice;
	
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

	public String getDaytype_id() {
		return daytype_id;
	}

	public void setDaytype_id(String daytype_id) {
		this.daytype_id = daytype_id;
	}

	public String getPice() {
		return pice;
	}

	public void setPice(String pice) {
		this.pice = pice;
	}

	@Override
	public String getTable() {
		// TODO Auto-generated method stub
		return "hx_typemoney";
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
