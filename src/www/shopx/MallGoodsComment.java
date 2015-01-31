package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallGoodsComment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_goods_comment", catalog = "iwmshopnow")
public class MallGoodsComment implements java.io.Serializable {

	// Fields

	private Integer commentId;
	private Integer goodsId;
	private Integer userId;
	private String userName;
	private String content;
	private Timestamp addTime;
	private Boolean isVerify;

	// Constructors

	/** default constructor */
	public MallGoodsComment() {
	}

	/** minimal constructor */
	public MallGoodsComment(Integer goodsId, Integer userId, String userName,
			Boolean isVerify) {
		this.goodsId = goodsId;
		this.userId = userId;
		this.userName = userName;
		this.isVerify = isVerify;
	}

	/** full constructor */
	public MallGoodsComment(Integer goodsId, Integer userId, String userName,
			String content, Timestamp addTime, Boolean isVerify) {
		this.goodsId = goodsId;
		this.userId = userId;
		this.userName = userName;
		this.content = content;
		this.addTime = addTime;
		this.isVerify = isVerify;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "comment_id", unique = true, nullable = false)
	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	@Column(name = "goods_id", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "user_id", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "user_name", nullable = false, length = 50)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "content", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "add_time", length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Column(name = "is_verify", nullable = false)
	public Boolean getIsVerify() {
		return this.isVerify;
	}

	public void setIsVerify(Boolean isVerify) {
		this.isVerify = isVerify;
	}

}