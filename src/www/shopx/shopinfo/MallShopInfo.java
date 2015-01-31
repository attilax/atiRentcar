package www.shopx.shopinfo;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * MallShopInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_shop_info", catalog = "iwmshopnow", uniqueConstraints = @UniqueConstraint(columnNames = "user_id"))
public class MallShopInfo implements java.io.Serializable {

	// Fields

	private Integer shopId;
	private Short shopCommend;
	private Integer userId;
	private String shopName;
	private Short shopCountry;
	private Short shopProvince;
	private Short shopCity;
	private Short shopDistrict;
	private String shopAddress;
	private String shopImages;
	private String shopLogo;
	private String shopTemplateImg;
	private String shopTemplate;
	private String shopManagement;
	private String shopIntro;
	private String shopNotice;
	private Timestamp shopCreatTime;
	private Integer goodsNum;
	private Boolean openFlg;
	private Boolean lockFlg;
	private String mapX;
	private String mapY;
	private String mapZoom;
	private Integer countImgsize;
	private Integer shopCategories;
	private String shopDomain;

	// Constructors

	/** default constructor */
	public MallShopInfo() {
	}

	/** minimal constructor */
	public MallShopInfo(Integer userId, String shopTemplate, Integer goodsNum,
			Boolean openFlg, Boolean lockFlg, Integer countImgsize) {
		this.userId = userId;
		this.shopTemplate = shopTemplate;
		this.goodsNum = goodsNum;
		this.openFlg = openFlg;
		this.lockFlg = lockFlg;
		this.countImgsize = countImgsize;
	}

