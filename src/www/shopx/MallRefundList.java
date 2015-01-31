package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallRefundList entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_refund_list", catalog = "iwmshopnow")
public class MallRefundList implements java.io.Serializable {

	// Fields

	private Integer refundId;
	private Integer orderId;
	private Integer shopId;
	private String refundWay;
	private String refundAccount;
	private Double refundMoney;
	private String userName;
	private String operator;
	private Timestamp operatorDate;

	// Constructors

	/** default constructor */
	public MallRefundList() {
	}

	/** full constructor */
	public MallRefundList(Integer orderId, Integer shopId, String refundWay,
			String refundAccount, Double refundMoney, String userName,
			String operator, Timestamp operatorDate) {
		this.orderId = orderId;
		this.shopId = shopId;
		this.refundWay = refundWay;
		this.refundAccount = refundAccount;
		this.refundMoney = refundMoney;
		this.userName = userName;
		this.operator = operator;
		this.operatorDate = operatorDate;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "refund_id", unique = true, nullable = false)
	public Integer getRefundId() {
		return this.refundId;
	}

	public void setRefundId(Integer refundId) {
		this.refundId = refundId;
	}

	@Column(name = "order_id")
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "shop_id")
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "refund_way", length = 30)
	public String getRefundWay() {
		return this.refundWay;
	}

	public void setRefundWay(String refundWay) {
		this.refundWay = refundWay;
	}

	@Column(name = "refund_account", length = 30)
	public String getRefundAccount() {
		return this.refundAccount;
	}

	public void setRefundAccount(String refundAccount) {
		this.refundAccount = refundAccount;
	}

	@Column(name = "refund_money", precision = 8)
	public Double getRefundMoney() {
		return this.refundMoney;
	}

	public void setRefundMoney(Double refundMoney) {
		this.refundMoney = refundMoney;
	}

	@Column(name = "user_name", length = 20)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "operator", length = 20)
	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Column(name = "operator_date", length = 19)
	public Timestamp getOperatorDate() {
		return this.operatorDate;
	}

	public void setOperatorDate(Timestamp operatorDate) {
		this.operatorDate = operatorDate;
	}

}