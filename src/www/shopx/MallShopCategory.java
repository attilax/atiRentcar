package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallShopCategory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_shop_category", catalog = "iwmshopnow")
public class MallShopCategory implements java.io.Serializable {

	// Fields

	private Integer shopCatId;
	private Integer shopId;
	private String shopCatName;
	private String shopCatUnit;
	private Integer parentId;
	private Boolean sortOrder;

	// Constructors

	/** default constructor */
	public MallShopCategory() {
	}

	/** full constructor */
	public MallShopCategory(Integer shopId, String shopCatName,
			String shopCatUnit, Integer parentId, Boolean sortOrder) {
		this.shopId = shopId;
		this.shopCatName = shopCatName;
		this.shopCatUnit = shopCatUnit;
		this.parentId = parentId;
		this.sortOrder = sortOrder;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "shop_cat_id", unique = true, nullable = false)
	public Integer getShopCatId() {
		return this.shopCatId;
	}

	public void setShopCatId(Integer shopCatId) {
		this.shopCatId = shopCatId;
	}

	@Column(name = "shop_id", nullable = false)
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "shop_cat_name", nullable = false, length = 50)
	public String getShopCatName() {
		return this.shopCatName;
	}

	public void setShopCatName(String shopCatName) {
		this.shopCatName = shopCatName;
	}

	@Column(name = "shop_cat_unit", nullable = false, length = 20)
	public String getShopCatUnit() {
		return this.shopCatUnit;
	}

	public void setShopCatUnit(String shopCatUnit) {
		this.shopCatUnit = shopCatUnit;
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

}