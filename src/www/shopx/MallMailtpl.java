package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallMailtpl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_mailtpl", catalog = "iwmshopnow")
public class MallMailtpl implements java.io.Serializable {

	// Fields

	private Integer tplId;
	private String tplName;
	private String tplTitle;
	private String tplContent;
	private Timestamp lastModify;

	// Constructors

	/** default constructor */
	public MallMailtpl() {
	}

	/** minimal constructor */
	public MallMailtpl(String tplName, String tplTitle) {
		this.tplName = tplName;
		this.tplTitle = tplTitle;
	}

	/** full constructor */
	public MallMailtpl(String tplName, String tplTitle, String tplContent,
			Timestamp lastModify) {
		this.tplName = tplName;
		this.tplTitle = tplTitle;
		this.tplContent = tplContent;
		this.lastModify = lastModify;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "tpl_id", unique = true, nullable = false)
	public Integer getTplId() {
		return this.tplId;
	}

	public void setTplId(Integer tplId) {
		this.tplId = tplId;
	}

	@Column(name = "tpl_name", nullable = false, length = 50)
	public String getTplName() {
		return this.tplName;
	}

	public void setTplName(String tplName) {
		this.tplName = tplName;
	}

	@Column(name = "tpl_title", nullable = false)
	public String getTplTitle() {
		return this.tplTitle;
	}

	public void setTplTitle(String tplTitle) {
		this.tplTitle = tplTitle;
	}

	@Column(name = "tpl_content", length = 65535)
	public String getTplContent() {
		return this.tplContent;
	}

	public void setTplContent(String tplContent) {
		this.tplContent = tplContent;
	}

	@Column(name = "last_modify", length = 19)
	public Timestamp getLastModify() {
		return this.lastModify;
	}

	public void setLastModify(Timestamp lastModify) {
		this.lastModify = lastModify;
	}

}