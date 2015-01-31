package www.shopx.shopinfo;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * MallShopInfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see www.shopx.shopinfo.MallShopInfo
 * @author MyEclipse Persistence Tools
 */

public class MallShopInfoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(MallShopInfoDAO.class);
	// property constants
	public static final String SHOP_COMMEND = "shopCommend";
	public static final String USER_ID = "userId";
	public static final String SHOP_NAME = "shopName";
	public static final String SHOP_COUNTRY = "shopCountry";
	public static final String SHOP_PROVINCE = "shopProvince";
	public static final String SHOP_CITY = "shopCity";
	public static final String SHOP_DISTRICT = "shopDistrict";
	public static final String SHOP_ADDRESS = "shopAddress";
	public static final String SHOP_IMAGES = "shopImages";
	public static final String SHOP_LOGO = "shopLogo";
	public static final String SHOP_TEMPLATE_IMG = "shopTemplateImg";
	public static final String SHOP_TEMPLATE = "shopTemplate";
	public static final String SHOP_MANAGEMENT = "shopManagement";
	public static final String SHOP_INTRO = "shopIntro";
	public static final String SHOP_NOTICE = "shopNotice";
	public static final String GOODS_NUM = "goodsNum";
	public static final String OPEN_FLG = "openFlg";
	public static final String LOCK_FLG = "lockFlg";
	public static final String MAP_X = "mapX";
	public static final String MAP_Y = "mapY";
	public static final String MAP_ZOOM = "mapZoom";
	public static final String COUNT_IMGSIZE = "countImgsize";
	public static final String SHOP_CATEGORIES = "shopCategories";
	public static final String SHOP_DOMAIN = "shopDomain";

	public void save(MallShopInfo transientInstance) {
		log.debug("saving MallShopInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MallShopInfo persistentInstance) {
		log.debug("deleting MallShopInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MallShopInfo findById(java.lang.Integer id) {
		log.debug("getting MallShopInfo instance with id: " + id);
		try {
			MallShopInfo instance = (MallShopInfo) getSession().get(
					"www.shopx.shopinfo.MallShopInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<MallShopInfo> findByExample(MallShopInfo instance) {
		log.debug("finding MallShopInfo instance by example");
		try {
			List<MallShopInfo> results = (List<MallShopInfo>) getSession()
					.createCriteria("www.shopx.shopinfo.MallShopInfo")
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
		log.debug("finding MallShopInfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from MallShopInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<MallShopInfo> findByShopCommend(Object shopCommend) {
		return findByProperty(SHOP_COMMEND, shopCommend);
	}

	public List<MallShopInfo> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<MallShopInfo> findByShopName(Object shopName) {
		return findByProperty(SHOP_NAME, shopName);
	}

	public List<MallShopInfo> findByShopCountry(Object shopCountry) {
		return findByProperty(SHOP_COUNTRY, shopCountry);
	}

	public List<MallShopInfo> findByShopProvince(Object shopProvince) {
		return findByProperty(SHOP_PROVINCE, shopProvince);
	}

	public List<MallShopInfo> findByShopCity(Object shopCity) {
		return findByProperty(SHOP_CITY, shopCity);
	}

	public List<MallShopInfo> findByShopDistrict(Object shopDistrict) {
		return findByProperty(SHOP_DISTRICT, shopDistrict);
	}

	public List<MallShopInfo> findByShopAddress(Object shopAddress) {
		return findByProperty(SHOP_ADDRESS, shopAddress);
	}

	public List<MallShopInfo> findByShopImages(Object shopImages) {
		return findByProperty(SHOP_IMAGES, shopImages);
	}

	public List<MallShopInfo> findByShopLogo(Object shopLogo) {
		return findByProperty(SHOP_LOGO, shopLogo);
	}

	public List<MallShopInfo> findByShopTemplateImg(Object shopTemplateImg) {
		return findByProperty(SHOP_TEMPLATE_IMG, shopTemplateImg);
	}

	public List<MallShopInfo> findByShopTemplate(Object shopTemplate) {
		return findByProperty(SHOP_TEMPLATE, shopTemplate);
	}

	public List<MallShopInfo> findByShopManagement(Object shopManagement) {
		return findByProperty(SHOP_MANAGEMENT, shopManagement);
	}

	public List<MallShopInfo> findByShopIntro(Object shopIntro) {
		return findByProperty(SHOP_INTRO, shopIntro);
	}

	public List<MallShopInfo> findByShopNotice(Object shopNotice) {
		return findByProperty(SHOP_NOTICE, shopNotice);
	}

	public List<MallShopInfo> findByGoodsNum(Object goodsNum) {
		return findByProperty(GOODS_NUM, goodsNum);
	}

	public List<MallShopInfo> findByOpenFlg(Object openFlg) {
		return findByProperty(OPEN_FLG, openFlg);
	}

	public List<MallShopInfo> findByLockFlg(Object lockFlg) {
		return findByProperty(LOCK_FLG, lockFlg);
	}

	public List<MallShopInfo> findByMapX(Object mapX) {
		return findByProperty(MAP_X, mapX);
	}

	public List<MallShopInfo> findByMapY(Object mapY) {
		return findByProperty(MAP_Y, mapY);
	}

	public List<MallShopInfo> findByMapZoom(Object mapZoom) {
		return findByProperty(MAP_ZOOM, mapZoom);
	}

	public List<MallShopInfo> findByCountImgsize(Object countImgsize) {
		return findByProperty(COUNT_IMGSIZE, countImgsize);
	}

	public List<MallShopInfo> findByShopCategories(Object shopCategories) {
		return findByProperty(SHOP_CATEGORIES, shopCategories);
	}

	public List<MallShopInfo> findByShopDomain(Object shopDomain) {
		return findByProperty(SHOP_DOMAIN, shopDomain);
	}

	public List findAll() {
		log.debug("finding all MallShopInfo instances");
		try {
			String queryString = "from MallShopInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MallShopInfo merge(MallShopInfo detachedInstance) {
		log.debug("merging MallShopInfo instance");
		try {
			MallShopInfo result = (MallShopInfo) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MallShopInfo instance) {
		log.debug("attaching dirty MallShopInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MallShopInfo instance) {
		log.debug("attaching clean MallShopInfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}