package www.shopx;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MallGroupbuy entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_groupbuy", catalog = "iwmshopnow")
public class MallGroupbuy implements java.io.Serializable {

	// Fields

	private Integer groupId;
	private String groupName;
	private String groupDesc;
	private Date startTime;
	private Date endTime;
	private Integer goodsId;
	private Double specPrice;
	private Short minQuantity;
	private Short recommended;
	private Integer views;
	private Integer shopId;
	private Integer purchaseNum;
	private Integer orderNum;
	private Boolean groupCondition;
	private Integer allNum;
	private Integer oneNum;
	private Boolean examine;

	// Constructors

	/** default constructor */
	public MallGroupbuy() {
	}

	/** minimal constructor */
	public MallGroupbuy(String groupName, String groupDesc, Date startTime,
			Date endTime, Integer goodsId, Double specPrice, Short minQuantity,
			Short recommended, Integer views, Integer shopId,
			Integer purchaseNum, Integer orderNum, Boolean groupCondition,
			Integer allNum, Integer oneNum) {
		this.groupName = groupName;
		this.groupDesc = groupDesc;
		this.startTime = startTime;
		this.endTime = endTime;
		this.goodsId = goodsId;
		this.specPrice = specPrice;
		this.minQuantity = minQuantity;
		this.recommended = recommended;
		this.views = views;
		this.shopId = shopId;
		this.purchaseNum = purchaseNum;
		this.orderNum = orderNum;
		this.groupCondition = groupCondition;
		this.allNum = allNum;
		this.oneNum = oneNum;
	}

	/** full constructor */
	public MallGroupbuy(String groupName, String groupDesc, Date startTime,
			Date endTime, Integer goodsId, Double specPrice, Short minQuantity,
			Short recommended, Integer views, Integer shopId,
			Integer purchaseNum, Integer orderNum, Boolean groupCondition,
			Integer allNum, Integer oneNum, Boolean examine) {
		this.groupName = groupName;
		this.groupDesc = groupDesc;
		this.startTime = startTime;
		this.endTime = endTime;
		this.goodsId = goodsId;
		this.specPrice = specPrice;
		this.minQuantity = minQuantity;
		this.recommended = recommended;
		this.views = views;
		this.shopId = shopId;
		this.purchaseNum = purchaseNum;
		this.orderNum = orderNum;
		this.groupCondition = groupCondition;
		this.allNum = allNum;
		this.oneNum = oneNum;
		this.examine = examine;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "group_id", unique = true, nullable = false)
	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	@Column(name = "group_name", nullable = false)
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Column(name = "group_desc", nullable = false, length = 65535)
	public String getGroupDesc() {
		return this.groupDesc;
	}

	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "start_time", nullable = false, length = 10)
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "end_time", nullable = false, length = 10)
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Column(name = "goods_id", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "spec_price", nullable = false, precision = 8)
	public Double getSpecPrice() {
		return this.specPrice;
	}

	public void setSpecPrice(Double specPrice) {
		this.specPrice = specPrice;
	}

	@Column(name = "min_quantity", nullable = false)
	public Short getMinQuantity() {
		return this.minQuantity;
	}

	public void setMinQuantity(Short minQuantity) {
		this.minQuantity = minQuantity;
	}

	@Column(name = "recommended", nullable = false)
	public Short getRecommended() {
		return this.recommended;
	}

	public void setRecommended(Short recommended) {
		this.recommended = recommended;
	}

	@Column(name = "views", nullable = false)
	public Integer getViews() {
		return this.views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	@Column(name = "shop_id", nullable = false)
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "purchase_num", nullable = false)
	public Integer getPurchaseNum() {
		return this.purchaseNum;
	}

	public void setPurchaseNum(Integer purchaseNum) {
		this.purchaseNum = purchaseNum;
	}

	@Column(name = "order_num", nullable = false)
	public Integer getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	@Column(name = "group_condition", nullable = false)
	public Boolean getGroupCondition() {
		return this.groupCondition;
	}

	public void setGroupCondition(Boolean groupCondition) {
		this.groupCondition = groupCondition;
	}

	@Column(name = "all_num", nullable = false)
	public Integer getAllNum() {
		return this.allNum;
	}

	public void setAllNum(Integer allNum) {
		this.allNum = allNum;
	}

	@Column(name = "one_num", nullable = false)
	public Integer getOneNum() {
		return this.oneNum;
	}

	public void setOneNum(Integer oneNum) {
		this.oneNum = oneNum;
	}

	@Column(name = "examine")
	public Boolean getExamine() {
		return this.examine;
	}

	public void setExamine(Boolean examine) {
		this.examine = examine;
	}

}