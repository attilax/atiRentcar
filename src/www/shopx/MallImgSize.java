package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallImgSize entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_img_size", catalog = "iwmshopnow")
public class MallImgSize implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private String imgUrl;
	private String imgSize;
	private Timestamp uplTime;
	private Short isIntroImg;
	private Integer goodsId;

	// Constructors

	/** default constructor */
	public MallImgSize() {
	}

	/** full constructor */
	public MallImgSize(Integer uid, String imgUrl, String imgSize,
			Timestamp uplTime, Short isIntroImg, Integer goodsId) {
		this.uid = uid;
		this.imgUrl = imgUrl;
		this.imgSize = imgSize;
		this.uplTime = uplTime;
		this.isIntroImg = isIntroImg;
		this.goodsId = goodsId;
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

	@Column(name = "uid")
	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@Column(name = "img_url")
	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Column(name = "img_size", length = 10)
	public String getImgSize() {
		return this.imgSize;
	}

	public void setImgSize(String imgSize) {
		this.imgSize = imgSize;
	}

	@Column(name = "upl_time", length = 19)
	public Timestamp getUplTime() {
		return this.uplTime;
	}

	public void setUplTime(Timestamp uplTime) {
		this.uplTime = uplTime;
	}

	@Column(name = "is_intro_img")
	public Short getIsIntroImg() {
		return this.isIntroImg;
	}

	public void setIsIntroImg(Short isIntroImg) {
		this.isIntroImg = isIntroImg;
	}

	@Column(name = "goods_id")
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

}