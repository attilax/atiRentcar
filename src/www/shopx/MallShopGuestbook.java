package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallShopGuestbook entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_shop_guestbook", catalog = "iwmshopnow")
public class MallShopGuestbook implements java.io.Serializable {

	// Fields

	private Integer gid;
	private Integer shopId;
	private String shopName;
	private Integer userId;
	private String name;
	private String email;
	private String contact;
	private String content;
	private Timestamp addTime;
	private String addIp;
	private Boolean shopDelStatus;
	private Boolean userDelStatus;
	private String reply;
	private Integer groupId;
	private String groupName;
	private Integer goodsId;
	private Boolean readStatus;

	// Constructors

	/** default constructor */
	public MallShopGuestbook() {
	}

	/** minimal constructor */
	public MallShopGuestbook(Integer shopId, Integer userId,
			Boolean shopDelStatus, Boolean userDelStatus, Integer groupId,
			String groupName, Integer goodsId) {
		this.shopId = shopId;
		this.userId = userId;
		this.shopDelStatus = shopDelStatus;
		this.userDelStatus = userDelStatus;
		this.groupId = groupId;
		this.groupName = groupName;
		this.goodsId = goodsId;
	}

	/** full constructor */
	public MallShopGuestbook(Integer shopId, String shopName, Integer userId,
			String name, String email, String contact, String content,
			Timestamp addTime, String addIp, Boolean shopDelStatus,
			Boolean userDelStatus, String reply, Integer groupId,
			String groupName, Integer goodsId, Boolean readStatus) {
		this.shopId = shopId;
		this.shopName = shopName;
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.content = content;
		this.addTime = addTime;
		this.addIp = addIp;
		this.shopDelStatus = shopDelStatus;
		this.userDelStatus = userDelStatus;
		this.reply = reply;
		this.groupId = groupId;
		this.groupName = groupName;
		this.goodsId = goodsId;
		this.readStatus = readStatus;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "gid", unique = true, nullable = false)
	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	@Column(name = "shop_id", nullable = false)
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "shop_name")
	public String getShopName() {
		return this.shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
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

	@Column(name = "contact")
	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
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

	@Column(name = "reply", length = 65535)
	public String getReply() {
		return this.reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	@Column(name = "group_id", nullable = false)
	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	@Column(name = "group_name", nullable = false, length = 50)
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Column(name = "goods_id", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "read_status")
	public Boolean getReadStatus() {
		return this.readStatus;
	}

	public void setReadStatus(Boolean readStatus) {
		this.readStatus = readStatus;
	}

}