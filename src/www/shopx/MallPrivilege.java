package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallPrivilege entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_privilege", catalog = "iwmshopnow")
public class MallPrivilege implements java.io.Serializable {

	// Fields

	private Integer privilegeId;
	private String privilegeName;
	private String privilegeRemark;
	private Boolean privilegeType;

	// Constructors

	/** default constructor */
	public MallPrivilege() {
	}

	/** minimal constructor */
	public MallPrivilege(String privilegeName, Boolean privilegeType) {
		this.privilegeName = privilegeName;
		this.privilegeType = privilegeType;
	}

	/** full constructor */
	public MallPrivilege(String privilegeName, String privilegeRemark,
			Boolean privilegeType) {
		this.privilegeName = privilegeName;
		this.privilegeRemark = privilegeRemark;
		this.privilegeType = privilegeType;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "privilege_id", unique = true, nullable = false)
	public Integer getPrivilegeId() {
		return this.privilegeId;
	}

	public void setPrivilegeId(Integer privilegeId) {
		this.privilegeId = privilegeId;
	}

	@Column(name = "privilege_name", nullable = false)
	public String getPrivilegeName() {
		return this.privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	@Column(name = "privilege_remark", length = 65535)
	public String getPrivilegeRemark() {
		return this.privilegeRemark;
	}

	public void setPrivilegeRemark(String privilegeRemark) {
		this.privilegeRemark = privilegeRemark;
	}

	@Column(name = "privilege_type", nullable = false)
	public Boolean getPrivilegeType() {
		return this.privilegeType;
	}

	public void setPrivilegeType(Boolean privilegeType) {
		this.privilegeType = privilegeType;
	}

}