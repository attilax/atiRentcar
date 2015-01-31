package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallAdminGroup entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_admin_group", catalog = "iwmshopnow")
public class MallAdminGroup implements java.io.Serializable {

	// Fields

	private Short id;
	private String groupName;
	private Short delFlg;
	private String rights;

	// Constructors

	/** default constructor */
	public MallAdminGroup() {
	}

	/** minimal constructor */
	public MallAdminGroup(String groupName) {
		this.groupName = groupName;
	}

	/** full constructor */
	public MallAdminGroup(String groupName, Short delFlg, String rights) {
		this.groupName = groupName;
		this.delFlg = delFlg;
		this.rights = rights;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	@Column(name = "group_name", nullable = false)
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Column(name = "del_flg")
	public Short getDelFlg() {
		return this.delFlg;
	}

	public void setDelFlg(Short delFlg) {
		this.delFlg = delFlg;
	}

	@Column(name = "rights", length = 65535)
	public String getRights() {
		return this.rights;
	}

	public void setRights(String rights) {
		this.rights = rights;
	}

}