package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallRemindUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_remind_user", catalog = "iwmshopnow")
public class MallRemindUser implements java.io.Serializable {

	// Fields

	private Integer urid;
	private Integer userId;
	private Integer remindId;
	private Boolean site;
	private Boolean mail;
	private Boolean im;
	private Boolean mobile;
	private Timestamp addTime;

	// Constructors

	/** default constructor */
	public MallRemindUser() {
	}

	/** full constructor */
	public MallRemindUser(Integer userId, Integer remindId, Boolean site,
			Boolean mail, Boolean im, Boolean mobile, Timestamp addTime) {
		this.userId = userId;
		this.remindId = remindId;
		this.site = site;
		this.mail = mail;
		this.im = im;
		this.mobile = mobile;
		this.addTime = addTime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "urid", unique = true, nullable = false)
	public Integer getUrid() {
		return this.urid;
	}

	public void setUrid(Integer urid) {
		this.urid = urid;
	}

	@Column(name = "user_id", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "remind_id", nullable = false)
	public Integer getRemindId() {
		return this.remindId;
	}

	public void setRemindId(Integer remindId) {
		this.remindId = remindId;
	}

	@Column(name = "site", nullable = false)
	public Boolean getSite() {
		return this.site;
	}

	public void setSite(Boolean site) {
		this.site = site;
	}

	@Column(name = "mail", nullable = false)
	public Boolean getMail() {
		return this.mail;
	}

	public void setMail(Boolean mail) {
		this.mail = mail;
	}

	@Column(name = "im", nullable = false)
	public Boolean getIm() {
		return this.im;
	}

	public void setIm(Boolean im) {
		this.im = im;
	}

	@Column(name = "mobile", nullable = false)
	public Boolean getMobile() {
		return this.mobile;
	}

	public void setMobile(Boolean mobile) {
		this.mobile = mobile;
	}

	@Column(name = "add_time", nullable = false, length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

}