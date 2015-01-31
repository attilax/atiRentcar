package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallIndexImages entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_index_images", catalog = "iwmshopnow")
public class MallIndexImages implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String imagesUrl;
	private String imagesLink;
	private Timestamp addTime;
	private Boolean status;

	// Constructors

	/** default constructor */
	public MallIndexImages() {
	}

	/** minimal constructor */
	public MallIndexImages(String name, String imagesUrl, String imagesLink,
			Boolean status) {
		this.name = name;
		this.imagesUrl = imagesUrl;
		this.imagesLink = imagesLink;
		this.status = status;
	}

	/** full constructor */
	public MallIndexImages(String name, String imagesUrl, String imagesLink,
			Timestamp addTime, Boolean status) {
		this.name = name;
		this.imagesUrl = imagesUrl;
		this.imagesLink = imagesLink;
		this.addTime = addTime;
		this.status = status;
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

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "images_url", nullable = false)
	public String getImagesUrl() {
		return this.imagesUrl;
	}

	public void setImagesUrl(String imagesUrl) {
		this.imagesUrl = imagesUrl;
	}

	@Column(name = "images_link", nullable = false)
	public String getImagesLink() {
		return this.imagesLink;
	}

	public void setImagesLink(String imagesLink) {
		this.imagesLink = imagesLink;
	}

	@Column(name = "add_time", length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Column(name = "status", nullable = false)
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}