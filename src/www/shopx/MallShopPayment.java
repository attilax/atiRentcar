package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallShopPayment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_shop_payment", catalog = "iwmshopnow")
public class MallShopPayment implements java.io.Serializable {

	// Fields

	private Integer shopPaymentId;
	private Integer shopId;
	private Integer payId;
	private String payDesc;
	private String payConfig;
	private Boolean enabled;

	// Constructors

	/** default constructor */
	public MallShopPayment() {
	}

	/** minimal constructor */
	public MallShopPayment(Integer shopId, Integer payId, Boolean enabled) {
		this.shopId = shopId;
		this.payId = payId;
		this.enabled = enabled;
	}

	/** full constructor */
	public MallShopPayment(Integer shopId, Integer payId, String payDesc,
			String payConfig, Boolean enabled) {
		this.shopId = shopId;
		this.payId = payId;
		this.payDesc = payDesc;
		this.payConfig = payConfig;
		this.enabled = enabled;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "shop_payment_id", unique = true, nullable = false)
	public Integer getShopPaymentId() {
		return this.shopPaymentId;
	}

	public void setShopPaymentId(Integer shopPaymentId) {
		this.shopPaymentId = shopPaymentId;
	}

	@Column(name = "shop_id", nullable = false)
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "pay_id", nullable = false)
	public Integer getPayId() {
		return this.payId;
	}

	public void setPayId(Integer payId) {
		this.payId = payId;
	}

	@Column(name = "pay_desc", length = 65535)
	public String getPayDesc() {
		return this.payDesc;
	}

	public void setPayDesc(String payDesc) {
		this.payDesc = payDesc;
	}

	@Column(name = "pay_config", length = 65535)
	public String getPayConfig() {
		return this.payConfig;
	}

	public void setPayConfig(String payConfig) {
		this.payConfig = payConfig;
	}

	@Column(name = "enabled", nullable = false)
	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}