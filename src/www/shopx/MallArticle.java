package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallArticle entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_article", catalog = "iwmshopnow")
public class MallArticle implements java.io.Serializable {

	// Fields

	private Integer articleId;
	private Integer catId;
	private String title;
	private String content;
	private String thumb;
	private Integer adminId;
	private Timestamp addTime;
	private Boolean isLink;
	private String linkUrl;
	private Boolean isShow;
	private Boolean isBlod;
	private String tagColor;
	private Integer shortOrder;

	// Constructors

	/** default constructor */
	public MallArticle() {
	}

	/** minimal constructor */
	public MallArticle(Integer catId, String title, String thumb,
			Integer adminId, Boolean isLink, String linkUrl, Boolean isShow,
			Boolean isBlod) {
		this.catId = catId;
		this.title = title;
		this.thumb = thumb;
		this.adminId = adminId;
		this.isLink = isLink;
		this.linkUrl = linkUrl;
		this.isShow = isShow;
		this.isBlod = isBlod;
	}

	/** full constructor */
	public MallArticle(Integer catId, String title, String content,
			String thumb, Integer adminId, Timestamp addTime, Boolean isLink,
			String linkUrl, Boolean isShow, Boolean isBlod, String tagColor,
			Integer shortOrder) {
		this.catId = catId;
		this.title = title;
		this.content = content;
		this.thumb = thumb;
		this.adminId = adminId;
		this.addTime = addTime;
		this.isLink = isLink;
		this.linkUrl = linkUrl;
		this.isShow = isShow;
		this.isBlod = isBlod;
		this.tagColor = tagColor;
		this.shortOrder = shortOrder;
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

	@Column(name = "admin_id", nullable = false)
	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
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

	@Column(name = "is_blod", nullable = false)
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

}