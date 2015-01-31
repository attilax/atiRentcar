package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallAttribute entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_attribute", catalog = "iwmshopnow")
public class MallAttribute implements java.io.Serializable {

	// Fields

	private Integer attrId;
	private Integer catId;
	private String attrName;
	private Boolean inputType;
	private String attrValues;
	private Boolean sortOrder;

	// Constructors

	/** default constructor */
	public MallAttribute() {
	}

	/** minimal constructor */
	public MallAttribute(Integer catId, String attrName, Boolean inputType,
			Boolean sortOrder) {
		this.catId = catId;
		this.attrName = attrName;
		this.inputType = inputType;
		this.sortOrder = sortOrder;
	}

	/** full constructor */
	public MallAttribute(Integer catId, String attrName, Boolean inputType,
			String attrValues, Boolean sortOrder) {
		this.catId = catId;
		this.attrName = attrName;
		this.inputType = inputType;
		this.attrValues = attrValues;
		this.sortOrder = sortOrder;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "attr_id", unique = true, nullable = false)
	public Integer getAttrId() {
		return this.attrId;
	}

	public void setAttrId(Integer attrId) {
		this.attrId = attrId;
	}

	@Column(name = "cat_id", nullable = false)
	public Integer getCatId() {
		return this.catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	@Column(name = "attr_name", nullable = false)
	public String getAttrName() {
		return this.attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	@Column(name = "input_type", nullable = false)
	public Boolean getInputType() {
		return this.inputType;
	}

	public void setInputType(Boolean inputType) {
		this.inputType = inputType;
	}

	@Column(name = "attr_values", length = 65535)
	public String getAttrValues() {
		return this.attrValues;
	}

	public void setAttrValues(String attrValues) {
		this.attrValues = attrValues;
	}

	@Column(name = "sort_order", nullable = false)
	public Boolean getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Boolean sortOrder) {
		this.sortOrder = sortOrder;
	}

}