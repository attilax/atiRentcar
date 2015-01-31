package www.shopx.userx;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * MallUsers entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mall_users", catalog = "iwmshopnow", uniqueConstraints = {
		@UniqueConstraint(columnNames = "user_email"),
		@UniqueConstraint(columnNames = "user_name") })
public class MallUsers implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userEmail;
	private String userName;
	private String userPasswd;
	private String userQuestion;
	private String userAnswer;
	private String userIco;
	private Timestamp regTime;
	private Timestamp lastLoginTime;
	private String lastIp;
	private Boolean emailCheck;
	private String emailCheckCode;
	private String forgotCheckCode;
	private Integer rankId;
	private Boolean locked;

	// Constructors

	/** default constructor */
	public MallUsers() {
	}

	/** minimal constructor */
	public MallUsers(String userIco, Boolean emailCheck, Integer rankId,
			Boolean locked) {
		this.userIco = userIco;
		this.emailCheck = emailCheck;
		this.rankId = rankId;
		this.locked = locked;
	}

	/** full constructor */
	public MallUsers(String userEmail, String userName, String userPasswd,
			String userQuestion, String userAnswer, String userIco,
			Timestamp regTime, Timestamp lastLoginTime, String lastIp,
			Boolean emailCheck, String emailCheckCode, String forgotCheckCode,
			Integer rankId, Boolean locked) {
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPasswd = userPasswd;
		this.userQuestion = userQuestion;
		this.userAnswer = userAnswer;
		this.userIco = userIco;
		this.regTime = regTime;
		this.lastLoginTime = lastLoginTime;
		this.lastIp = lastIp;
		this.emailCheck = emailCheck;
		this.emailCheckCode = emailCheckCode;
		this.forgotCheckCode = forgotCheckCode;
		this.rankId = rankId;
		this.locked = locked;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "user_email", unique = true, length = 100)
	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Column(name = "user_name", unique = true, length = 50)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "user_passwd", length = 50)
	public String getUserPasswd() {
		return this.userPasswd;
	}

	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}

	@Column(name = "user_question")
	public String getUserQuestion() {
		return this.userQuestion;
	}

	public void setUserQuestion(String userQuestion) {
		this.userQuestion = userQuestion;
	}

	@Column(name = "user_answer")
	public String getUserAnswer() {
		return this.userAnswer;
	}

	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}

	@Column(name = "user_ico", nullable = false)
	public String getUserIco() {
		return this.userIco;
	}

	public void setUserIco(String userIco) {
		this.userIco = userIco;
	}

	@Column(name = "reg_time", length = 19)
	public Timestamp getRegTime() {
		return this.regTime;
	}

	public void setRegTime(Timestamp regTime) {
		this.regTime = regTime;
	}

	@Column(name = "last_login_time", length = 19)
	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Column(name = "last_ip", length = 15)
	public String getLastIp() {
		return this.lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	@Column(name = "email_check", nullable = false)
	public Boolean getEmailCheck() {
		return this.emailCheck;
	}

	public void setEmailCheck(Boolean emailCheck) {
		this.emailCheck = emailCheck;
	}

	@Column(name = "email_check_code")
	public String getEmailCheckCode() {
		return this.emailCheckCode;
	}

	public void setEmailCheckCode(String emailCheckCode) {
		this.emailCheckCode = emailCheckCode;
	}

	@Column(name = "forgot_check_code")
	public String getForgotCheckCode() {
		return this.forgotCheckCode;
	}

	public void setForgotCheckCode(String forgotCheckCode) {
		this.forgotCheckCode = forgotCheckCode;
	}

	@Column(name = "rank_id", nullable = false)
	public Integer getRankId() {
		return this.rankId;
	}

	public void setRankId(Integer rankId) {
		this.rankId = rankId;
	}

	@Column(name = "locked", nullable = false)
	public Boolean getLocked() {
		return this.locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

}