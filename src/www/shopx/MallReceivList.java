package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallReceivList entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_receiv_list", catalog = "iwmshopnow")
public class MallReceivList implements java.io.Serializable {

	// Fields

	private Integer receivId;
	private Integer orderId;
	private String payid;
	private Integer shopId;
	private String paymentType;
	private Timestamp payDate;
	private String receiver;
	private Timestamp receivDate;
	private String receivAccount;
	private Double receivMoney;
	private String operator;

	// Constructors

	/** default constructor */
	public MallReceivList() {
	}

	/** full constructor */
	public MallReceivList(Integer orderId, String payid, Integer shopId,
			String paymentType, Timestamp payDate, String receiver,
			Timestamp receivDate, String receivAccount, Double receivMoney,
			String operator) {
		this.orderId = orderId;
		this.payid = payid;
		this.shopId = shopId;
		this.paymentType = paymentType;
		this.payDate = payDate;
		this.receiver = receiver;
		this.receivDate = receivDate;
		this.receivAccount = receivAccount;
		this.receivMoney = receivMoney;
		this.operator = operator;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "receiv_id", unique = true, nullable = false)
	public Integer getReceivId() {
		return this.receivId;
	}

	public void setReceivId(Integer receivId) {
		this.receivId = receivId;
	}

	@Column(name = "order_id")
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "payid", length = 20)
	public String getPayid() {
		return this.payid;
	}

	public void setPayid(String payid) {
		this.payid = payid;
	}

	@Column(name = "shop_id")
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "payment_type", length = 100)
	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@Column(name = "pay_date", length = 19)
	public Timestamp getPayDate() {
		return this.payDate;
	}

	public void setPayDate(Timestamp payDate) {
		this.payDate = payDate;
	}

	@Column(name = "receiver", length = 20)
	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	@Column(name = "receiv_date", length = 19)
	public Timestamp getReceivDate() {
		return this.receivDate;
	}

	public void setReceivDate(Timestamp receivDate) {
		this.receivDate = receivDate;
	}

	@Column(name = "receiv_account", length = 40)
	public String getReceivAccount() {
		return this.receivAccount;
	}

	public void setReceivAccount(String receivAccount) {
		this.receivAccount = receivAccount;
	}

	@Column(name = "receiv_money", precision = 8)
	public Double getReceivMoney() {
		return this.receivMoney;
	}

	public void setReceivMoney(Double receivMoney) {
		this.receivMoney = receivMoney;
	}

	@Column(name = "operator", length = 20)
	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

}