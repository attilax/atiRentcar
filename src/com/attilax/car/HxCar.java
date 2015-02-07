package com.attilax.car;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * HxCar entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "hx_car", catalog = "hxtaxi")
public class HxCar implements java.io.Serializable {

	// Fields

	private Integer id;
	private Short carId;
	private String snId;
	private String sn;
	private String name;
	private String nameStyle;
	private Integer cityId;
	private Integer provinceId;
	private Integer areaId;
	private Integer streetId;
	private Integer departmentId;
	private Integer customerId;
	private Integer cartype;
	private Integer speedtype;
	private String workplace;
	private String hometown;
	private String pailiang;
	private String price;
	private String priceName;
	private Boolean isUse;
	private Integer clickCount;
	private Short brandId;
	private String providerName;
	private Short goodsNumber;
	private Double goodsWeight;
	private Double marketPrice;
	private Double shopPrice;
	private Double promotePrice;
	private Integer promoteStartDate;
	private Integer promoteEndDate;
	private Short warnNumber;
	private String keywords;
	private String goodsBrief;
	private String goodsDesc;
	private String goodsThumb;
	private String goodsImg;
	private String originalImg;
	private Short isReal;
	private String extensionCode;
	private Boolean isOnSale;
	private Boolean isAloneSale;
	private Boolean isShipping;
	private Integer integral;
	private Integer addTime;
	private Short sortOrder;
	private Boolean isDelete;
	private Boolean isBest;
	private Boolean isNew;
	private Boolean isHot;
	private Boolean isPromote;
	private Short bonusTypeId;
	private Integer lastUpdate;
	private Short goodsType;
	private String sellerNote;
	private Integer giveIntegral;
	private Integer rankIntegral;
	private Short suppliersId;
	private Boolean isCheck;

	// Constructors

	/** default constructor */
	public HxCar() {
	}

	/** full constructor */
	public HxCar(Short carId, String snId, String sn, String name,
			String nameStyle, Integer cityId, Integer provinceId,
			Integer areaId, Integer streetId, Integer departmentId,
			Integer customerId, Integer cartype, Integer speedtype,
			String workplace, String hometown, String pailiang, String price,
			String priceName, Boolean isUse, Integer clickCount, Short brandId,
			String providerName, Short goodsNumber, Double goodsWeight,
			Double marketPrice, Double shopPrice, Double promotePrice,
			Integer promoteStartDate, Integer promoteEndDate, Short warnNumber,
			String keywords, String goodsBrief, String goodsDesc,
			String goodsThumb, String goodsImg, String originalImg,
			Short isReal, String extensionCode, Boolean isOnSale,
			Boolean isAloneSale, Boolean isShipping, Integer integral,
			Integer addTime, Short sortOrder, Boolean isDelete, Boolean isBest,
			Boolean isNew, Boolean isHot, Boolean isPromote, Short bonusTypeId,
			Integer lastUpdate, Short goodsType, String sellerNote,
			Integer giveIntegral, Integer rankIntegral, Short suppliersId,
			Boolean isCheck) {
		this.carId = carId;
		this.snId = snId;
		this.sn = sn;
		this.name = name;
		this.nameStyle = nameStyle;
		this.cityId = cityId;
		this.provinceId = provinceId;
		this.areaId = areaId;
		this.streetId = streetId;
		this.departmentId = departmentId;
		this.customerId = customerId;
		this.cartype = cartype;
		this.speedtype = speedtype;
		this.workplace = workplace;
		this.hometown = hometown;
		this.pailiang = pailiang;
		this.price = price;
		this.priceName = priceName;
		this.isUse = isUse;
		this.clickCount = clickCount;
		this.brandId = brandId;
		this.providerName = providerName;
		this.goodsNumber = goodsNumber;
		this.goodsWeight = goodsWeight;
		this.marketPrice = marketPrice;
		this.shopPrice = shopPrice;
		this.promotePrice = promotePrice;
		this.promoteStartDate = promoteStartDate;
		this.promoteEndDate = promoteEndDate;
		this.warnNumber = warnNumber;
		this.keywords = keywords;
		this.goodsBrief = goodsBrief;
		this.goodsDesc = goodsDesc;
		this.goodsThumb = goodsThumb;
		this.goodsImg = goodsImg;
		this.originalImg = originalImg;
		this.isReal = isReal;
		this.extensionCode = extensionCode;
		this.isOnSale = isOnSale;
		this.isAloneSale = isAloneSale;
		this.isShipping = isShipping;
		this.integral = integral;
		this.addTime = addTime;
		this.sortOrder = sortOrder;
		this.isDelete = isDelete;
		this.isBest = isBest;
		this.isNew = isNew;
		this.isHot = isHot;
		this.isPromote = isPromote;
		this.bonusTypeId = bonusTypeId;
		this.lastUpdate = lastUpdate;
		this.goodsType = goodsType;
		this.sellerNote = sellerNote;
		this.giveIntegral = giveIntegral;
		this.rankIntegral = rankIntegral;
		this.suppliersId = suppliersId;
		this.isCheck = isCheck;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "car_id")
	public Short getCarId() {
		return this.carId;
	}

