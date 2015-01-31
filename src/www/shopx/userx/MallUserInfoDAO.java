package www.shopx.userx;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import www.shopx.shopinfo.BaseHibernateDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * MallUserInfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see www.shopx.userx.MallUserInfo
 * @author MyEclipse Persistence Tools
 */

public class MallUserInfoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(MallUserInfoDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String USER_TRUENAME = "userTruename";
	public static final String USER_ICO = "userIco";
	public static final String USER_MARRY = "userMarry";
	public static final String USER_GENDER = "userGender";
	public static final String USER_MOBILE = "userMobile";
	public static final String USER_TELPHONE = "userTelphone";
	public static final String USER_COUNTRY = "userCountry";
	public static final String USER_PROVINCE = "userProvince";
	public static final String USER_CITY = "userCity";
	public static final String USER_DISTRICT = "userDistrict";
	public static final String USER_ZIPCODE = "userZipcode";
	public static final String USER_ADDRESS = "userAddress";
	public static final String USER_QQ = "userQq";
	public static final String USER_MSN = "userMsn";
	public static final String USER_SKYPE = "userSkype";

	public void save(MallUserInfo transientInstance) {
		log.debug("saving MallUserInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MallUserInfo persistentInstance) {
		log.debug("deleting MallUserInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MallUserInfo findById(java.lang.Integer id) {
		log.debug("getting MallUserInfo instance with id: " + id);
		try {
			MallUserInfo instance = (MallUserInfo) getSession().get(
					"www.shopx.userx.MallUserInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<MallUserInfo> findByExample(MallUserInfo instance) {
		log.debug("finding MallUserInfo instance by example");
		try {
			List<MallUserInfo> results = (List<MallUserInfo>) getSession()
					.createCriteria("www.shopx.userx.MallUserInfo")
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
		log.debug("finding MallUserInfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from MallUserInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<MallUserInfo> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<MallUserInfo> findByUserTruename(Object userTruename) {
		return findByProperty(USER_TRUENAME, userTruename);
	}

	public List<MallUserInfo> findByUserIco(Object userIco) {
		return findByProperty(USER_ICO, userIco);
	}

	public List<MallUserInfo> findByUserMarry(Object userMarry) {
		return findByProperty(USER_MARRY, userMarry);
	}

	public List<MallUserInfo> findByUserGender(Object userGender) {
		return findByProperty(USER_GENDER, userGender);
	}

	public List<MallUserInfo> findByUserMobile(Object userMobile) {
		return findByProperty(USER_MOBILE, userMobile);
	}

	public List<MallUserInfo> findByUserTelphone(Object userTelphone) {
		return findByProperty(USER_TELPHONE, userTelphone);
	}

	public List<MallUserInfo> findByUserCountry(Object userCountry) {
		return findByProperty(USER_COUNTRY, userCountry);
	}

	public List<MallUserInfo> findByUserProvince(Object userProvince) {
		return findByProperty(USER_PROVINCE, userProvince);
	}

	public List<MallUserInfo> findByUserCity(Object userCity) {
		return findByProperty(USER_CITY, userCity);
	}

	public List<MallUserInfo> findByUserDistrict(Object userDistrict) {
		return findByProperty(USER_DISTRICT, userDistrict);
	}

	public List<MallUserInfo> findByUserZipcode(Object userZipcode) {
		return findByProperty(USER_ZIPCODE, userZipcode);
	}

	public List<MallUserInfo> findByUserAddress(Object userAddress) {
		return findByProperty(USER_ADDRESS, userAddress);
	}

	public List<MallUserInfo> findByUserQq(Object userQq) {
		return findByProperty(USER_QQ, userQq);
	}

	public List<MallUserInfo> findByUserMsn(Object userMsn) {
		return findByProperty(USER_MSN, userMsn);
	}

	public List<MallUserInfo> findByUserSkype(Object userSkype) {
		return findByProperty(USER_SKYPE, userSkype);
	}

	public List findAll() {
		log.debug("finding all MallUserInfo instances");
		try {
			String queryString = "from MallUserInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MallUserInfo merge(MallUserInfo detachedInstance) {
		log.debug("merging MallUserInfo instance");
		try {
			MallUserInfo result = (MallUserInfo) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MallUserInfo instance) {
		log.debug("attaching dirty MallUserInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MallUserInfo instance) {
		log.debug("attaching clean MallUserInfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}