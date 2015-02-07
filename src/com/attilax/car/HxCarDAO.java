package com.attilax.car;

import Acfg.hbbasedao;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for HxCar
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.attilax.car.HxCar
 * @author MyEclipse Persistence Tools
 */

public class HxCarDAO extends hbbasedao {
	private static final Logger log = LoggerFactory.getLogger(HxCarDAO.class);
	// property constants
	public static final String CAR_ID = "carId";
	public static final String SN_ID = "snId";
	public static final String SN = "sn";
	public static final String NAME = "name";
	public static final String NAME_STYLE = "nameStyle";
	public static final String CITY_ID = "cityId";
	public static final String PROVINCE_ID = "provinceId";
	public static final String AREA_ID = "areaId";
	public static final String STREET_ID = "streetId";
	public static final String DEPARTMENT_ID = "departmentId";
	public static final String CUSTOMER_ID = "customerId";
	public static final String CARTYPE = "cartype";
	public static final String SPEEDTYPE = "speedtype";
	public static final String WORKPLACE = "workplace";
	public static final String HOMETOWN = "hometown";
	public static final String PAILIANG = "pailiang";
	public static final String PRICE = "price";
	public static final String PRICE_NAME = "priceName";
	public static final String IS_USE = "isUse";
	public static final String CLICK_COUNT = "clickCount";
	public static final String BRAND_ID = "brandId";
	public static final String PROVIDER_NAME = "providerName";
	public static final String GOODS_NUMBER = "goodsNumber";
	public static final String GOODS_WEIGHT = "goodsWeight";
	public static final String MARKET_PRICE = "marketPrice";
	public static final String SHOP_PRICE = "shopPrice";
	public static final String PROMOTE_PRICE = "promotePrice";
	public static final String PROMOTE_START_DATE = "promoteStartDate";
	public static final String PROMOTE_END_DATE = "promoteEndDate";
	public static final String WARN_NUMBER = "warnNumber";
	public static final String KEYWORDS = "keywords";
	public static final String GOODS_BRIEF = "goodsBrief";
	public static final String GOODS_DESC = "goodsDesc";
	public static final String GOODS_THUMB = "goodsThumb";
	public static final String GOODS_IMG = "goodsImg";
	public static final String ORIGINAL_IMG = "originalImg";
	public static final String IS_REAL = "isReal";
	public static final String EXTENSION_CODE = "extensionCode";
	public static final String IS_ON_SALE = "isOnSale";
	public static final String IS_ALONE_SALE = "isAloneSale";
	public static final String IS_SHIPPING = "isShipping";
	public static final String INTEGRAL = "integral";
	public static final String ADD_TIME = "addTime";
	public static final String SORT_ORDER = "sortOrder";
	public static final String IS_DELETE = "isDelete";
	public static final String IS_BEST = "isBest";
	public static final String IS_NEW = "isNew";
	public static final String IS_HOT = "isHot";
	public static final String IS_PROMOTE = "isPromote";
	public static final String BONUS_TYPE_ID = "bonusTypeId";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String GOODS_TYPE = "goodsType";
	public static final String SELLER_NOTE = "sellerNote";
	public static final String GIVE_INTEGRAL = "giveIntegral";
	public static final String RANK_INTEGRAL = "rankIntegral";
	public static final String SUPPLIERS_ID = "suppliersId";
	public static final String IS_CHECK = "isCheck";

