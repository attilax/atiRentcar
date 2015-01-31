package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallProtectRights entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_protect_rights", catalog = "iwmshopnow")
public class MallProtectRights implements java.io.Serializable {

	// Fields

	private Integer pid;
	private Integer orderId;
	private Boolean protectItem;
	private Integer userId;
	private Boolean userType;
	private Integer shopId;
	private String content;
	private Timestamp protectDate;
	private Boolean status;

	// Constructors

	/** default constructor */
	public MallProtectRights() {
	}

	/** minimal constructor */
	public MallProtectRights(Integer orderId) {
		this.orderId = orderId;
	}

	/** full constructor */
	public MallProtectRights(Integer orderId, Boolean protectItem,
			Integer userId, Boolean userType, Integer shopId, String content,
			Timestamp protectDate, Boolean status) {
		this.orderId = orderId;
		this.protectItem = protectItem;
		this.userId = userId;
		this.userType = userType;
		this.shopId = shopId;
		this.content = content;
		this.protectDate = protectDate;
		this.status = status;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "pid", unique = true, nullable = false)
	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Column(name = "order_id", nullable = false)
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "protect_item")
	public Boolean getProtectItem() {
		return this.protectItem;
	}

	public void setProtectItem(Boolean protectItem) {
		this.protectItem = protectItem;
	}

	@Column(name = "user_id")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "user_type")
	public Boolean getUserType() {
		return this.userType;
	}

	public void setUserType(Boolean userType) {
		this.userType = userType;
	}

	@Column(name = "shop_id")
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "content", length = 400)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "protect_date", length = 19)
	public Timestamp getProtectDate() {
		return this.protectDate;
	}

	public void setProtectDate(Timestamp protectDate) {
		this.protectDate = protectDate;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}