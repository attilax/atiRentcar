package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallRemind entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_remind", catalog = "iwmshopnow")
public class MallRemind implements java.io.Serializable {

	// Fields

	private Integer remindId;
	private Integer remindType;
	private String remindName;
	private String remindTpl;
	private Boolean enable;

	// Constructors

	/** default constructor */
	public MallRemind() {
	}

	/** minimal constructor */
	public MallRemind(Integer remindType, String remindName, Boolean enable) {
		this.remindType = remindType;
		this.remindName = remindName;
		this.enable = enable;
	}

	/** full constructor */
	public MallRemind(Integer remindType, String remindName, String remindTpl,
			Boolean enable) {
		this.remindType = remindType;
		this.remindName = remindName;
		this.remindTpl = remindTpl;
		this.enable = enable;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "remind_id", unique = true, nullable = false)
	public Integer getRemindId() {
		return this.remindId;
	}

	public void setRemindId(Integer remindId) {
		this.remindId = remindId;
	}

	@Column(name = "remind_type", nullable = false)
	public Integer getRemindType() {
		return this.remindType;
	}

	public void setRemindType(Integer remindType) {
		this.remindType = remindType;
	}

	@Column(name = "remind_name", nullable = false, length = 200)
	public String getRemindName() {
		return this.remindName;
	}

	public void setRemindName(String remindName) {
		this.remindName = remindName;
	}

	@Column(name = "remind_tpl", length = 65535)
	public String getRemindTpl() {
		return this.remindTpl;
	}

	public void setRemindTpl(String remindTpl) {
		this.remindTpl = remindTpl;
	}

	@Column(name = "enable", nullable = false)
	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

}