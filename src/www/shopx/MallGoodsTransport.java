package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallGoodsTransport entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_goods_transport", catalog = "iwmshopnow")
public class MallGoodsTransport implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer shopId;
	private String transportName;
	private String description;
	private String content;

	// Constructors

	/** default constructor */
	public MallGoodsTransport() {
	}

	/** full constructor */
	public MallGoodsTransport(Integer shopId, String transportName,
			String description, String content) {
		this.shopId = shopId;
		this.transportName = transportName;
		this.description = description;
		this.content = content;
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

	@Column(name = "shop_id")
	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name = "transport_name", length = 100)
	public String getTransportName() {
		return this.transportName;
	}

	public void setTransportName(String transportName) {
		this.transportName = transportName;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "content", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}