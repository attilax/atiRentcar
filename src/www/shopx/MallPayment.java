package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
 

/**
 * MallPayment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_payment", catalog = "iwmshopnow")
public class MallPayment implements java.io.Serializable {

	// Fields

	private Integer payId;
	private String version;
	private String payName;
	private String payCode;
	private String payDesc;
	private String author;
	private String config;
	private Boolean enabled;

	// Constructors

	/** default constructor */
	public MallPayment() {
	}

	/** minimal constructor */
	public MallPayment(String payName, String payCode, String author,
			Boolean enabled) {
		this.payName = payName;
		this.payCode = payCode;
		this.author = author;
		this.enabled = enabled;
	}

	/** full constructor */
	public MallPayment(String payName, String payCode, String payDesc,
			String author, String config, Boolean enabled) {
		this.payName = payName;
		this.payCode = payCode;
		this.payDesc = payDesc;
		this.author = author;
		this.config = config;
		this.enabled = enabled;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "pay_id", unique = true, nullable = false)
	public Integer getPayId() {
		return this.payId;
	}

	public void setPayId(Integer payId) {
		this.payId = payId;
	}
 
	@Column(name = "version", nullable = false, length = 20)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "pay_name", nullable = false)
	public String getPayName() {
		return this.payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	@Column(name = "pay_code", nullable = false)
	public String getPayCode() {
		return this.payCode;
	}

	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	@Column(name = "pay_desc", length = 65535)
	public String getPayDesc() {
		return this.payDesc;
	}

	public void setPayDesc(String payDesc) {
		this.payDesc = payDesc;
	}

	@Column(name = "author", nullable = false, length = 200)
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "config", length = 65535)
	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	@Column(name = "enabled", nullable = false)
	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}