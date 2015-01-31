package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallComplaints entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_complaints", catalog = "iwmshopnow")
public class MallComplaints implements java.io.Serializable {

	// Fields

	private Integer complaintsId;
	private Integer userId;
	private Integer useredId;
	private Integer orderId;
	private String useredName;
	private Integer goodsId;
	private String goodsName;
	private String complaintsTitle;
	private String complaintsContent;
	private String complaintsImg;

	// Constructors

	/** default constructor */
	public MallComplaints() {
	}

	/** minimal constructor */
	public MallComplaints(Integer userId, Integer useredId, Integer orderId,
			String useredName, Integer goodsId, String goodsName,
			String complaintsTitle, String complaintsContent) {
		this.userId = userId;
		this.useredId = useredId;
		this.orderId = orderId;
		this.useredName = useredName;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.complaintsTitle = complaintsTitle;
		this.complaintsContent = complaintsContent;
	}

	/** full constructor */
	public MallComplaints(Integer userId, Integer useredId, Integer orderId,
			String useredName, Integer goodsId, String goodsName,
			String complaintsTitle, String complaintsContent,
			String complaintsImg) {
		this.userId = userId;
		this.useredId = useredId;
		this.orderId = orderId;
		this.useredName = useredName;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.complaintsTitle = complaintsTitle;
		this.complaintsContent = complaintsContent;
		this.complaintsImg = complaintsImg;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "complaints_id", unique = true, nullable = false)
	public Integer getComplaintsId() {
		return this.complaintsId;
	}

	public void setComplaintsId(Integer complaintsId) {
		this.complaintsId = complaintsId;
	}

	@Column(name = "user_id", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "usered_id", nullable = false)
	public Integer getUseredId() {
		return this.useredId;
	}

	public void setUseredId(Integer useredId) {
		this.useredId = useredId;
	}

	@Column(name = "order_id", nullable = false)
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "usered_name", nullable = false, length = 100)
	public String getUseredName() {
		return this.useredName;
	}

	public void setUseredName(String useredName) {
		this.useredName = useredName;
	}

	@Column(name = "goods_id", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "goods_name", nullable = false)
	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	@Column(name = "complaints_title", nullable = false)
	public String getComplaintsTitle() {
		return this.complaintsTitle;
	}

	public void setComplaintsTitle(String complaintsTitle) {
		this.complaintsTitle = complaintsTitle;
	}

	@Column(name = "complaints_content", nullable = false, length = 65535)
	public String getComplaintsContent() {
		return this.complaintsContent;
	}

	public void setComplaintsContent(String complaintsContent) {
		this.complaintsContent = complaintsContent;
	}

	@Column(name = "complaints_img")
	public String getComplaintsImg() {
		return this.complaintsImg;
	}

	public void setComplaintsImg(String complaintsImg) {
		this.complaintsImg = complaintsImg;
	}

}