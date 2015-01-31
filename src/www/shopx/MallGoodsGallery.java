package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallGoodsGallery entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_goods_gallery", catalog = "iwmshopnow")
public class MallGoodsGallery implements java.io.Serializable {

	// Fields

	private Integer imgId;
	private Integer goodsId;
	private String imgUrl;
	private String imgDesc;
	private String thumbUrl;
	private String imgOriginal;
	private Boolean isSet;
	private Integer imgSizeId;

	// Constructors

	/** default constructor */
	public MallGoodsGallery() {
	}

	/** minimal constructor */
	public MallGoodsGallery(Integer goodsId, String imgUrl, String imgDesc,
			String thumbUrl, String imgOriginal, Boolean isSet) {
		this.goodsId = goodsId;
		this.imgUrl = imgUrl;
		this.imgDesc = imgDesc;
		this.thumbUrl = thumbUrl;
		this.imgOriginal = imgOriginal;
		this.isSet = isSet;
	}

	/** full constructor */
	public MallGoodsGallery(Integer goodsId, String imgUrl, String imgDesc,
			String thumbUrl, String imgOriginal, Boolean isSet,
			Integer imgSizeId) {
		this.goodsId = goodsId;
		this.imgUrl = imgUrl;
		this.imgDesc = imgDesc;
		this.thumbUrl = thumbUrl;
		this.imgOriginal = imgOriginal;
		this.isSet = isSet;
		this.imgSizeId = imgSizeId;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "img_id", unique = true, nullable = false)
	public Integer getImgId() {
		return this.imgId;
	}

	public void setImgId(Integer imgId) {
		this.imgId = imgId;
	}

	@Column(name = "goods_id", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "img_url", nullable = false)
	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Column(name = "img_desc", nullable = false)
	public String getImgDesc() {
		return this.imgDesc;
	}

	public void setImgDesc(String imgDesc) {
		this.imgDesc = imgDesc;
	}

	@Column(name = "thumb_url", nullable = false)
	public String getThumbUrl() {
		return this.thumbUrl;
	}

	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}

	@Column(name = "img_original", nullable = false)
	public String getImgOriginal() {
		return this.imgOriginal;
	}

	public void setImgOriginal(String imgOriginal) {
		this.imgOriginal = imgOriginal;
	}

	@Column(name = "is_set", nullable = false)
	public Boolean getIsSet() {
		return this.isSet;
	}

	public void setIsSet(Boolean isSet) {
		this.isSet = isSet;
	}

	@Column(name = "img_size_id")
	public Integer getImgSizeId() {
		return this.imgSizeId;
	}

	public void setImgSizeId(Integer imgSizeId) {
		this.imgSizeId = imgSizeId;
	}

}