	public void setCarId(Short carId) {
		this.carId = carId;
	}

	@Column(name = "sn_id", length = 60)
	public String getSnId() {
		return this.snId;
	}

	public void setSnId(String snId) {
		this.snId = snId;
	}

	@Column(name = "sn", length = 60)
	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	@Column(name = "name", length = 120)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "name_style", length = 60)
	public String getNameStyle() {
		return this.nameStyle;
	}

	public void setNameStyle(String nameStyle) {
		this.nameStyle = nameStyle;
	}

	@Column(name = "city_id")
	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	@Column(name = "province_id")
	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	@Column(name = "area_id")
	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	@Column(name = "street_id")
	public Integer getStreetId() {
		return this.streetId;
	}

	public void setStreetId(Integer streetId) {
		this.streetId = streetId;
	}

	@Column(name = "department_id")
	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	@Column(name = "customer_id")
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "cartype")
	public Integer getCartype() {
		return this.cartype;
	}

	public void setCartype(Integer cartype) {
		this.cartype = cartype;
	}

	@Column(name = "speedtype")
	public Integer getSpeedtype() {
		return this.speedtype;
	}

	public void setSpeedtype(Integer speedtype) {
		this.speedtype = speedtype;
	}

	@Column(name = "workplace", length = 100)
	public String getWorkplace() {
		return this.workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	@Column(name = "hometown", length = 20)
	public String getHometown() {
		return this.hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	@Column(name = "pailiang", length = 200)
	public String getPailiang() {
		return this.pailiang;
	}

	public void setPailiang(String pailiang) {
		this.pailiang = pailiang;
	}

	@Column(name = "price", length = 200)
	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Column(name = "price_name", length = 200)
	public String getPriceName() {
		return this.priceName;
	}

	public void setPriceName(String priceName) {
		this.priceName = priceName;
	}

	@Column(name = "is_use")
	public Boolean getIsUse() {
		return this.isUse;
	}

	public void setIsUse(Boolean isUse) {
		this.isUse = isUse;
	}

	@Column(name = "click_count")
	public Integer getClickCount() {
		return this.clickCount;
	}

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}

	@Column(name = "brand_id")
	public Short getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Short brandId) {
		this.brandId = brandId;
	}

	@Column(name = "provider_name", length = 100)
	public String getProviderName() {
		return this.providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	@Column(name = "goods_number")
	public Short getGoodsNumber() {
		return this.goodsNumber;
	}

	public void setGoodsNumber(Short goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	@Column(name = "goods_weight", precision = 10, scale = 3)
	public Double getGoodsWeight() {
		return this.goodsWeight;
	}

	public void setGoodsWeight(Double goodsWeight) {
		this.goodsWeight = goodsWeight;
	}

	@Column(name = "market_price", precision = 10)
	public Double getMarketPrice() {
		return this.marketPrice;
	}

	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}

	@Column(name = "shop_price", precision = 10)
	public Double getShopPrice() {
		return this.shopPrice;
	}

	public void setShopPrice(Double shopPrice) {
		this.shopPrice = shopPrice;
	}

	@Column(name = "promote_price", precision = 10)
	public Double getPromotePrice() {
		return this.promotePrice;
	}

	public void setPromotePrice(Double promotePrice) {
		this.promotePrice = promotePrice;
	}

	@Column(name = "promote_start_date")
	public Integer getPromoteStartDate() {
		return this.promoteStartDate;
	}

	public void setPromoteStartDate(Integer promoteStartDate) {
		this.promoteStartDate = promoteStartDate;
	}

	@Column(name = "promote_end_date")
	public Integer getPromoteEndDate() {
		return this.promoteEndDate;
	}

	public void setPromoteEndDate(Integer promoteEndDate) {
		this.promoteEndDate = promoteEndDate;
	}

	@Column(name = "warn_number")
	public Short getWarnNumber() {
		return this.warnNumber;
	}

	public void setWarnNumber(Short warnNumber) {
		this.warnNumber = warnNumber;
	}

	@Column(name = "keywords")
	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	@Column(name = "goods_brief")
	public String getGoodsBrief() {
		return this.goodsBrief;
	}

	public void setGoodsBrief(String goodsBrief) {
		this.goodsBrief = goodsBrief;
	}

	@Column(name = "goods_desc", length = 65535)
	public String getGoodsDesc() {
		return this.goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	@Column(name = "goods_thumb")
	public String getGoodsThumb() {
		return this.goodsThumb;
	}

	public void setGoodsThumb(String goodsThumb) {
		this.goodsThumb = goodsThumb;
	}

	@Column(name = "goods_img")
	public String getGoodsImg() {
		return this.goodsImg;
	}

	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}

	@Column(name = "original_img")
	public String getOriginalImg() {
		return this.originalImg;
	}

	public void setOriginalImg(String originalImg) {
		this.originalImg = originalImg;
	}

	@Column(name = "is_real")
	public Short getIsReal() {
		return this.isReal;
	}

	public void setIsReal(Short isReal) {
		this.isReal = isReal;
	}

	@Column(name = "extension_code", length = 30)
	public String getExtensionCode() {
		return this.extensionCode;
	}

	public void setExtensionCode(String extensionCode) {
		this.extensionCode = extensionCode;
	}

	@Column(name = "is_on_sale")
	public Boolean getIsOnSale() {
		return this.isOnSale;
	}

	public void setIsOnSale(Boolean isOnSale) {
		this.isOnSale = isOnSale;
	}

	@Column(name = "is_alone_sale")
	public Boolean getIsAloneSale() {
		return this.isAloneSale;
	}

	public void setIsAloneSale(Boolean isAloneSale) {
		this.isAloneSale = isAloneSale;
	}

	@Column(name = "is_shipping")
	public Boolean getIsShipping() {
		return this.isShipping;
	}

	public void setIsShipping(Boolean isShipping) {
		this.isShipping = isShipping;
	}

	@Column(name = "integral")
	public Integer getIntegral() {
		return this.integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	@Column(name = "add_time")
	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	@Column(name = "sort_order")
	public Short getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Short sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Column(name = "is_delete")
	public Boolean getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	@Column(name = "is_best")
	public Boolean getIsBest() {
		return this.isBest;
	}

	public void setIsBest(Boolean isBest) {
		this.isBest = isBest;
	}

	@Column(name = "is_new")
	public Boolean getIsNew() {
		return this.isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	@Column(name = "is_hot")
	public Boolean getIsHot() {
		return this.isHot;
	}

	public void setIsHot(Boolean isHot) {
		this.isHot = isHot;
	}

	@Column(name = "is_promote")
	public Boolean getIsPromote() {
		return this.isPromote;
	}

	public void setIsPromote(Boolean isPromote) {
		this.isPromote = isPromote;
	}

	@Column(name = "bonus_type_id")
	public Short getBonusTypeId() {
		return this.bonusTypeId;
	}

	public void setBonusTypeId(Short bonusTypeId) {
		this.bonusTypeId = bonusTypeId;
	}

	@Column(name = "last_update")
	public Integer getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Integer lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "goods_type")
	public Short getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(Short goodsType) {
		this.goodsType = goodsType;
	}

	@Column(name = "seller_note")
	public String getSellerNote() {
		return this.sellerNote;
	}

	public void setSellerNote(String sellerNote) {
		this.sellerNote = sellerNote;
	}

	@Column(name = "give_integral")
	public Integer getGiveIntegral() {
		return this.giveIntegral;
	}

	public void setGiveIntegral(Integer giveIntegral) {
		this.giveIntegral = giveIntegral;
	}

	@Column(name = "rank_integral")
	public Integer getRankIntegral() {
		return this.rankIntegral;
	}

	public void setRankIntegral(Integer rankIntegral) {
		this.rankIntegral = rankIntegral;
	}

	@Column(name = "suppliers_id")
	public Short getSuppliersId() {
		return this.suppliersId;
	}

	public void setSuppliersId(Short suppliersId) {
		this.suppliersId = suppliersId;
	}

	@Column(name = "is_check")
	public Boolean getIsCheck() {
		return this.isCheck;
	}

	public void setIsCheck(Boolean isCheck) {
		this.isCheck = isCheck;
	}

}