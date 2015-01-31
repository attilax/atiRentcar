package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallAreas entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_areas", catalog = "iwmshopnow")
public class MallAreas implements java.io.Serializable {

	// Fields

	private Short areaId;
	private Short parentId;
	private String areaName;
	private Boolean areaType;

	// Constructors

	/** default constructor */
	public MallAreas() {
	}

	/** full constructor */
	public MallAreas(Short parentId, String areaName, Boolean areaType) {
		this.parentId = parentId;
		this.areaName = areaName;
		this.areaType = areaType;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "area_id", unique = true, nullable = false)
	public Short getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Short areaId) {
		this.areaId = areaId;
	}

	@Column(name = "parent_id", nullable = false)
	public Short getParentId() {
		return this.parentId;
	}

	public void setParentId(Short parentId) {
		this.parentId = parentId;
	}

	@Column(name = "area_name", nullable = false, length = 120)
	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Column(name = "area_type", nullable = false)
	public Boolean getAreaType() {
		return this.areaType;
	}

	public void setAreaType(Boolean areaType) {
		this.areaType = areaType;
	}

}