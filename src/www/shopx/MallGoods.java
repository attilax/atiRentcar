package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallGoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_goods", catalog = "iwmshopnow")
public class MallGoods implements java.io.Serializable {

	// Fields

	private Integer goodsId;
	private Integer shopId;
	private String goodsName;
	private Integer catId;
	private Integer ucatId;
	private Integer brandId;
	private Integer typeId;
	private String goodsIntro;
	private String goodsWholesale;
	private Integer goodsNumber;
	private Double goodsPrice;
	private Double transportPrice;
	private String keyword;
	private Boolean isDelete;
	private Boolean isBest;
	private Boolean isNew;
	private Boolean isHot;
	private Boolean isPromote;
	private Boolean isAdminPromote;
	private Boolean isOnSale;
	private Boolean isSetImage;
	private String goodsThumb;
	private Integer pv;
	private Integer favpv;
	private Boolean sortOrder;
	private Timestamp addTime;
	private Timestamp lastUpdateTime;
	private Boolean lockFlg;
	private Boolean isTransportTemplate;
	private Integer transportTemplateId;
	private Float transportTemplatePrice;

	// Constructors

	/** default constructor */
	public MallGoods() {
	}

	/** minimal constructor */
	public MallGoods(Integer shopId, String goodsName, Integer catId,
			Integer ucatId, Integer brandId, Integer typeId,
			Integer goodsNumber, Double goodsPrice, Double transportPrice,
			String keyword, Boolean isDelete, Boolean isBest, Boolean isNew,
			Boolean isHot, Boolean isPromote, Boolean isAdminPromote,
			Boolean isOnSale, Boolean isSetImage, String goodsThumb,
			Integer pv, Integer favpv, Boolean sortOrder, Boolean lockFlg) {
		this.shopId = shopId;
		this.goodsName = goodsName;
		this.catId = catId;
		this.ucatId = ucatId;
		this.brandId = brandId;
		this.typeId = typeId;
		this.goodsNumber = goodsNumber;
		this.goodsPrice = goodsPrice;
		this.transportPrice = transportPrice;
		this.keyword = keyword;
		this.isDelete = isDelete;
		this.isBest = isBest;
		this.isNew = isNew;
		this.isHot = isHot;
		this.isPromote = isPromote;
		this.isAdminPromote = isAdminPromote;
		this.isOnSale = isOnSale;
		this.isSetImage = isSetImage;
		this.goodsThumb = goodsThumb;
		this.pv = pv;
		this.favpv = favpv;
		this.sortOrder = sortOrder;
		this.lockFlg = lockFlg;
	}

