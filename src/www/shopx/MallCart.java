package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallCart entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_cart", catalog = "iwmshopnow")
public class MallCart implements java.io.Serializable {

	// Fields

	private Integer cartId;
	private Integer userId;
	private Integer goodsId;
	private Integer goodsNumber;
	private Timestamp addTime;

	// Constructors

	/** default constructor */
	public MallCart() {
	}

	/** minimal constructor */
	public MallCart(Integer userId, Integer goodsId, Integer goodsNumber) {
		this.userId = userId;
		this.goodsId = goodsId;
		this.goodsNumber = goodsNumber;
	}

	/** full constructor */
	public MallCart(Integer userId, Integer goodsId, Integer goodsNumber,
			Timestamp addTime) {
		this.userId = userId;
		this.goodsId = goodsId;
		this.goodsNumber = goodsNumber;
		this.addTime = addTime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cart_id", unique = true, nullable = false)
	public Integer getCartId() {
		return this.cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	@Column(name = "user_id", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "goods_id", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "goods_number", nullable = false)
	public Integer getGoodsNumber() {
		return this.goodsNumber;
	}

	public void setGoodsNumber(Integer goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	@Column(name = "add_time", length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

}