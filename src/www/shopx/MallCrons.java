package www.shopx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MallCrons entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_crons", catalog = "iwmshopnow")
public class MallCrons implements java.io.Serializable {

	// Fields

	private Short id;
	private Boolean type;
	private String name;
	private String phpfile;
	private Integer lastrun;
	private Integer nextrun;
	private Boolean weekday;
	private Short day;
	private Short hour;
	private String minute;
	private Boolean available;

	// Constructors

	/** default constructor */
	public MallCrons() {
	}

	/** full constructor */
	public MallCrons(Boolean type, String name, String phpfile,
			Integer lastrun, Integer nextrun, Boolean weekday, Short day,
			Short hour, String minute, Boolean available) {
		this.type = type;
		this.name = name;
		this.phpfile = phpfile;
		this.lastrun = lastrun;
		this.nextrun = nextrun;
		this.weekday = weekday;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.available = available;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	@Column(name = "type", nullable = false)
	public Boolean getType() {
		return this.type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

	@Column(name = "name", nullable = false, length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "phpfile", nullable = false, length = 200)
	public String getPhpfile() {
		return this.phpfile;
	}

	public void setPhpfile(String phpfile) {
		this.phpfile = phpfile;
	}

	@Column(name = "lastrun", nullable = false)
	public Integer getLastrun() {
		return this.lastrun;
	}

	public void setLastrun(Integer lastrun) {
		this.lastrun = lastrun;
	}

	@Column(name = "nextrun", nullable = false)
	public Integer getNextrun() {
		return this.nextrun;
	}

	public void setNextrun(Integer nextrun) {
		this.nextrun = nextrun;
	}

	@Column(name = "weekday", nullable = false)
	public Boolean getWeekday() {
		return this.weekday;
	}

	public void setWeekday(Boolean weekday) {
		this.weekday = weekday;
	}

	@Column(name = "day", nullable = false)
	public Short getDay() {
		return this.day;
	}

	public void setDay(Short day) {
		this.day = day;
	}

	@Column(name = "hour", nullable = false)
	public Short getHour() {
		return this.hour;
	}

	public void setHour(Short hour) {
		this.hour = hour;
	}

	@Column(name = "minute", nullable = false, length = 200)
	public String getMinute() {
		return this.minute;
	}

	public void setMinute(String minute) {
		this.minute = minute;
	}

	@Column(name = "available", nullable = false)
	public Boolean getAvailable() {
		return this.available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

}