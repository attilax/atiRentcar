package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallGoodsShipping entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_goods_shipping", catalog = "iwmshopnow")
public class MallGoodsShipping implements java.io.Serializable {

	// Fields

	private Integer goosShippingId;
	private Integer goodsId;
	private Integer shippingId;
	private Double shippingFee;

	// Constructors

	/** default constructor */
	public MallGoodsShipping() {
	}

	/** full constructor */
	public MallGoodsShipping(Integer goodsId, Integer shippingId,
			Double shippingFee) {
		this.goodsId = goodsId;
		this.shippingId = shippingId;
		this.shippingFee = shippingFee;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "goos_shipping_id", unique = true, nullable = false)
	public Integer getGoosShippingId() {
		return this.goosShippingId;
	}

	public void setGoosShippingId(Integer goosShippingId) {
		this.goosShippingId = goosShippingId;
	}

	@Column(name = "goods_id", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "shipping_id", nullable = false)
	public Integer getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}

	@Column(name = "shipping_fee", nullable = false, precision = 6)
	public Double getShippingFee() {
		return this.shippingFee;
	}

	public void setShippingFee(Double shippingFee) {
		this.shippingFee = shippingFee;
	}

}