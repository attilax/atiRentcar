package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallSettings entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_settings", catalog = "iwmshopnow")
public class MallSettings implements java.io.Serializable {

	// Fields

	private String variable;
	private String value;

	// Constructors

	/** default constructor */
	public MallSettings() {
	}

	/** full constructor */
	public MallSettings(String variable, String value) {
		this.variable = variable;
		this.value = value;
	}

	// Property accessors
	@Id
	@Column(name = "variable", unique = true, nullable = false, length = 32)
	public String getVariable() {
		return this.variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	@Column(name = "value", nullable = false, length = 65535)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}