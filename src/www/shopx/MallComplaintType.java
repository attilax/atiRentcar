package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallComplaintType entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_complaint_type", catalog = "iwmshopnow")
public class MallComplaintType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String typeContent;

	// Constructors

	/** default constructor */
	public MallComplaintType() {
	}

	/** full constructor */
	public MallComplaintType(String typeContent) {
		this.typeContent = typeContent;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "type_id", unique = true, nullable = false)
	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	@Column(name = "type_content", nullable = false, length = 100)
	public String getTypeContent() {
		return this.typeContent;
	}

	public void setTypeContent(String typeContent) {
		this.typeContent = typeContent;
	}

}