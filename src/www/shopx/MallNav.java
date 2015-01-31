package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallNav entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_nav", catalog = "iwmshopnow")
public class MallNav implements java.io.Serializable {

	// Fields

	private Integer id;
	private String navName;
	private String url;
	private Boolean postion;
	private Boolean type;
	private Integer shortOrder;

	// Constructors

	/** default constructor */
	public MallNav() {
	}

	/** minimal constructor */
	public MallNav(Boolean type) {
		this.type = type;
	}

	/** full constructor */
	public MallNav(String navName, String url, Boolean postion, Boolean type,
			Integer shortOrder) {
		this.navName = navName;
		this.url = url;
		this.postion = postion;
		this.type = type;
		this.shortOrder = shortOrder;
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

	@Column(name = "nav_name", length = 100)
	public String getNavName() {
		return this.navName;
	}

	public void setNavName(String navName) {
		this.navName = navName;
	}

	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "postion")
	public Boolean getPostion() {
		return this.postion;
	}

	public void setPostion(Boolean postion) {
		this.postion = postion;
	}

	@Column(name = "type", nullable = false)
	public Boolean getType() {
		return this.type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

	@Column(name = "short_order")
	public Integer getShortOrder() {
		return this.shortOrder;
	}

	public void setShortOrder(Integer shortOrder) {
		this.shortOrder = shortOrder;
	}

}