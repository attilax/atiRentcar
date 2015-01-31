package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallPluginUrl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_plugin_url", catalog = "iwmshopnow")
public class MallPluginUrl implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String layoutId;
	private String url;
	private Short sequence;

	// Constructors

	/** default constructor */
	public MallPluginUrl() {
	}

	/** full constructor */
	public MallPluginUrl(String name, String layoutId, String url,
			Short sequence) {
		this.name = name;
		this.layoutId = layoutId;
		this.url = url;
		this.sequence = sequence;
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

	@Column(name = "name", length = 40)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "layout_id", length = 20)
	public String getLayoutId() {
		return this.layoutId;
	}

	public void setLayoutId(String layoutId) {
		this.layoutId = layoutId;
	}

	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "sequence")
	public Short getSequence() {
		return this.sequence;
	}

	public void setSequence(Short sequence) {
		this.sequence = sequence;
	}

}