/**
 * 
 */
package www;

import com.attilax.persistence.Hbx;

/**
 * @author ASIMO
 *
 */
public class Hbx4shp extends Hbx {

		/**
		@author attilax 老哇的爪子
		@since   p1p f_t_p
		 
		 */
	public static Hbx4shp getStance() {
		Hbx4shp c=	 new Hbx4shp();
		c.testHql="from MallUsers";
		c.fac=HibernateSessionFactory.sessionFactory;
		return c;
		
	}

}
