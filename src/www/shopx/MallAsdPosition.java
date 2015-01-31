package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallAsdPosition entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_asd_position", catalog = "iwmshopnow")
public class MallAsdPosition implements java.io.Serializable {

	// Fields

	private Integer positionId;
	private String positionName;
	private Short asdWidth;
	private Short asdHeight;
	private String positionDesc;

	// Constructors

	/** default constructor */
	public MallAsdPosition() {
	}

	/** full constructor */
	public MallAsdPosition(String positionName, Short asdWidth,
			Short asdHeight, String positionDesc) {
		this.positionName = positionName;
		this.asdWidth = asdWidth;
		this.asdHeight = asdHeight;
		this.positionDesc = positionDesc;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "position_id", unique = true, nullable = false)
	public Integer getPositionId() {
		return this.positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	@Column(name = "position_name", nullable = false, length = 60)
	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	@Column(name = "asd_width", nullable = false)
	public Short getAsdWidth() {
		return this.asdWidth;
	}

	public void setAsdWidth(Short asdWidth) {
		this.asdWidth = asdWidth;
	}

	@Column(name = "asd_height", nullable = false)
	public Short getAsdHeight() {
		return this.asdHeight;
	}

	public void setAsdHeight(Short asdHeight) {
		this.asdHeight = asdHeight;
	}

	@Column(name = "position_desc", nullable = false)
	public String getPositionDesc() {
		return this.positionDesc;
	}

	public void setPositionDesc(String positionDesc) {
		this.positionDesc = positionDesc;
	}

}