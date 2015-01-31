package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallCategory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_category", catalog = "iwmshopnow")
public class MallCategory implements java.io.Serializable {

	// Fields

	private Integer catId;
	private String catName;
	private Integer parentId;
	private Boolean sortOrder;
	private Integer goodsNum;

	// Constructors

	/** default constructor */
	public MallCategory() {
	}

	/** full constructor */
	public MallCategory(String catName, Integer parentId, Boolean sortOrder,
			Integer goodsNum) {
		this.catName = catName;
		this.parentId = parentId;
		this.sortOrder = sortOrder;
		this.goodsNum = goodsNum;
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

	@Column(name = "goods_num", nullable = false)
	public Integer getGoodsNum() {
		return this.goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

}