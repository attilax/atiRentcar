package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallShippingList entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_shipping_list", catalog = "iwmshopnow")
public class MallShippingList implements java.io.Serializable {

	// Fields

	private Integer shippingId;
	private Integer orderId;
	private String paySn;
	private Integer shopId;
	private String shippingType;
	private String shippingCompany;
	private String shippingNo;
	private Timestamp addDate;
	private String consignee;
	private String consigneeAddress;
	private String consigneeTel;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public MallShippingList() {
	}

	/** full constructor */
	public MallShippingList(Integer orderId, String paySn, Integer shopId,
			String shippingType, String shippingCompany, String shippingNo,
			Timestamp addDate, String consignee, String consigneeAddress,
			String consigneeTel, String operator, String remark) {
		this.orderId = orderId;
		this.paySn = paySn;
		this.shopId = shopId;
		this.shippingType = shippingType;
		this.shippingCompany = shippingCompany;
		this.shippingNo = shippingNo;
		this.addDate = addDate;
		this.consignee = consignee;
		this.consigneeAddress = consigneeAddress;
		this.consigneeTel = consigneeTel;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "shipping_id", unique = true, nullable = false)
	public Integer getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}

	@Column(name = "order_id")
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "pay_sn", length = 20)
	public String getPaySn() {
		return this.paySn;
	}

	public void setPaySn(String paySn) {
		this.paySn = paySn;
	}

	@Column(name = "shop_id")
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "shipping_type", length = 50)
	public String getShippingType() {
		return this.shippingType;
	}

	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	@Column(name = "shipping_company", length = 50)
	public String getShippingCompany() {
		return this.shippingCompany;
	}

	public void setShippingCompany(String shippingCompany) {
		this.shippingCompany = shippingCompany;
	}

	@Column(name = "shipping_no", length = 50)
	public String getShippingNo() {
		return this.shippingNo;
	}

	public void setShippingNo(String shippingNo) {
		this.shippingNo = shippingNo;
	}

	@Column(name = "add_date", length = 19)
	public Timestamp getAddDate() {
		return this.addDate;
	}

	public void setAddDate(Timestamp addDate) {
		this.addDate = addDate;
	}

	@Column(name = "consignee", length = 20)
	public String getConsignee() {
		return this.consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	@Column(name = "consignee_address", length = 100)
	public String getConsigneeAddress() {
		return this.consigneeAddress;
	}

	public void setConsigneeAddress(String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}

	@Column(name = "consignee_tel", length = 20)
	public String getConsigneeTel() {
		return this.consigneeTel;
	}

	public void setConsigneeTel(String consigneeTel) {
		this.consigneeTel = consigneeTel;
	}

	@Column(name = "operator", length = 20)
	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Column(name = "remark", length = 200)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}