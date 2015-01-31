package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallUserRank entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_user_rank", catalog = "iwmshopnow")
public class MallUserRank implements java.io.Serializable {

	// Fields

	private Integer rankId;
	private String rankName;
	private String privilege;

	// Constructors

	/** default constructor */
	public MallUserRank() {
	}

	/** full constructor */
	public MallUserRank(String rankName, String privilege) {
		this.rankName = rankName;
		this.privilege = privilege;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "rank_id", unique = true, nullable = false)
	public Integer getRankId() {
		return this.rankId;
	}

	public void setRankId(Integer rankId) {
		this.rankId = rankId;
	}

	@Column(name = "rank_name", nullable = false)
	public String getRankName() {
		return this.rankName;
	}

	public void setRankName(String rankName) {
		this.rankName = rankName;
	}

	@Column(name = "privilege", nullable = false)
	public String getPrivilege() {
		return this.privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

}