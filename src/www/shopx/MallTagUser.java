package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallTagUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_tag_user", catalog = "iwmshopnow")
public class MallTagUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer tagId;
	private Integer userId;
	private Timestamp addTime;

	// Constructors

	/** default constructor */
	public MallTagUser() {
	}

	/** full constructor */
	public MallTagUser(Integer tagId, Integer userId, Timestamp addTime) {
		this.tagId = tagId;
		this.userId = userId;
		this.addTime = addTime;
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

	@Column(name = "tag_id")
	public Integer getTagId() {
		return this.tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	@Column(name = "user_id")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "add_time", length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

}