package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallTransport entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_transport", catalog = "iwmshopnow")
public class MallTransport implements java.io.Serializable {

	// Fields

	private Integer tranid;
	private String tranName;
	private Integer ifopen;
	private String content;
	private String tranType;

	// Constructors

	/** default constructor */
	public MallTransport() {
	}

	/** full constructor */
	public MallTransport(String tranName, Integer ifopen, String content,
			String tranType) {
		this.tranName = tranName;
		this.ifopen = ifopen;
		this.content = content;
		this.tranType = tranType;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "tranid", unique = true, nullable = false)
	public Integer getTranid() {
		return this.tranid;
	}

	public void setTranid(Integer tranid) {
		this.tranid = tranid;
	}

	@Column(name = "tran_name")
	public String getTranName() {
		return this.tranName;
	}

	public void setTranName(String tranName) {
		this.tranName = tranName;
	}

	@Column(name = "ifopen")
	public Integer getIfopen() {
		return this.ifopen;
	}

	public void setIfopen(Integer ifopen) {
		this.ifopen = ifopen;
	}

	@Column(name = "content", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "tran_type", length = 50)
	public String getTranType() {
		return this.tranType;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

}