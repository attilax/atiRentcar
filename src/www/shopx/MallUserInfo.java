package www.shopx;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * MallUserInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_user_info", catalog = "iwmshopnow", uniqueConstraints = @UniqueConstraint(columnNames = "user_id"))
public class MallUserInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private String userTruename;
	private String userIco;
	private Boolean userMarry;
	private Boolean userGender;
	private String userMobile;
	private String userTelphone;
	private Short userCountry;
	private Short userProvince;
	private Short userCity;
	private Short userDistrict;
	private String userZipcode;
	private String userAddress;
	private Date userBirthday;
	private String userQq;
	private String userMsn;
	private String userSkype;

	// Constructors

	/** default constructor */
	public MallUserInfo() {
	}

	/** minimal constructor */
	public MallUserInfo(Integer userId, String userTruename, Boolean userMarry,
			Boolean userGender) {
		this.userId = userId;
		this.userTruename = userTruename;
		this.userMarry = userMarry;
		this.userGender = userGender;
	}

	/** full constructor */
	public MallUserInfo(Integer userId, String userTruename, String userIco,
			Boolean userMarry, Boolean userGender, String userMobile,
			String userTelphone, Short userCountry, Short userProvince,
			Short userCity, Short userDistrict, String userZipcode,
			String userAddress, Date userBirthday, String userQq,
			String userMsn, String userSkype) {
		this.userId = userId;
		this.userTruename = userTruename;
		this.userIco = userIco;
		this.userMarry = userMarry;
		this.userGender = userGender;
		this.userMobile = userMobile;
		this.userTelphone = userTelphone;
		this.userCountry = userCountry;
		this.userProvince = userProvince;
		this.userCity = userCity;
		this.userDistrict = userDistrict;
		this.userZipcode = userZipcode;
		this.userAddress = userAddress;
		this.userBirthday = userBirthday;
		this.userQq = userQq;
		this.userMsn = userMsn;
		this.userSkype = userSkype;
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

	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "user_truename", nullable = false)
	public String getUserTruename() {
		return this.userTruename;
	}

	public void setUserTruename(String userTruename) {
		this.userTruename = userTruename;
	}

	@Column(name = "user_ico")
	public String getUserIco() {
		return this.userIco;
	}

	public void setUserIco(String userIco) {
		this.userIco = userIco;
	}

	@Column(name = "user_marry", nullable = false)
	public Boolean getUserMarry() {
		return this.userMarry;
	}

	public void setUserMarry(Boolean userMarry) {
		this.userMarry = userMarry;
	}

	@Column(name = "user_gender", nullable = false)
	public Boolean getUserGender() {
		return this.userGender;
	}

	public void setUserGender(Boolean userGender) {
		this.userGender = userGender;
	}

	@Column(name = "user_mobile", length = 20)
	public String getUserMobile() {
		return this.userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	@Column(name = "user_telphone", length = 20)
	public String getUserTelphone() {
		return this.userTelphone;
	}

	public void setUserTelphone(String userTelphone) {
		this.userTelphone = userTelphone;
	}

	@Column(name = "user_country")
	public Short getUserCountry() {
		return this.userCountry;
	}

	public void setUserCountry(Short userCountry) {
		this.userCountry = userCountry;
	}

	@Column(name = "user_province")
	public Short getUserProvince() {
		return this.userProvince;
	}

	public void setUserProvince(Short userProvince) {
		this.userProvince = userProvince;
	}

	@Column(name = "user_city")
	public Short getUserCity() {
		return this.userCity;
	}

	public void setUserCity(Short userCity) {
		this.userCity = userCity;
	}

	@Column(name = "user_district")
	public Short getUserDistrict() {
		return this.userDistrict;
	}

	public void setUserDistrict(Short userDistrict) {
		this.userDistrict = userDistrict;
	}

	@Column(name = "user_zipcode", length = 6)
	public String getUserZipcode() {
		return this.userZipcode;
	}

	public void setUserZipcode(String userZipcode) {
		this.userZipcode = userZipcode;
	}

	@Column(name = "user_address")
	public String getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "user_birthday", length = 10)
	public Date getUserBirthday() {
		return this.userBirthday;
	}

	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}

	@Column(name = "user_qq", length = 16)
	public String getUserQq() {
		return this.userQq;
	}

	public void setUserQq(String userQq) {
		this.userQq = userQq;
	}

	@Column(name = "user_msn", length = 50)
	public String getUserMsn() {
		return this.userMsn;
	}

	public void setUserMsn(String userMsn) {
		this.userMsn = userMsn;
	}

	@Column(name = "user_skype", length = 50)
	public String getUserSkype() {
		return this.userSkype;
	}

	public void setUserSkype(String userSkype) {
		this.userSkype = userSkype;
	}

}