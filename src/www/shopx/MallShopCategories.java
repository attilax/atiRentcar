package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallShopCategories entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_shop_categories", catalog = "iwmshopnow")
public class MallShopCategories implements java.io.Serializable {

	// Fields

	private Integer catId;
	private String catName;
	private Integer parentId;
	private Boolean sortOrder;
	private Integer shopsNum;

	// Constructors

	/** default constructor */
	public MallShopCategories() {
	}

	/** full constructor */
	public MallShopCategories(String catName, Integer parentId,
			Boolean sortOrder, Integer shopsNum) {
		this.catName = catName;
		this.parentId = parentId;
		this.sortOrder = sortOrder;
		this.shopsNum = shopsNum;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cat_id", unique = true, nullable = false)
	public Integer getCatId() {
		return this.catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	@Column(name = "cat_name", nullable = false, length = 50)
	public String getCatName() {
		return this.catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	@Column(name = "parent_id", nullable = false)
	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Column(name = "sort_order", nullable = false)
	public Boolean getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Boolean sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Column(name = "shops_num", nullable = false)
	public Integer getShopsNum() {
		return this.shopsNum;
	}

	public void setShopsNum(Integer shopsNum) {
		this.shopsNum = shopsNum;
	}

}