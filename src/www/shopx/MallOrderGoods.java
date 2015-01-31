package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallOrderGoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_order_goods", catalog = "iwmshopnow")
public class MallOrderGoods implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer orderId;
	private Integer goodsId;
	private String goodsName;
	private Double goodsPrice;
	private Integer shopId;
	private Integer orderNum;
	private Integer photoid;
	private Double goodTran;
	private Timestamp addTime;

	// Constructors

	/** default constructor */
	public MallOrderGoods() {
	}

	/** minimal constructor */
	public MallOrderGoods(Integer orderId, Integer goodsId, String goodsName,
			Double goodsPrice, Integer shopId, Integer orderNum) {
		this.orderId = orderId;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.shopId = shopId;
		this.orderNum = orderNum;
	}

	/** full constructor */
	public MallOrderGoods(Integer orderId, Integer goodsId, String goodsName,
			Double goodsPrice, Integer shopId, Integer orderNum,
			Integer photoid, Double goodTran, Timestamp addTime) {
		this.orderId = orderId;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.shopId = shopId;
		this.orderNum = orderNum;
		this.photoid = photoid;
		this.goodTran = goodTran;
		this.addTime = addTime;
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

	@Column(name = "order_id", nullable = false)
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "goods_id", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "goods_name", nullable = false)
	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	@Column(name = "goods_price", nullable = false, precision = 10)
	public Double getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	@Column(name = "shop_id", nullable = false)
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "order_num", nullable = false)
	public Integer getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	@Column(name = "photoid")
	public Integer getPhotoid() {
		return this.photoid;
	}

	public void setPhotoid(Integer photoid) {
		this.photoid = photoid;
	}

	@Column(name = "good_tran", precision = 10)
	public Double getGoodTran() {
		return this.goodTran;
	}

	public void setGoodTran(Double goodTran) {
		this.goodTran = goodTran;
	}

	@Column(name = "add_time", length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

}