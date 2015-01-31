package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallIntegral entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_integral", catalog = "iwmshopnow")
public class MallIntegral implements java.io.Serializable {

	// Fields

	private Integer intId;
	private String intMin;
	private String intMax;
	private Integer intGrade;
	private String intImg;

	// Constructors

	/** default constructor */
	public MallIntegral() {
	}

	/** full constructor */
	public MallIntegral(String intMin, String intMax, Integer intGrade,
			String intImg) {
		this.intMin = intMin;
		this.intMax = intMax;
		this.intGrade = intGrade;
		this.intImg = intImg;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "int_id", unique = true, nullable = false)
	public Integer getIntId() {
		return this.intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	@Column(name = "int_min", length = 20)
	public String getIntMin() {
		return this.intMin;
	}

	public void setIntMin(String intMin) {
		this.intMin = intMin;
	}

	@Column(name = "int_max", length = 20)
	public String getIntMax() {
		return this.intMax;
	}

	public void setIntMax(String intMax) {
		this.intMax = intMax;
	}

	@Column(name = "int_grade")
	public Integer getIntGrade() {
		return this.intGrade;
	}

	public void setIntGrade(Integer intGrade) {
		this.intGrade = intGrade;
	}

	@Column(name = "int_img", length = 100)
	public String getIntImg() {
		return this.intImg;
	}

	public void setIntImg(String intImg) {
		this.intImg = intImg;
	}

}