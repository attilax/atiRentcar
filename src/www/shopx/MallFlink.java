package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallFlink entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_flink", catalog = "iwmshopnow")
public class MallFlink implements java.io.Serializable {

	// Fields

	private Short brandId;
	private String brandName;
	private String brandLogo;
	private String brandDesc;
	private String siteUrl;
	private Boolean isShow;

	// Constructors

	/** default constructor */
	public MallFlink() {
	}

	/** full constructor */
	public MallFlink(String brandName, String brandLogo, String brandDesc,
			String siteUrl, Boolean isShow) {
		this.brandName = brandName;
		this.brandLogo = brandLogo;
		this.brandDesc = brandDesc;
		this.siteUrl = siteUrl;
		this.isShow = isShow;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "brand_id", unique = true, nullable = false)
	public Short getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Short brandId) {
		this.brandId = brandId;
	}

	@Column(name = "brand_name", nullable = false, length = 60)
	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Column(name = "brand_logo", nullable = false, length = 80)
	public String getBrandLogo() {
		return this.brandLogo;
	}

	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	@Column(name = "brand_desc", nullable = false, length = 65535)
	public String getBrandDesc() {
		return this.brandDesc;
	}

	public void setBrandDesc(String brandDesc) {
		this.brandDesc = brandDesc;
	}

	@Column(name = "site_url", nullable = false)
	public String getSiteUrl() {
		return this.siteUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	@Column(name = "is_show", nullable = false)
	public Boolean getIsShow() {
		return this.isShow;
	}

	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
	}

}