package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallTag entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_tag", catalog = "iwmshopnow")
public class MallTag implements java.io.Serializable {

	// Fields

	private Integer tagId;
	private String tagName;
	private Integer goodsId;
	private Integer tagNum;
	private Integer shopId;
	private Boolean isBlod;
	private String tagColor;
	private Integer shortOrder;
	private Boolean isRecommend;

	// Constructors

	/** default constructor */
	public MallTag() {
	}

	/** full constructor */
	public MallTag(String tagName, Integer goodsId, Integer tagNum,
			Integer shopId, Boolean isBlod, String tagColor,
			Integer shortOrder, Boolean isRecommend) {
		this.tagName = tagName;
		this.goodsId = goodsId;
		this.tagNum = tagNum;
		this.shopId = shopId;
		this.isBlod = isBlod;
		this.tagColor = tagColor;
		this.shortOrder = shortOrder;
		this.isRecommend = isRecommend;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "tag_id", unique = true, nullable = false)
	public Integer getTagId() {
		return this.tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	@Column(name = "tag_name", length = 50)
	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	@Column(name = "goods_id")
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "tag_num")
	public Integer getTagNum() {
		return this.tagNum;
	}

	public void setTagNum(Integer tagNum) {
		this.tagNum = tagNum;
	}

	@Column(name = "shop_id")
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "is_blod")
	public Boolean getIsBlod() {
		return this.isBlod;
	}

	public void setIsBlod(Boolean isBlod) {
		this.isBlod = isBlod;
	}

	@Column(name = "tag_color", length = 20)
	public String getTagColor() {
		return this.tagColor;
	}

	public void setTagColor(String tagColor) {
		this.tagColor = tagColor;
	}

	@Column(name = "short_order")
	public Integer getShortOrder() {
		return this.shortOrder;
	}

	public void setShortOrder(Integer shortOrder) {
		this.shortOrder = shortOrder;
	}

	@Column(name = "is_recommend")
	public Boolean getIsRecommend() {
		return this.isRecommend;
	}

	public void setIsRecommend(Boolean isRecommend) {
		this.isRecommend = isRecommend;
	}

}