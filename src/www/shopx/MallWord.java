package www.shopx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallWord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_word", catalog = "iwmshopnow")
public class MallWord implements java.io.Serializable {

	// Fields

	private Integer wordId;
	private String wordName;
	private Timestamp addTime;
	private String content;

	// Constructors

	/** default constructor */
	public MallWord() {
	}

	/** full constructor */
	public MallWord(String wordName, Timestamp addTime, String content) {
		this.wordName = wordName;
		this.addTime = addTime;
		this.content = content;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "word_id", unique = true, nullable = false)
	public Integer getWordId() {
		return this.wordId;
	}

	public void setWordId(Integer wordId) {
		this.wordId = wordId;
	}

	@Column(name = "word_name")
	public String getWordName() {
		return this.wordName;
	}

	public void setWordName(String wordName) {
		this.wordName = wordName;
	}

	@Column(name = "add_time", length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Column(name = "content", length = 1000)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}