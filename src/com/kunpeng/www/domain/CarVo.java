package com.kunpeng.www.domain;

public class CarVo implements ComVo {
	private String id;
	private String car_id;
	private String sn_id;
	private String sn;
	private String name;
	private String name_style;
	private String city_id;
	private String province_id;
	private String area_id;
	private String street_id;
	private String department_id;
	private String customer_id;
	private String cartype;
	private String speedtype;
	private String workplace;
	private String hometown;
	private String pailiang;
	private String price;
	private String price_name;
	private String is_use;
	private String click_count;
	private String seller_note;
	
	
	public String getSeller_note() {
		return seller_note;
	}

	public void setSeller_note(String seller_note) {
		this.seller_note = seller_note;
	}

	public String getProvince_id() {
		return province_id;
	}

	public void setProvince_id(String province_id) {
		this.province_id = province_id;
	}

	public String getArea_id() {
		return area_id;
	}

	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}

	public String getStreet_id() {
		return street_id;
	}

	public void setStreet_id(String street_id) {
		this.street_id = street_id;
	}

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

	public String getSn_id() {
		return sn_id;
	}

	public void setSn_id(String sn_id) {
		this.sn_id = sn_id;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName_style() {
		return name_style;
	}

	public void setName_style(String name_style) {
		this.name_style = name_style;
	}

	public String getCity_id() {
		return city_id;
	}

	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}

	public String getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public String getSpeedtype() {
		return speedtype;
	}

	public void setSpeedtype(String speedtype) {
		this.speedtype = speedtype;
	}

	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getPailiang() {
		return pailiang;
	}

	public void setPailiang(String pailiang) {
		this.pailiang = pailiang;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice_name() {
		return price_name;
	}

	public void setPrice_name(String price_name) {
		this.price_name = price_name;
	}

	public String getIs_use() {
		return is_use;
	}

	public void setIs_use(String is_use) {
		this.is_use = is_use;
	}

	public String getClick_count() {
		return click_count;
	}

	public void setClick_count(String click_count) {
		this.click_count = click_count;
	}

	@Override
	public String getTable() {
		// TODO Auto-generated method stub
		return "hx_car";
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
