package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallUserAddress entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_user_address", catalog = "iwmshopnow")
public class MallUserAddress implements java.io.Serializable {

	// Fields

	private Integer addressId;
	private Integer userId;
	private String toUserName;
	private String fullAddress;
	private String zipcode;
	private String telphone;
	private String mobile;
	private Short userCountry;
	private Short userProvince;
	private Short userCity;
	private Short userDistrict;
	private String email;

	// Constructors

	/** default constructor */
	public MallUserAddress() {
	}

	/** full constructor */
	public MallUserAddress(Integer userId, String toUserName,
			String fullAddress, String zipcode, String telphone, String mobile,
			Short userCountry, Short userProvince, Short userCity,
			Short userDistrict, String email) {
		this.userId = userId;
		this.toUserName = toUserName;
		this.fullAddress = fullAddress;
		this.zipcode = zipcode;
		this.telphone = telphone;
		this.mobile = mobile;
		this.userCountry = userCountry;
		this.userProvince = userProvince;
		this.userCity = userCity;
		this.userDistrict = userDistrict;
		this.email = email;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "address_id", unique = true, nullable = false)
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "user_id", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "to_user_name", nullable = false, length = 60)
	public String getToUserName() {
		return this.toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	@Column(name = "full_address", nullable = false, length = 200)
	public String getFullAddress() {
		return this.fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	@Column(name = "zipcode", nullable = false, length = 10)
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "telphone", nullable = false, length = 20)
	public String getTelphone() {
		return this.telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	@Column(name = "mobile", nullable = false, length = 20)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "user_country", nullable = false)
	public Short getUserCountry() {
		return this.userCountry;
	}

	public void setUserCountry(Short userCountry) {
		this.userCountry = userCountry;
	}

	@Column(name = "user_province", nullable = false)
	public Short getUserProvince() {
		return this.userProvince;
	}

	public void setUserProvince(Short userProvince) {
		this.userProvince = userProvince;
	}

	@Column(name = "user_city", nullable = false)
	public Short getUserCity() {
		return this.userCity;
	}

	public void setUserCity(Short userCity) {
		this.userCity = userCity;
	}

	@Column(name = "user_district", nullable = false)
	public Short getUserDistrict() {
		return this.userDistrict;
	}

	public void setUserDistrict(Short userDistrict) {
		this.userDistrict = userDistrict;
	}

	@Column(name = "email", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}