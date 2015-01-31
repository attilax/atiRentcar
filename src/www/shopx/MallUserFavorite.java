package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallUserFavorite entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_user_favorite", catalog = "iwmshopnow")
public class MallUserFavorite implements java.io.Serializable {

	// Fields

	private Integer favoriteId;
	private Integer userId;
	private Integer goodsId;
	private Timestamp addTime;
	private Integer shopId;

	// Constructors

	/** default constructor */
	public MallUserFavorite() {
	}

	/** minimal constructor */
	public MallUserFavorite(Integer userId, Integer goodsId, Timestamp addTime) {
		this.userId = userId;
		this.goodsId = goodsId;
		this.addTime = addTime;
	}

	/** full constructor */
	public MallUserFavorite(Integer userId, Integer goodsId, Timestamp addTime,
			Integer shopId) {
		this.userId = userId;
		this.goodsId = goodsId;
		this.addTime = addTime;
		this.shopId = shopId;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "favorite_id", unique = true, nullable = false)
	public Integer getFavoriteId() {
		return this.favoriteId;
	}

	public void setFavoriteId(Integer favoriteId) {
		this.favoriteId = favoriteId;
	}

	@Column(name = "user_id", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "goods_id", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "add_time", nullable = false, length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Column(name = "shop_id")
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

}