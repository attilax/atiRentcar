package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallPlugins entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_plugins", catalog = "iwmshopnow")
public class MallPlugins implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String name;
	private Short valid;
	private Short autoorder;
	private Timestamp regDate;
	private String image;
	private Integer commentNum;
	private Integer useNum;
	private String info;

	// Constructors

	/** default constructor */
	public MallPlugins() {
	}

	/** minimal constructor */
	public MallPlugins(Timestamp regDate, String image) {
		this.regDate = regDate;
		this.image = image;
	}

	/** full constructor */
	public MallPlugins(String title, String name, Short valid, Short autoorder,
			Timestamp regDate, String image, Integer commentNum,
			Integer useNum, String info) {
		this.title = title;
		this.name = name;
		this.valid = valid;
		this.autoorder = autoorder;
		this.regDate = regDate;
		this.image = image;
		this.commentNum = commentNum;
		this.useNum = useNum;
		this.info = info;
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

	@Column(name = "title", length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "valid")
	public Short getValid() {
		return this.valid;
	}

	public void setValid(Short valid) {
		this.valid = valid;
	}

	@Column(name = "autoorder")
	public Short getAutoorder() {
		return this.autoorder;
	}

	public void setAutoorder(Short autoorder) {
		this.autoorder = autoorder;
	}

	@Column(name = "reg_date", nullable = false, length = 19)
	public Timestamp getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	@Column(name = "image", nullable = false, length = 150)
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "comment_num")
	public Integer getCommentNum() {
		return this.commentNum;
	}

	public void setCommentNum(Integer commentNum) {
		this.commentNum = commentNum;
	}

	@Column(name = "use_num")
	public Integer getUseNum() {
		return this.useNum;
	}

	public void setUseNum(Integer useNum) {
		this.useNum = useNum;
	}

	@Column(name = "info", length = 300)
	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}