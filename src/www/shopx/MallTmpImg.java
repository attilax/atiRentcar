package www.shopx;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MallTmpImg entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_tmp_img", catalog = "iwmshopnow")
public class MallTmpImg implements java.io.Serializable {

	// Fields

	private Integer id;
	private Short isSet;
	private String img;
	private Integer goodsId;
	private Date addTime;

	// Constructors

	/** default constructor */
	public MallTmpImg() {
	}

	/** minimal constructor */
	public MallTmpImg(String img, Integer goodsId, Date addTime) {
		this.img = img;
		this.goodsId = goodsId;
		this.addTime = addTime;
	}

	/** full constructor */
	public MallTmpImg(Short isSet, String img, Integer goodsId, Date addTime) {
		this.isSet = isSet;
		this.img = img;
		this.goodsId = goodsId;
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

	@Column(name = "is_set")
	public Short getIsSet() {
		return this.isSet;
	}

	public void setIsSet(Short isSet) {
		this.isSet = isSet;
	}

	@Column(name = "img", nullable = false)
	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Column(name = "goods_id", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "add_time", nullable = false, length = 10)
	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

}