	public void save(HxCar transientInstance) {
		log.debug("saving HxCar instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(HxCar persistentInstance) {
		log.debug("deleting HxCar instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public HxCar findById(java.lang.Integer id) {
		log.debug("getting HxCar instance with id: " + id);
		try {
			HxCar instance = (HxCar) getSession().get("com.attilax.car.HxCar",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<HxCar> findByExample(HxCar instance) {
		log.debug("finding HxCar instance by example");
		try {
			List<HxCar> results = (List<HxCar>) getSession()
					.createCriteria("com.attilax.car.HxCar")
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
		log.debug("finding HxCar instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from HxCar as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<HxCar> findByCarId(Object carId) {
		return findByProperty(CAR_ID, carId);
	}

	public List<HxCar> findBySnId(Object snId) {
		return findByProperty(SN_ID, snId);
	}

	public List<HxCar> findBySn(Object sn) {
		return findByProperty(SN, sn);
	}

	public List<HxCar> findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List<HxCar> findByNameStyle(Object nameStyle) {
		return findByProperty(NAME_STYLE, nameStyle);
	}

	public List<HxCar> findByCityId(Object cityId) {
		return findByProperty(CITY_ID, cityId);
	}

	public List<HxCar> findByProvinceId(Object provinceId) {
		return findByProperty(PROVINCE_ID, provinceId);
	}

	public List<HxCar> findByAreaId(Object areaId) {
		return findByProperty(AREA_ID, areaId);
	}

	public List<HxCar> findByStreetId(Object streetId) {
		return findByProperty(STREET_ID, streetId);
	}

	public List<HxCar> findByDepartmentId(Object departmentId) {
		return findByProperty(DEPARTMENT_ID, departmentId);
	}

	public List<HxCar> findByCustomerId(Object customerId) {
		return findByProperty(CUSTOMER_ID, customerId);
	}

	public List<HxCar> findByCartype(Object cartype) {
		return findByProperty(CARTYPE, cartype);
	}

	public List<HxCar> findBySpeedtype(Object speedtype) {
		return findByProperty(SPEEDTYPE, speedtype);
	}

	public List<HxCar> findByWorkplace(Object workplace) {
		return findByProperty(WORKPLACE, workplace);
	}

	public List<HxCar> findByHometown(Object hometown) {
		return findByProperty(HOMETOWN, hometown);
	}

	public List<HxCar> findByPailiang(Object pailiang) {
		return findByProperty(PAILIANG, pailiang);
	}

	public List<HxCar> findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List<HxCar> findByPriceName(Object priceName) {
		return findByProperty(PRICE_NAME, priceName);
	}

	public List<HxCar> findByIsUse(Object isUse) {
		return findByProperty(IS_USE, isUse);
	}

	public List<HxCar> findByClickCount(Object clickCount) {
		return findByProperty(CLICK_COUNT, clickCount);
	}

	public List<HxCar> findByBrandId(Object brandId) {
		return findByProperty(BRAND_ID, brandId);
	}

	public List<HxCar> findByProviderName(Object providerName) {
		return findByProperty(PROVIDER_NAME, providerName);
	}

	public List<HxCar> findByGoodsNumber(Object goodsNumber) {
		return findByProperty(GOODS_NUMBER, goodsNumber);
	}

	public List<HxCar> findByGoodsWeight(Object goodsWeight) {
		return findByProperty(GOODS_WEIGHT, goodsWeight);
	}

	public List<HxCar> findByMarketPrice(Object marketPrice) {
		return findByProperty(MARKET_PRICE, marketPrice);
	}

	public List<HxCar> findByShopPrice(Object shopPrice) {
		return findByProperty(SHOP_PRICE, shopPrice);
	}

	public List<HxCar> findByPromotePrice(Object promotePrice) {
		return findByProperty(PROMOTE_PRICE, promotePrice);
	}

	public List<HxCar> findByPromoteStartDate(Object promoteStartDate) {
		return findByProperty(PROMOTE_START_DATE, promoteStartDate);
	}

	public List<HxCar> findByPromoteEndDate(Object promoteEndDate) {
		return findByProperty(PROMOTE_END_DATE, promoteEndDate);
	}

	public List<HxCar> findByWarnNumber(Object warnNumber) {
		return findByProperty(WARN_NUMBER, warnNumber);
	}

	public List<HxCar> findByKeywords(Object keywords) {
		return findByProperty(KEYWORDS, keywords);
	}

	public List<HxCar> findByGoodsBrief(Object goodsBrief) {
		return findByProperty(GOODS_BRIEF, goodsBrief);
	}

	public List<HxCar> findByGoodsDesc(Object goodsDesc) {
		return findByProperty(GOODS_DESC, goodsDesc);
	}

	public List<HxCar> findByGoodsThumb(Object goodsThumb) {
		return findByProperty(GOODS_THUMB, goodsThumb);
	}

	public List<HxCar> findByGoodsImg(Object goodsImg) {
		return findByProperty(GOODS_IMG, goodsImg);
	}

	public List<HxCar> findByOriginalImg(Object originalImg) {
		return findByProperty(ORIGINAL_IMG, originalImg);
	}

	public List<HxCar> findByIsReal(Object isReal) {
		return findByProperty(IS_REAL, isReal);
	}

	public List<HxCar> findByExtensionCode(Object extensionCode) {
		return findByProperty(EXTENSION_CODE, extensionCode);
	}

	public List<HxCar> findByIsOnSale(Object isOnSale) {
		return findByProperty(IS_ON_SALE, isOnSale);
	}

	public List<HxCar> findByIsAloneSale(Object isAloneSale) {
		return findByProperty(IS_ALONE_SALE, isAloneSale);
	}

	public List<HxCar> findByIsShipping(Object isShipping) {
		return findByProperty(IS_SHIPPING, isShipping);
	}

	public List<HxCar> findByIntegral(Object integral) {
		return findByProperty(INTEGRAL, integral);
	}

	public List<HxCar> findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List<HxCar> findBySortOrder(Object sortOrder) {
		return findByProperty(SORT_ORDER, sortOrder);
	}

	public List<HxCar> findByIsDelete(Object isDelete) {
		return findByProperty(IS_DELETE, isDelete);
	}

	public List<HxCar> findByIsBest(Object isBest) {
		return findByProperty(IS_BEST, isBest);
	}

	public List<HxCar> findByIsNew(Object isNew) {
		return findByProperty(IS_NEW, isNew);
	}

	public List<HxCar> findByIsHot(Object isHot) {
		return findByProperty(IS_HOT, isHot);
	}

	public List<HxCar> findByIsPromote(Object isPromote) {
		return findByProperty(IS_PROMOTE, isPromote);
	}

	public List<HxCar> findByBonusTypeId(Object bonusTypeId) {
		return findByProperty(BONUS_TYPE_ID, bonusTypeId);
	}

	public List<HxCar> findByLastUpdate(Object lastUpdate) {
		return findByProperty(LAST_UPDATE, lastUpdate);
	}

	public List<HxCar> findByGoodsType(Object goodsType) {
		return findByProperty(GOODS_TYPE, goodsType);
	}

	public List<HxCar> findBySellerNote(Object sellerNote) {
		return findByProperty(SELLER_NOTE, sellerNote);
	}

	public List<HxCar> findByGiveIntegral(Object giveIntegral) {
		return findByProperty(GIVE_INTEGRAL, giveIntegral);
	}

	public List<HxCar> findByRankIntegral(Object rankIntegral) {
		return findByProperty(RANK_INTEGRAL, rankIntegral);
	}

	public List<HxCar> findBySuppliersId(Object suppliersId) {
		return findByProperty(SUPPLIERS_ID, suppliersId);
	}

	public List<HxCar> findByIsCheck(Object isCheck) {
		return findByProperty(IS_CHECK, isCheck);
	}

	public List findAll() {
		log.debug("finding all HxCar instances");
		try {
			String queryString = "from HxCar";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public HxCar merge(HxCar detachedInstance) {
		log.debug("merging HxCar instance");
		try {
			HxCar result = (HxCar) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(HxCar instance) {
		log.debug("attaching dirty HxCar instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(HxCar instance) {
		log.debug("attaching clean HxCar instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}