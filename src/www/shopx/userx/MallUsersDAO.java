package www.shopx.userx;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import www.shopx.shopinfo.BaseHibernateDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * MallUsers entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see www.shopx.userx.MallUsers
 * @author MyEclipse Persistence Tools
 */

public class MallUsersDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(MallUsersDAO.class);
	// property constants
	public static final String USER_EMAIL = "userEmail";
	public static final String USER_NAME = "userName";
	public static final String USER_PASSWD = "userPasswd";
	public static final String USER_QUESTION = "userQuestion";
	public static final String USER_ANSWER = "userAnswer";
	public static final String USER_ICO = "userIco";
	public static final String LAST_IP = "lastIp";
	public static final String EMAIL_CHECK = "emailCheck";
	public static final String EMAIL_CHECK_CODE = "emailCheckCode";
	public static final String FORGOT_CHECK_CODE = "forgotCheckCode";
	public static final String RANK_ID = "rankId";
	public static final String LOCKED = "locked";

	public void save(MallUsers transientInstance) {
		log.debug("saving MallUsers instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MallUsers persistentInstance) {
		log.debug("deleting MallUsers instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MallUsers findById(java.lang.Integer id) {
		log.debug("getting MallUsers instance with id: " + id);
		try {
			MallUsers instance = (MallUsers) getSession().get(
					"www.shopx.userx.MallUsers", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<MallUsers> findByExample(MallUsers instance) {
		log.debug("finding MallUsers instance by example");
		try {
			List<MallUsers> results = (List<MallUsers>) getSession()
					.createCriteria("www.shopx.userx.MallUsers")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding MallUsers instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MallUsers as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<MallUsers> findByUserEmail(Object userEmail) {
		return findByProperty(USER_EMAIL, userEmail);
	}

	public List<MallUsers> findByUserName(Object userName) {
		return findByProperty(USER_NAME, userName);
	}

	public List<MallUsers> findByUserPasswd(Object userPasswd) {
		return findByProperty(USER_PASSWD, userPasswd);
	}

	public List<MallUsers> findByUserQuestion(Object userQuestion) {
		return findByProperty(USER_QUESTION, userQuestion);
	}

	public List<MallUsers> findByUserAnswer(Object userAnswer) {
		return findByProperty(USER_ANSWER, userAnswer);
	}

	public List<MallUsers> findByUserIco(Object userIco) {
		return findByProperty(USER_ICO, userIco);
	}

	public List<MallUsers> findByLastIp(Object lastIp) {
		return findByProperty(LAST_IP, lastIp);
	}

	public List<MallUsers> findByEmailCheck(Object emailCheck) {
		return findByProperty(EMAIL_CHECK, emailCheck);
	}

	public List<MallUsers> findByEmailCheckCode(Object emailCheckCode) {
		return findByProperty(EMAIL_CHECK_CODE, emailCheckCode);
	}

	public List<MallUsers> findByForgotCheckCode(Object forgotCheckCode) {
		return findByProperty(FORGOT_CHECK_CODE, forgotCheckCode);
	}

	public List<MallUsers> findByRankId(Object rankId) {
		return findByProperty(RANK_ID, rankId);
	}

	public List<MallUsers> findByLocked(Object locked) {
		return findByProperty(LOCKED, locked);
	}

	public List findAll() {
		log.debug("finding all MallUsers instances");
		try {
			String queryString = "from MallUsers";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MallUsers merge(MallUsers detachedInstance) {
		log.debug("merging MallUsers instance");
		try {
			MallUsers result = (MallUsers) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MallUsers instance) {
		log.debug("attaching dirty MallUsers instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MallUsers instance) {
		log.debug("attaching clean MallUsers instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}