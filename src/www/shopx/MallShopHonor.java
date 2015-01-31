package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallShopHonor entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_shop_honor", catalog = "iwmshopnow")
public class MallShopHonor implements java.io.Serializable {

	// Fields

	private Integer honorId;
	private Integer shopId;
	private String honorImg;
	private String honorDesc;
	private String honorThumb;
	private String honorOriginal;

	// Constructors

	/** default constructor */
	public MallShopHonor() {
	}

	/** full constructor */
	public MallShopHonor(Integer shopId, String honorImg, String honorDesc,
			String honorThumb, String honorOriginal) {
		this.shopId = shopId;
		this.honorImg = honorImg;
		this.honorDesc = honorDesc;
		this.honorThumb = honorThumb;
		this.honorOriginal = honorOriginal;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "honor_id", unique = true, nullable = false)
	public Integer getHonorId() {
		return this.honorId;
	}

	public void setHonorId(Integer honorId) {
		this.honorId = honorId;
	}

	@Column(name = "shop_id", nullable = false)
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "honor_img", nullable = false)
	public String getHonorImg() {
		return this.honorImg;
	}

	public void setHonorImg(String honorImg) {
		this.honorImg = honorImg;
	}

	@Column(name = "honor_desc", nullable = false)
	public String getHonorDesc() {
		return this.honorDesc;
	}

	public void setHonorDesc(String honorDesc) {
		this.honorDesc = honorDesc;
	}

	@Column(name = "honor_thumb", nullable = false)
	public String getHonorThumb() {
		return this.honorThumb;
	}

	public void setHonorThumb(String honorThumb) {
		this.honorThumb = honorThumb;
	}

	@Column(name = "honor_original", nullable = false)
	public String getHonorOriginal() {
		return this.honorOriginal;
	}

	public void setHonorOriginal(String honorOriginal) {
		this.honorOriginal = honorOriginal;
	}

}