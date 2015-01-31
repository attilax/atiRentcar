package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallGroupbuyLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_groupbuy_log", catalog = "iwmshopnow")
public class MallGroupbuyLog implements java.io.Serializable {

	// Fields

	private Integer grouplogId;
	private Integer groupId;
	private Integer userId;
	private String userName;
	private Short quantity;
	private String linkman;
	private String tel;
	private Timestamp addTime;
	private Short logType;

	// Constructors

	/** default constructor */
	public MallGroupbuyLog() {
	}

	/** full constructor */
	public MallGroupbuyLog(Integer groupId, Integer userId, String userName,
			Short quantity, String linkman, String tel, Timestamp addTime,
			Short logType) {
		this.groupId = groupId;
		this.userId = userId;
		this.userName = userName;
		this.quantity = quantity;
		this.linkman = linkman;
		this.tel = tel;
		this.addTime = addTime;
		this.logType = logType;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "grouplog_id", unique = true, nullable = false)
	public Integer getGrouplogId() {
		return this.grouplogId;
	}

	public void setGrouplogId(Integer grouplogId) {
		this.grouplogId = grouplogId;
	}

	@Column(name = "group_id", nullable = false)
	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	@Column(name = "user_id", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "user_name", nullable = false, length = 60)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "quantity", nullable = false)
	public Short getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Short quantity) {
		this.quantity = quantity;
	}

	@Column(name = "linkman", nullable = false, length = 60)
	public String getLinkman() {
		return this.linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	@Column(name = "tel", nullable = false, length = 60)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "add_time", nullable = false, length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Column(name = "log_type", nullable = false)
	public Short getLogType() {
		return this.logType;
	}

	public void setLogType(Short logType) {
		this.logType = logType;
	}

}