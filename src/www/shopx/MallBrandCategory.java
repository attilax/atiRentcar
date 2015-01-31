package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallBrandCategory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_brand_category", catalog = "iwmshopnow")
public class MallBrandCategory implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer brandId;
	private Integer catId;

	// Constructors

	/** default constructor */
	public MallBrandCategory() {
	}

	/** full constructor */
	public MallBrandCategory(Integer brandId, Integer catId) {
		this.brandId = brandId;
		this.catId = catId;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "brand_id")
	public Integer getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	@Column(name = "cat_id")
	public Integer getCatId() {
		return this.catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

}