package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallShopInquiry entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_shop_inquiry", catalog = "iwmshopnow")
public class MallShopInquiry implements java.io.Serializable {

	// Fields

	private Integer iid;
	private Integer shopId;
	private Integer goodsId;
	private String goodsName;
	private Integer userId;
	private String name;
	private String email;
	private String mobile;
	private String telphone;
	private String title;
	private String content;
	private Timestamp addTime;
	private String addIp;
	private Boolean shopDelStatus;
	private Boolean userDelStatus;
	private Boolean readStatus;

	// Constructors

	/** default constructor */
	public MallShopInquiry() {
	}

	/** minimal constructor */
	public MallShopInquiry(Integer shopId, Integer goodsId, String goodsName,
			Integer userId, Boolean shopDelStatus, Boolean userDelStatus) {
		this.shopId = shopId;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.userId = userId;
		this.shopDelStatus = shopDelStatus;
		this.userDelStatus = userDelStatus;
	}

	/** full constructor */
	public MallShopInquiry(Integer shopId, Integer goodsId, String goodsName,
			Integer userId, String name, String email, String mobile,
			String telphone, String title, String content, Timestamp addTime,
			String addIp, Boolean shopDelStatus, Boolean userDelStatus,
			Boolean readStatus) {
		this.shopId = shopId;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.telphone = telphone;
		this.title = title;
		this.content = content;
		this.addTime = addTime;
		this.addIp = addIp;
		this.shopDelStatus = shopDelStatus;
		this.userDelStatus = userDelStatus;
		this.readStatus = readStatus;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "iid", unique = true, nullable = false)
	public Integer getIid() {
		return this.iid;
	}

	public void setIid(Integer iid) {
		this.iid = iid;
	}

	@Column(name = "shop_id", nullable = false)
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "goods_id", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "goods_name", nullable = false)
	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	@Column(name = "user_id", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "mobile")
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "telphone")
	public String getTelphone() {
		return this.telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	@Column(name = "title", length = 65535)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "content", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "add_time", length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Column(name = "add_ip", length = 20)
	public String getAddIp() {
		return this.addIp;
	}

	public void setAddIp(String addIp) {
		this.addIp = addIp;
	}

	@Column(name = "shop_del_status", nullable = false)
	public Boolean getShopDelStatus() {
		return this.shopDelStatus;
	}

	public void setShopDelStatus(Boolean shopDelStatus) {
		this.shopDelStatus = shopDelStatus;
	}

	@Column(name = "user_del_status", nullable = false)
	public Boolean getUserDelStatus() {
		return this.userDelStatus;
	}

	public void setUserDelStatus(Boolean userDelStatus) {
		this.userDelStatus = userDelStatus;
	}

	@Column(name = "read_status")
	public Boolean getReadStatus() {
		return this.readStatus;
	}

	public void setReadStatus(Boolean readStatus) {
		this.readStatus = readStatus;
	}

}