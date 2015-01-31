package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallOrderInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_order_info", catalog = "iwmshopnow")
public class MallOrderInfo implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private String payid;
	private Integer shopId;
	private Integer payId;
	private String payName;
	private Integer userId;
	private Double transportPrice;
	private Float orderValue;
	private Double orderAmount;
	private String consignee;
	private Short country;
	private Short province;
	private Short city;
	private Short district;
	private String address;
	private String zipcode;
	private String telphone;
	private String mobile;
	private String email;
	private String shippingName;
	private String shippingNo;
	private String shippingType;
	private String message;
	private Timestamp orderTime;
	private Timestamp payTime;
	private Timestamp shippingTime;
	private Timestamp receiveTime;
	private Boolean orderStatus;
	private Boolean payStatus;
	private Boolean transportStatus;
	private Boolean protectStatus;
	private String tradeNo;
	private Boolean sellerReply;
	private Boolean buyerReply;
	private Integer groupId;
	private String payMessage;
	private Boolean complaint;
	private Timestamp getBackTime;
	private Integer transportType;
	private Double orderActual;

	// Constructors

	/** default constructor */
	public MallOrderInfo() {
	}

	/** minimal constructor */
	public MallOrderInfo(String payid, Integer shopId, Integer payId,
			String payName, Integer userId, Double transportPrice,
			Float orderValue, Double orderAmount, Short country,
			String address, Boolean sellerReply, Boolean buyerReply,
			Integer groupId) {
		this.payid = payid;
		this.shopId = shopId;
		this.payId = payId;
		this.payName = payName;
		this.userId = userId;
		this.transportPrice = transportPrice;
		this.orderValue = orderValue;
		this.orderAmount = orderAmount;
		this.country = country;
		this.address = address;
		this.sellerReply = sellerReply;
		this.buyerReply = buyerReply;
		this.groupId = groupId;
	}

	/** full constructor */
	public MallOrderInfo(String payid, Integer shopId, Integer payId,
			String payName, Integer userId, Double transportPrice,
			Float orderValue, Double orderAmount, String consignee,
			Short country, Short province, Short city, Short district,
			String address, String zipcode, String telphone, String mobile,
			String email, String shippingName, String shippingNo,
			String shippingType, String message, Timestamp orderTime,
			Timestamp payTime, Timestamp shippingTime, Timestamp receiveTime,
			Boolean orderStatus, Boolean payStatus, Boolean transportStatus,
			Boolean protectStatus, String tradeNo, Boolean sellerReply,
			Boolean buyerReply, Integer groupId, String payMessage,
			Boolean complaint, Timestamp getBackTime, Integer transportType,
			Double orderActual) {
		this.payid = payid;
		this.shopId = shopId;
		this.payId = payId;
		this.payName = payName;
		this.userId = userId;
		this.transportPrice = transportPrice;
		this.orderValue = orderValue;
		this.orderAmount = orderAmount;
		this.consignee = consignee;
		this.country = country;
		this.province = province;
		this.city = city;
		this.district = district;
		this.address = address;
		this.zipcode = zipcode;
		this.telphone = telphone;
		this.mobile = mobile;
		this.email = email;
		this.shippingName = shippingName;
		this.shippingNo = shippingNo;
		this.shippingType = shippingType;
		this.message = message;
		this.orderTime = orderTime;
		this.payTime = payTime;
		this.shippingTime = shippingTime;
		this.receiveTime = receiveTime;
		this.orderStatus = orderStatus;
		this.payStatus = payStatus;
		this.transportStatus = transportStatus;
		this.protectStatus = protectStatus;
		this.tradeNo = tradeNo;
		this.sellerReply = sellerReply;
		this.buyerReply = buyerReply;
		this.groupId = groupId;
		this.payMessage = payMessage;
		this.complaint = complaint;
		this.getBackTime = getBackTime;
		this.transportType = transportType;
		this.orderActual = orderActual;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "order_id", unique = true, nullable = false)
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "payid", nullable = false, length = 20)
	public String getPayid() {
		return this.payid;
	}

	public void setPayid(String payid) {
		this.payid = payid;
	}

	@Column(name = "shop_id", nullable = false)
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "pay_id", nullable = false)
	public Integer getPayId() {
		return this.payId;
	}

	public void setPayId(Integer payId) {
		this.payId = payId;
	}

	@Column(name = "pay_name", nullable = false)
	public String getPayName() {
		return this.payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	@Column(name = "user_id", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "transport_price", nullable = false, precision = 6)
	public Double getTransportPrice() {
		return this.transportPrice;
	}

	public void setTransportPrice(Double transportPrice) {
		this.transportPrice = transportPrice;
	}

	@Column(name = "order_value", nullable = false, precision = 12, scale = 0)
	public Float getOrderValue() {
		return this.orderValue;
	}

	public void setOrderValue(Float orderValue) {
		this.orderValue = orderValue;
	}

	@Column(name = "order_amount", nullable = false, precision = 10)
	public Double getOrderAmount() {
		return this.orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Column(name = "consignee", length = 50)
	public String getConsignee() {
		return this.consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	@Column(name = "country", nullable = false)
	public Short getCountry() {
		return this.country;
	}

	public void setCountry(Short country) {
		this.country = country;
	}

	@Column(name = "province")
	public Short getProvince() {
		return this.province;
	}

	public void setProvince(Short province) {
		this.province = province;
	}

	@Column(name = "city")
	public Short getCity() {
		return this.city;
	}

	public void setCity(Short city) {
		this.city = city;
	}

	@Column(name = "district")
	public Short getDistrict() {
		return this.district;
	}

	public void setDistrict(Short district) {
		this.district = district;
	}

	@Column(name = "address", nullable = false)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "zipcode", length = 6)
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "telphone", length = 20)
	public String getTelphone() {
		return this.telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	@Column(name = "mobile", length = 20)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "shipping_name", length = 50)
	public String getShippingName() {
		return this.shippingName;
	}

	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}

	@Column(name = "shipping_no", length = 50)
	public String getShippingNo() {
		return this.shippingNo;
	}

	public void setShippingNo(String shippingNo) {
		this.shippingNo = shippingNo;
	}

	@Column(name = "shipping_type", length = 50)
	public String getShippingType() {
		return this.shippingType;
	}

	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	@Column(name = "message", length = 65535)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Column(name = "order_time", length = 19)
	public Timestamp getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}

	@Column(name = "pay_time", length = 19)
	public Timestamp getPayTime() {
		return this.payTime;
	}

	public void setPayTime(Timestamp payTime) {
		this.payTime = payTime;
	}

	@Column(name = "shipping_time", length = 19)
	public Timestamp getShippingTime() {
		return this.shippingTime;
	}

	public void setShippingTime(Timestamp shippingTime) {
		this.shippingTime = shippingTime;
	}

	@Column(name = "receive_time", length = 19)
	public Timestamp getReceiveTime() {
		return this.receiveTime;
	}

	public void setReceiveTime(Timestamp receiveTime) {
		this.receiveTime = receiveTime;
	}

	@Column(name = "order_status")
	public Boolean getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(Boolean orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Column(name = "pay_status")
	public Boolean getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(Boolean payStatus) {
		this.payStatus = payStatus;
	}

	@Column(name = "transport_status")
	public Boolean getTransportStatus() {
		return this.transportStatus;
	}

	public void setTransportStatus(Boolean transportStatus) {
		this.transportStatus = transportStatus;
	}

	@Column(name = "protect_status")
	public Boolean getProtectStatus() {
		return this.protectStatus;
	}

	public void setProtectStatus(Boolean protectStatus) {
		this.protectStatus = protectStatus;
	}

	@Column(name = "trade_no", length = 50)
	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	@Column(name = "seller_reply", nullable = false)
	public Boolean getSellerReply() {
		return this.sellerReply;
	}

	public void setSellerReply(Boolean sellerReply) {
		this.sellerReply = sellerReply;
	}

	@Column(name = "buyer_reply", nullable = false)
	public Boolean getBuyerReply() {
		return this.buyerReply;
	}

	public void setBuyerReply(Boolean buyerReply) {
		this.buyerReply = buyerReply;
	}

	@Column(name = "group_id", nullable = false)
	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	@Column(name = "pay_message", length = 65535)
	public String getPayMessage() {
		return this.payMessage;
	}

	public void setPayMessage(String payMessage) {
		this.payMessage = payMessage;
	}

	@Column(name = "complaint")
	public Boolean getComplaint() {
		return this.complaint;
	}

	public void setComplaint(Boolean complaint) {
		this.complaint = complaint;
	}

	@Column(name = "get_back_time", length = 19)
	public Timestamp getGetBackTime() {
		return this.getBackTime;
	}

	public void setGetBackTime(Timestamp getBackTime) {
		this.getBackTime = getBackTime;
	}

	@Column(name = "transport_type")
	public Integer getTransportType() {
		return this.transportType;
	}

	public void setTransportType(Integer transportType) {
		this.transportType = transportType;
	}

	@Column(name = "order_actual", precision = 10)
	public Double getOrderActual() {
		return this.orderActual;
	}

	public void setOrderActual(Double orderActual) {
		this.orderActual = orderActual;
	}

}