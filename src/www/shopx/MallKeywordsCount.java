package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * MallKeywordsCount entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_keywords_count", catalog = "iwmshopnow", uniqueConstraints = @UniqueConstraint(columnNames = "keywords"))
public class MallKeywordsCount implements java.io.Serializable {

	// Fields

	private Integer id;
	private String keywords;
	private Integer count;
	private Integer day;
	private Integer week;
	private Integer month;
	private Integer dataline;

	// Constructors

	/** default constructor */
	public MallKeywordsCount() {
	}

	/** minimal constructor */
	public MallKeywordsCount(Integer count, Integer day, Integer week,
			Integer month) {
		this.count = count;
		this.day = day;
		this.week = week;
		this.month = month;
	}

	/** full constructor */
	public MallKeywordsCount(String keywords, Integer count, Integer day,
			Integer week, Integer month, Integer dataline) {
		this.keywords = keywords;
		this.count = count;
		this.day = day;
		this.week = week;
		this.month = month;
		this.dataline = dataline;
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

	@Column(name = "keywords", unique = true)
	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	@Column(name = "count", nullable = false)
	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Column(name = "day", nullable = false)
	public Integer getDay() {
		return this.day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	@Column(name = "week", nullable = false)
	public Integer getWeek() {
		return this.week;
	}

	public void setWeek(Integer week) {
		this.week = week;
	}

	@Column(name = "month", nullable = false)
	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	@Column(name = "dataline")
	public Integer getDataline() {
		return this.dataline;
	}

	public void setDataline(Integer dataline) {
		this.dataline = dataline;
	}

}