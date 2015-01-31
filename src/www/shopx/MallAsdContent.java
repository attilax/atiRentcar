package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallAsdContent entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_asd_content", catalog = "iwmshopnow")
public class MallAsdContent implements java.io.Serializable {

	// Fields

	private Integer asdId;
	private Integer positionId;
	private Short mediaType;
	private String asdName;
	private String asdLink;
	private String asdContent;
	private String remark;
	private Short enabled;
	private Timestamp lastUpdateTime;

	// Constructors

	/** default constructor */
	public MallAsdContent() {
	}

	/** minimal constructor */
	public MallAsdContent(Integer positionId, Short mediaType, String asdName,
			String asdLink, String asdContent, String remark, Short enabled) {
		this.positionId = positionId;
		this.mediaType = mediaType;
		this.asdName = asdName;
		this.asdLink = asdLink;
		this.asdContent = asdContent;
		this.remark = remark;
		this.enabled = enabled;
	}

	/** full constructor */
	public MallAsdContent(Integer positionId, Short mediaType, String asdName,
			String asdLink, String asdContent, String remark, Short enabled,
			Timestamp lastUpdateTime) {
		this.positionId = positionId;
		this.mediaType = mediaType;
		this.asdName = asdName;
		this.asdLink = asdLink;
		this.asdContent = asdContent;
		this.remark = remark;
		this.enabled = enabled;
		this.lastUpdateTime = lastUpdateTime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "asd_id", unique = true, nullable = false)
	public Integer getAsdId() {
		return this.asdId;
	}

	public void setAsdId(Integer asdId) {
		this.asdId = asdId;
	}

	@Column(name = "position_id", nullable = false)
	public Integer getPositionId() {
		return this.positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	@Column(name = "media_type", nullable = false)
	public Short getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(Short mediaType) {
		this.mediaType = mediaType;
	}

	@Column(name = "asd_name", nullable = false, length = 60)
	public String getAsdName() {
		return this.asdName;
	}

	public void setAsdName(String asdName) {
		this.asdName = asdName;
	}

	@Column(name = "asd_link", nullable = false)
	public String getAsdLink() {
		return this.asdLink;
	}

	public void setAsdLink(String asdLink) {
		this.asdLink = asdLink;
	}

	@Column(name = "asd_content", nullable = false, length = 65535)
	public String getAsdContent() {
		return this.asdContent;
	}

	public void setAsdContent(String asdContent) {
		this.asdContent = asdContent;
	}

	@Column(name = "remark", nullable = false, length = 65535)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "enabled", nullable = false)
	public Short getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Short enabled) {
		this.enabled = enabled;
	}

	@Column(name = "last_update_time", length = 19)
	public Timestamp getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Timestamp lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

}