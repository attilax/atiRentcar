package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallShipping entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_shipping", catalog = "iwmshopnow")
public class MallShipping implements java.io.Serializable {

	// Fields

	private Integer shippingId;
	private String shippingName;
	private Double shippingFee;
	private String shippingDesc;
	private Boolean enabled;

	// Constructors

	/** default constructor */
	public MallShipping() {
	}

	/** minimal constructor */
	public MallShipping(String shippingName, Double shippingFee, Boolean enabled) {
		this.shippingName = shippingName;
		this.shippingFee = shippingFee;
		this.enabled = enabled;
	}

	/** full constructor */
	public MallShipping(String shippingName, Double shippingFee,
			String shippingDesc, Boolean enabled) {
		this.shippingName = shippingName;
		this.shippingFee = shippingFee;
		this.shippingDesc = shippingDesc;
		this.enabled = enabled;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "shipping_id", unique = true, nullable = false)
	public Integer getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}

	@Column(name = "shipping_name", nullable = false)
	public String getShippingName() {
		return this.shippingName;
	}

	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}

	@Column(name = "shipping_fee", nullable = false, precision = 6)
	public Double getShippingFee() {
		return this.shippingFee;
	}

	public void setShippingFee(Double shippingFee) {
		this.shippingFee = shippingFee;
	}

	@Column(name = "shipping_desc", length = 65535)
	public String getShippingDesc() {
		return this.shippingDesc;
	}

	public void setShippingDesc(String shippingDesc) {
		this.shippingDesc = shippingDesc;
	}

	@Column(name = "enabled", nullable = false)
	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}