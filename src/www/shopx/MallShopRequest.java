package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallShopRequest entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_shop_request", catalog = "iwmshopnow")
public class MallShopRequest implements java.io.Serializable {

	// Fields

	private Integer requestId;
	private Integer userId;
	private String companyName;
	private String personName;
	private String creditType;
	private String creditNum;
	private String creditCommercial;
	private String companyArea;
	private String companyAddress;
	private Integer zipcode;
	private String mobile;
	private String telphone;
	private Timestamp addTime;
	private Short status;

	// Constructors

	/** default constructor */
	public MallShopRequest() {
	}

	/** minimal constructor */
	public MallShopRequest(String companyName) {
		this.companyName = companyName;
	}

	/** full constructor */
	public MallShopRequest(Integer userId, String companyName,
			String personName, String creditType, String creditNum,
			String creditCommercial, String companyArea, String companyAddress,
			Integer zipcode, String mobile, String telphone, Timestamp addTime,
			Short status) {
		this.userId = userId;
		this.companyName = companyName;
		this.personName = personName;
		this.creditType = creditType;
		this.creditNum = creditNum;
		this.creditCommercial = creditCommercial;
		this.companyArea = companyArea;
		this.companyAddress = companyAddress;
		this.zipcode = zipcode;
		this.mobile = mobile;
		this.telphone = telphone;
		this.addTime = addTime;
		this.status = status;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "request_id", unique = true, nullable = false)
	public Integer getRequestId() {
		return this.requestId;
	}

	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}

	@Column(name = "user_id")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "company_name", nullable = false)
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "person_name")
	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Column(name = "credit_type")
	public String getCreditType() {
		return this.creditType;
	}

	public void setCreditType(String creditType) {
		this.creditType = creditType;
	}

	@Column(name = "credit_num")
	public String getCreditNum() {
		return this.creditNum;
	}

	public void setCreditNum(String creditNum) {
		this.creditNum = creditNum;
	}

	@Column(name = "credit_commercial")
	public String getCreditCommercial() {
		return this.creditCommercial;
	}

	public void setCreditCommercial(String creditCommercial) {
		this.creditCommercial = creditCommercial;
	}

	@Column(name = "company_area")
	public String getCompanyArea() {
		return this.companyArea;
	}

	public void setCompanyArea(String companyArea) {
		this.companyArea = companyArea;
	}

	@Column(name = "company_address")
	public String getCompanyAddress() {
		return this.companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	@Column(name = "zipcode")
	public Integer getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "mobile", length = 50)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "telphone", length = 50)
	public String getTelphone() {
		return this.telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	@Column(name = "add_time", length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Column(name = "status")
	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

}