	/** full constructor */
	public MallShopInfo(Short shopCommend, Integer userId, String shopName,
			Short shopCountry, Short shopProvince, Short shopCity,
			Short shopDistrict, String shopAddress, String shopImages,
			String shopLogo, String shopTemplateImg, String shopTemplate,
			String shopManagement, String shopIntro, String shopNotice,
			Timestamp shopCreatTime, Integer goodsNum, Boolean openFlg,
			Boolean lockFlg, String mapX, String mapY, String mapZoom,
			Integer countImgsize, Integer shopCategories, String shopDomain) {
		this.shopCommend = shopCommend;
		this.userId = userId;
		this.shopName = shopName;
		this.shopCountry = shopCountry;
		this.shopProvince = shopProvince;
		this.shopCity = shopCity;
		this.shopDistrict = shopDistrict;
		this.shopAddress = shopAddress;
		this.shopImages = shopImages;
		this.shopLogo = shopLogo;
		this.shopTemplateImg = shopTemplateImg;
		this.shopTemplate = shopTemplate;
		this.shopManagement = shopManagement;
		this.shopIntro = shopIntro;
		this.shopNotice = shopNotice;
		this.shopCreatTime = shopCreatTime;
		this.goodsNum = goodsNum;
		this.openFlg = openFlg;
		this.lockFlg = lockFlg;
		this.mapX = mapX;
		this.mapY = mapY;
		this.mapZoom = mapZoom;
		this.countImgsize = countImgsize;
		this.shopCategories = shopCategories;
		this.shopDomain = shopDomain;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "shop_id", unique = true, nullable = false)
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "shop_commend")
	public Short getShopCommend() {
		return this.shopCommend;
	}

	public void setShopCommend(Short shopCommend) {
		this.shopCommend = shopCommend;
	}

	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "shop_name", length = 50)
	public String getShopName() {
		return this.shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	@Column(name = "shop_country")
	public Short getShopCountry() {
		return this.shopCountry;
	}

	public void setShopCountry(Short shopCountry) {
		this.shopCountry = shopCountry;
	}

	@Column(name = "shop_province")
	public Short getShopProvince() {
		return this.shopProvince;
	}

	public void setShopProvince(Short shopProvince) {
		this.shopProvince = shopProvince;
	}

	@Column(name = "shop_city")
	public Short getShopCity() {
		return this.shopCity;
	}

	public void setShopCity(Short shopCity) {
		this.shopCity = shopCity;
	}

	@Column(name = "shop_district")
	public Short getShopDistrict() {
		return this.shopDistrict;
	}

	public void setShopDistrict(Short shopDistrict) {
		this.shopDistrict = shopDistrict;
	}

	@Column(name = "shop_address")
	public String getShopAddress() {
		return this.shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	@Column(name = "shop_images")
	public String getShopImages() {
		return this.shopImages;
	}

	public void setShopImages(String shopImages) {
		this.shopImages = shopImages;
	}

	@Column(name = "shop_logo")
	public String getShopLogo() {
		return this.shopLogo;
	}

	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}

	@Column(name = "shop_template_img")
	public String getShopTemplateImg() {
		return this.shopTemplateImg;
	}

	public void setShopTemplateImg(String shopTemplateImg) {
		this.shopTemplateImg = shopTemplateImg;
	}

	@Column(name = "shop_template", nullable = false, length = 20)
	public String getShopTemplate() {
		return this.shopTemplate;
	}

	public void setShopTemplate(String shopTemplate) {
		this.shopTemplate = shopTemplate;
	}

	@Column(name = "shop_management")
	public String getShopManagement() {
		return this.shopManagement;
	}

	public void setShopManagement(String shopManagement) {
		this.shopManagement = shopManagement;
	}

	@Column(name = "shop_intro", length = 65535)
	public String getShopIntro() {
		return this.shopIntro;
	}

	public void setShopIntro(String shopIntro) {
		this.shopIntro = shopIntro;
	}

	@Column(name = "shop_notice", length = 65535)
	public String getShopNotice() {
		return this.shopNotice;
	}

	public void setShopNotice(String shopNotice) {
		this.shopNotice = shopNotice;
	}

	@Column(name = "shop_creat_time", length = 19)
	public Timestamp getShopCreatTime() {
		return this.shopCreatTime;
	}

	public void setShopCreatTime(Timestamp shopCreatTime) {
		this.shopCreatTime = shopCreatTime;
	}

	@Column(name = "goods_num", nullable = false)
	public Integer getGoodsNum() {
		return this.goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	@Column(name = "open_flg", nullable = false)
	public Boolean getOpenFlg() {
		return this.openFlg;
	}

	public void setOpenFlg(Boolean openFlg) {
		this.openFlg = openFlg;
	}

	@Column(name = "lock_flg", nullable = false)
	public Boolean getLockFlg() {
		return this.lockFlg;
	}

	public void setLockFlg(Boolean lockFlg) {
		this.lockFlg = lockFlg;
	}

	@Column(name = "map_x", length = 20)
	public String getMapX() {
		return this.mapX;
	}

	public void setMapX(String mapX) {
		this.mapX = mapX;
	}

	@Column(name = "map_y", length = 20)
	public String getMapY() {
		return this.mapY;
	}

	public void setMapY(String mapY) {
		this.mapY = mapY;
	}

	@Column(name = "map_zoom", length = 3)
	public String getMapZoom() {
		return this.mapZoom;
	}

	public void setMapZoom(String mapZoom) {
		this.mapZoom = mapZoom;
	}

	@Column(name = "count_imgsize", nullable = false)
	public Integer getCountImgsize() {
		return this.countImgsize;
	}

	public void setCountImgsize(Integer countImgsize) {
		this.countImgsize = countImgsize;
	}

	@Column(name = "shop_categories")
	public Integer getShopCategories() {
		return this.shopCategories;
	}

	public void setShopCategories(Integer shopCategories) {
		this.shopCategories = shopCategories;
	}

	@Column(name = "shop_domain", length = 20)
	public String getShopDomain() {
		return this.shopDomain;
	}

	public void setShopDomain(String shopDomain) {
		this.shopDomain = shopDomain;
	}

}