package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallAdminLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_admin_log", catalog = "iwmshopnow")
public class MallAdminLog implements java.io.Serializable {

	// Fields

	private Integer logId;
	private Timestamp logTime;
	private Short adminId;
	private String adminName;
	private String logInfo;
	private String ipAddress;

	// Constructors

	/** default constructor */
	public MallAdminLog() {
	}

	/** minimal constructor */
	public MallAdminLog(Short adminId, String logInfo, String ipAddress) {
		this.adminId = adminId;
		this.logInfo = logInfo;
		this.ipAddress = ipAddress;
	}

	/** full constructor */
	public MallAdminLog(Timestamp logTime, Short adminId, String adminName,
			String logInfo, String ipAddress) {
		this.logTime = logTime;
		this.adminId = adminId;
		this.adminName = adminName;
		this.logInfo = logInfo;
		this.ipAddress = ipAddress;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "log_id", unique = true, nullable = false)
	public Integer getLogId() {
		return this.logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	@Column(name = "log_time", length = 19)
	public Timestamp getLogTime() {
		return this.logTime;
	}

	public void setLogTime(Timestamp logTime) {
		this.logTime = logTime;
	}

	@Column(name = "admin_id", nullable = false)
	public Short getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Short adminId) {
		this.adminId = adminId;
	}

	@Column(name = "admin_name")
	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	@Column(name = "log_info", nullable = false)
	public String getLogInfo() {
		return this.logInfo;
	}

	public void setLogInfo(String logInfo) {
		this.logInfo = logInfo;
	}

	@Column(name = "ip_address", nullable = false, length = 15)
	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

}