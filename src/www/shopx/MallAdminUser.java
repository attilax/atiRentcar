package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * MallAdminUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_admin_user", catalog = "iwmshopnow", uniqueConstraints = @UniqueConstraint(columnNames = "admin_name"))
public class MallAdminUser implements java.io.Serializable {

	// Fields

	private Short adminId;
	private String adminName;
	private String adminEmail;
	private String adminPassword;
	private Timestamp addTime;
	private Timestamp lastLogin;
	private String lastIp;
	private Short groupId;

	// Constructors

	/** default constructor */
	public MallAdminUser() {
	}

	/** minimal constructor */
	public MallAdminUser(String adminName, String adminEmail,
			String adminPassword, String lastIp) {
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
		this.lastIp = lastIp;
	}

	/** full constructor */
	public MallAdminUser(String adminName, String adminEmail,
			String adminPassword, Timestamp addTime, Timestamp lastLogin,
			String lastIp, Short groupId) {
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
		this.addTime = addTime;
		this.lastLogin = lastLogin;
		this.lastIp = lastIp;
		this.groupId = groupId;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "admin_id", unique = true, nullable = false)
	public Short getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Short adminId) {
		this.adminId = adminId;
	}

	@Column(name = "admin_name", unique = true, nullable = false, length = 60)
	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	@Column(name = "admin_email", nullable = false, length = 60)
	public String getAdminEmail() {
		return this.adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	@Column(name = "admin_password", nullable = false, length = 32)
	public String getAdminPassword() {
		return this.adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Column(name = "add_time", length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Column(name = "last_login", length = 19)
	public Timestamp getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}

	@Column(name = "last_ip", nullable = false, length = 15)
	public String getLastIp() {
		return this.lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	@Column(name = "group_id")
	public Short getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Short groupId) {
		this.groupId = groupId;
	}

}