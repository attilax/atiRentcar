package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallGoodsAttr entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_goods_attr", catalog = "iwmshopnow")
public class MallGoodsAttr implements java.io.Serializable {

	// Fields

	private Integer goodsAttrId;
	private Integer goodsId;
	private Integer attrId;
	private String attrValues;

	// Constructors

	/** default constructor */
	public MallGoodsAttr() {
	}

	/** minimal constructor */
	public MallGoodsAttr(Integer goodsId, Integer attrId) {
		this.goodsId = goodsId;
		this.attrId = attrId;
	}

	/** full constructor */
	public MallGoodsAttr(Integer goodsId, Integer attrId, String attrValues) {
		this.goodsId = goodsId;
		this.attrId = attrId;
		this.attrValues = attrValues;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "goods_attr_id", unique = true, nullable = false)
	public Integer getGoodsAttrId() {
		return this.goodsAttrId;
	}

	public void setGoodsAttrId(Integer goodsAttrId) {
		this.goodsAttrId = goodsAttrId;
	}

	@Column(name = "goods_id", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "attr_id", nullable = false)
	public Integer getAttrId() {
		return this.attrId;
	}

	public void setAttrId(Integer attrId) {
		this.attrId = attrId;
	}

	@Column(name = "attr_values", length = 65535)
	public String getAttrValues() {
		return this.attrValues;
	}

	public void setAttrValues(String attrValues) {
		this.attrValues = attrValues;
	}

}