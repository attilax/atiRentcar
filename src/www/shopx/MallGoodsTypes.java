package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallGoodsTypes entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_goods_types", catalog = "iwmshopnow")
public class MallGoodsTypes implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String typeName;
	private Boolean isShow;

	// Constructors

	/** default constructor */
	public MallGoodsTypes() {
	}

	/** full constructor */
	public MallGoodsTypes(String typeName, Boolean isShow) {
		this.typeName = typeName;
		this.isShow = isShow;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "type_id", unique = true, nullable = false)
	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	@Column(name = "type_name", nullable = false)
	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Column(name = "is_show", nullable = false)
	public Boolean getIsShow() {
		return this.isShow;
	}

	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
	}

}