	/** full constructor */
	public MallGoods(Integer shopId, String goodsName, Integer catId,
			Integer ucatId, Integer brandId, Integer typeId, String goodsIntro,
			String goodsWholesale, Integer goodsNumber, Double goodsPrice,
			Double transportPrice, String keyword, Boolean isDelete,
			Boolean isBest, Boolean isNew, Boolean isHot, Boolean isPromote,
			Boolean isAdminPromote, Boolean isOnSale, Boolean isSetImage,
			String goodsThumb, Integer pv, Integer favpv, Boolean sortOrder,
			Timestamp addTime, Timestamp lastUpdateTime, Boolean lockFlg,
			Boolean isTransportTemplate, Integer transportTemplateId,
			Float transportTemplatePrice) {
		this.shopId = shopId;
		this.goodsName = goodsName;
		this.catId = catId;
		this.ucatId = ucatId;
		this.brandId = brandId;
		this.typeId = typeId;
		this.goodsIntro = goodsIntro;
		this.goodsWholesale = goodsWholesale;
		this.goodsNumber = goodsNumber;
		this.goodsPrice = goodsPrice;
		this.transportPrice = transportPrice;
		this.keyword = keyword;
		this.isDelete = isDelete;
		this.isBest = isBest;
		this.isNew = isNew;
		this.isHot = isHot;
		this.isPromote = isPromote;
		this.isAdminPromote = isAdminPromote;
		this.isOnSale = isOnSale;
		this.isSetImage = isSetImage;
		this.goodsThumb = goodsThumb;
		this.pv = pv;
		this.favpv = favpv;
		this.sortOrder = sortOrder;
		this.addTime = addTime;
		this.lastUpdateTime = lastUpdateTime;
		this.lockFlg = lockFlg;
		this.isTransportTemplate = isTransportTemplate;
		this.transportTemplateId = transportTemplateId;
		this.transportTemplatePrice = transportTemplatePrice;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "goods_id", unique = true, nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "shop_id", nullable = false)
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "goods_name", nullable = false)
	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	@Column(name = "cat_id", nullable = false)
	public Integer getCatId() {
		return this.catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	@Column(name = "ucat_id", nullable = false)
	public Integer getUcatId() {
		return this.ucatId;
	}

	public void setUcatId(Integer ucatId) {
		this.ucatId = ucatId;
	}

	@Column(name = "brand_id", nullable = false)
	public Integer getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	@Column(name = "type_id", nullable = false)
	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	@Column(name = "goods_intro", length = 65535)
	public String getGoodsIntro() {
		return this.goodsIntro;
	}

	public void setGoodsIntro(String goodsIntro) {
		this.goodsIntro = goodsIntro;
	}

	@Column(name = "goods_wholesale", length = 65535)
	public String getGoodsWholesale() {
		return this.goodsWholesale;
	}

	public void setGoodsWholesale(String goodsWholesale) {
		this.goodsWholesale = goodsWholesale;
	}

	@Column(name = "goods_number", nullable = false)
	public Integer getGoodsNumber() {
		return this.goodsNumber;
	}

	public void setGoodsNumber(Integer goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	@Column(name = "goods_price", nullable = false, precision = 8)
	public Double getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	@Column(name = "transport_price", nullable = false, precision = 8)
	public Double getTransportPrice() {
		return this.transportPrice;
	}

	public void setTransportPrice(Double transportPrice) {
		this.transportPrice = transportPrice;
	}

	@Column(name = "keyword", nullable = false)
	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Column(name = "is_delete", nullable = false)
	public Boolean getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	@Column(name = "is_best", nullable = false)
	public Boolean getIsBest() {
		return this.isBest;
	}

	public void setIsBest(Boolean isBest) {
		this.isBest = isBest;
	}

	@Column(name = "is_new", nullable = false)
	public Boolean getIsNew() {
		return this.isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	@Column(name = "is_hot", nullable = false)
	public Boolean getIsHot() {
		return this.isHot;
	}

	public void setIsHot(Boolean isHot) {
		this.isHot = isHot;
	}

	@Column(name = "is_promote", nullable = false)
	public Boolean getIsPromote() {
		return this.isPromote;
	}

	public void setIsPromote(Boolean isPromote) {
		this.isPromote = isPromote;
	}

	@Column(name = "is_admin_promote", nullable = false)
	public Boolean getIsAdminPromote() {
		return this.isAdminPromote;
	}

	public void setIsAdminPromote(Boolean isAdminPromote) {
		this.isAdminPromote = isAdminPromote;
	}

	@Column(name = "is_on_sale", nullable = false)
	public Boolean getIsOnSale() {
		return this.isOnSale;
	}

	public void setIsOnSale(Boolean isOnSale) {
		this.isOnSale = isOnSale;
	}

	@Column(name = "is_set_image", nullable = false)
	public Boolean getIsSetImage() {
		return this.isSetImage;
	}

	public void setIsSetImage(Boolean isSetImage) {
		this.isSetImage = isSetImage;
	}

	@Column(name = "goods_thumb", nullable = false)
	public String getGoodsThumb() {
		return this.goodsThumb;
	}

	public void setGoodsThumb(String goodsThumb) {
		this.goodsThumb = goodsThumb;
	}

	@Column(name = "pv", nullable = false)
	public Integer getPv() {
		return this.pv;
	}

	public void setPv(Integer pv) {
		this.pv = pv;
	}

	@Column(name = "favpv", nullable = false)
	public Integer getFavpv() {
		return this.favpv;
	}

	public void setFavpv(Integer favpv) {
		this.favpv = favpv;
	}

	@Column(name = "sort_order", nullable = false)
	public Boolean getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Boolean sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Column(name = "add_time", length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Column(name = "last_update_time", length = 19)
	public Timestamp getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Timestamp lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Column(name = "lock_flg", nullable = false)
	public Boolean getLockFlg() {
		return this.lockFlg;
	}

	public void setLockFlg(Boolean lockFlg) {
		this.lockFlg = lockFlg;
	}

	@Column(name = "is_transport_template")
	public Boolean getIsTransportTemplate() {
		return this.isTransportTemplate;
	}

	public void setIsTransportTemplate(Boolean isTransportTemplate) {
		this.isTransportTemplate = isTransportTemplate;
	}

	@Column(name = "transport_template_id")
	public Integer getTransportTemplateId() {
		return this.transportTemplateId;
	}

	public void setTransportTemplateId(Integer transportTemplateId) {
		this.transportTemplateId = transportTemplateId;
	}

	@Column(name = "transport_template_price", precision = 5, scale = 0)
	public Float getTransportTemplatePrice() {
		return this.transportTemplatePrice;
	}

	public void setTransportTemplatePrice(Float transportTemplatePrice) {
		this.transportTemplatePrice = transportTemplatePrice;
	}

}