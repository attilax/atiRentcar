package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallRemindInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_remind_info", catalog = "iwmshopnow")
public class MallRemindInfo implements java.io.Serializable {

	// Fields

	private Integer rinfoId;
	private Integer userId;
	private String remindInfo;
	private Timestamp remindTime;
	private Boolean isread;

	// Constructors

	/** default constructor */
	public MallRemindInfo() {
	}

	/** minimal constructor */
	public MallRemindInfo(Integer userId, Boolean isread) {
		this.userId = userId;
		this.isread = isread;
	}

	/** full constructor */
	public MallRemindInfo(Integer userId, String remindInfo,
			Timestamp remindTime, Boolean isread) {
		this.userId = userId;
		this.remindInfo = remindInfo;
		this.remindTime = remindTime;
		this.isread = isread;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "rinfo_id", unique = true, nullable = false)
	public Integer getRinfoId() {
		return this.rinfoId;
	}

	public void setRinfoId(Integer rinfoId) {
		this.rinfoId = rinfoId;
	}

	@Column(name = "user_id", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "remind_info", length = 65535)
	public String getRemindInfo() {
		return this.remindInfo;
	}

	public void setRemindInfo(String remindInfo) {
		this.remindInfo = remindInfo;
	}

	@Column(name = "remind_time", length = 19)
	public Timestamp getRemindTime() {
		return this.remindTime;
	}

	public void setRemindTime(Timestamp remindTime) {
		this.remindTime = remindTime;
	}

	@Column(name = "isread", nullable = false)
	public Boolean getIsread() {
		return this.isread;
	}

	public void setIsread(Boolean isread) {
		this.isread = isread;
	}

}