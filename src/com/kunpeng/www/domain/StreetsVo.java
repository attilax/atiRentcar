package com.kunpeng.www.domain;

public class StreetsVo implements ComVo {
	private String id;
	private String area_id;
	private String first;
	private String name;
	private String longitude;
	private String latitude;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArea_id() {
		return area_id;
	}

	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Override
	public String getTable() {
		// TODO Auto-generated method stub
		return "hx_streets";
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
