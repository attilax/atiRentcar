package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallShopArticle entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_shop_article", catalog = "iwmshopnow")
public class MallShopArticle implements java.io.Serializable {

	// Fields

	private Integer articleId;
	private Integer catId;
	private String title;
	private String content;
	private String thumb;
	private Integer shopId;
	private Timestamp addTime;
	private Boolean isLink;
	private String linkUrl;
	private Boolean isShow;

	// Constructors

	/** default constructor */
	public MallShopArticle() {
	}

	/** minimal constructor */
	public MallShopArticle(Integer catId, String title, String thumb,
			Integer shopId, Boolean isLink, String linkUrl, Boolean isShow) {
		this.catId = catId;
		this.title = title;
		this.thumb = thumb;
		this.shopId = shopId;
		this.isLink = isLink;
		this.linkUrl = linkUrl;
		this.isShow = isShow;
	}

	/** full constructor */
	public MallShopArticle(Integer catId, String title, String content,
			String thumb, Integer shopId, Timestamp addTime, Boolean isLink,
			String linkUrl, Boolean isShow) {
		this.catId = catId;
		this.title = title;
		this.content = content;
		this.thumb = thumb;
		this.shopId = shopId;
		this.addTime = addTime;
		this.isLink = isLink;
		this.linkUrl = linkUrl;
		this.isShow = isShow;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "article_id", unique = true, nullable = false)
	public Integer getArticleId() {
		return this.articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	@Column(name = "cat_id", nullable = false)
	public Integer getCatId() {
		return this.catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	@Column(name = "title", nullable = false)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "content", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "thumb", nullable = false)
	public String getThumb() {
		return this.thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	@Column(name = "shop_id", nullable = false)
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "add_time", length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Column(name = "is_link", nullable = false)
	public Boolean getIsLink() {
		return this.isLink;
	}

	public void setIsLink(Boolean isLink) {
		this.isLink = isLink;
	}

	@Column(name = "link_url", nullable = false)
	public String getLinkUrl() {
		return this.linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	@Column(name = "is_show", nullable = false)
	public Boolean getIsShow() {
		return this.isShow;
	}

	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
	}

}