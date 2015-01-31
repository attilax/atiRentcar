package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallCredit entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_credit", catalog = "iwmshopnow")
public class MallCredit implements java.io.Serializable {

	// Fields

	private Integer cid;
	private Integer orderId;
	private Integer goodsId;
	private Integer buyer;
	private Boolean buyerCredit;
	private String buyerEvaluate;
	private Timestamp buyerEvaltime;
	private String buyerExplanation;
	private Timestamp buyerExptime;
	private Integer seller;
	private Boolean sellerCredit;
	private String sellerEvaluate;
	private Timestamp sellerEvaltime;
	private String sellerExplanation;
	private Timestamp sellerExptime;

	// Constructors

	/** default constructor */
	public MallCredit() {
	}

	/** minimal constructor */
	public MallCredit(Integer orderId, Integer goodsId, Integer buyer,
			Boolean buyerCredit, Integer seller, Boolean sellerCredit) {
		this.orderId = orderId;
		this.goodsId = goodsId;
		this.buyer = buyer;
		this.buyerCredit = buyerCredit;
		this.seller = seller;
		this.sellerCredit = sellerCredit;
	}

	/** full constructor */
	public MallCredit(Integer orderId, Integer goodsId, Integer buyer,
			Boolean buyerCredit, String buyerEvaluate, Timestamp buyerEvaltime,
			String buyerExplanation, Timestamp buyerExptime, Integer seller,
			Boolean sellerCredit, String sellerEvaluate,
			Timestamp sellerEvaltime, String sellerExplanation,
			Timestamp sellerExptime) {
		this.orderId = orderId;
		this.goodsId = goodsId;
		this.buyer = buyer;
		this.buyerCredit = buyerCredit;
		this.buyerEvaluate = buyerEvaluate;
		this.buyerEvaltime = buyerEvaltime;
		this.buyerExplanation = buyerExplanation;
		this.buyerExptime = buyerExptime;
		this.seller = seller;
		this.sellerCredit = sellerCredit;
		this.sellerEvaluate = sellerEvaluate;
		this.sellerEvaltime = sellerEvaltime;
		this.sellerExplanation = sellerExplanation;
		this.sellerExptime = sellerExptime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cid", unique = true, nullable = false)
	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
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

	@Column(name = "buyer", nullable = false)
	public Integer getBuyer() {
		return this.buyer;
	}

	public void setBuyer(Integer buyer) {
		this.buyer = buyer;
	}

	@Column(name = "buyer_credit", nullable = false)
	public Boolean getBuyerCredit() {
		return this.buyerCredit;
	}

	public void setBuyerCredit(Boolean buyerCredit) {
		this.buyerCredit = buyerCredit;
	}

	@Column(name = "buyer_evaluate", length = 65535)
	public String getBuyerEvaluate() {
		return this.buyerEvaluate;
	}

	public void setBuyerEvaluate(String buyerEvaluate) {
		this.buyerEvaluate = buyerEvaluate;
	}

	@Column(name = "buyer_evaltime", length = 19)
	public Timestamp getBuyerEvaltime() {
		return this.buyerEvaltime;
	}

	public void setBuyerEvaltime(Timestamp buyerEvaltime) {
		this.buyerEvaltime = buyerEvaltime;
	}

	@Column(name = "buyer_explanation", length = 65535)
	public String getBuyerExplanation() {
		return this.buyerExplanation;
	}

	public void setBuyerExplanation(String buyerExplanation) {
		this.buyerExplanation = buyerExplanation;
	}

	@Column(name = "buyer_exptime", length = 19)
	public Timestamp getBuyerExptime() {
		return this.buyerExptime;
	}

	public void setBuyerExptime(Timestamp buyerExptime) {
		this.buyerExptime = buyerExptime;
	}

	@Column(name = "seller", nullable = false)
	public Integer getSeller() {
		return this.seller;
	}

	public void setSeller(Integer seller) {
		this.seller = seller;
	}

	@Column(name = "seller_credit", nullable = false)
	public Boolean getSellerCredit() {
		return this.sellerCredit;
	}

	public void setSellerCredit(Boolean sellerCredit) {
		this.sellerCredit = sellerCredit;
	}

	@Column(name = "seller_evaluate", length = 65535)
	public String getSellerEvaluate() {
		return this.sellerEvaluate;
	}

	public void setSellerEvaluate(String sellerEvaluate) {
		this.sellerEvaluate = sellerEvaluate;
	}

	@Column(name = "seller_evaltime", length = 19)
	public Timestamp getSellerEvaltime() {
		return this.sellerEvaltime;
	}

	public void setSellerEvaltime(Timestamp sellerEvaltime) {
		this.sellerEvaltime = sellerEvaltime;
	}

	@Column(name = "seller_explanation", length = 65535)
	public String getSellerExplanation() {
		return this.sellerExplanation;
	}

	public void setSellerExplanation(String sellerExplanation) {
		this.sellerExplanation = sellerExplanation;
	}

	@Column(name = "seller_exptime", length = 19)
	public Timestamp getSellerExptime() {
		return this.sellerExptime;
	}

	public void setSellerExptime(Timestamp sellerExptime) {
		this.sellerExptime = sellerExptime;
	}

}