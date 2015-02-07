package www.attilax.car;

import java.util.Map;

import net.sf.json.JSONObject;

import com.attilax.car.HxCar;
import com.attilax.car.HxCarDAO;
import com.attilax.cfg.IocX;
import com.attilax.io.pathx;
import com.attilax.lang.core;
import com.attilax.lang.ref.FldMapX;
import com.attilax.lang.ref.RefX;
import com.attilax.persistence.PX;
import com.kunpeng.www.dao.CarDAOImp;
import com.kunpeng.www.domain.CarVo;
import com.kunpeng.www.domain.ComVo;

import www.attilax.lang.JsonX;

public class kaT {

	public static void main(String[] args) throws Exception {
		System.out.println("aa");
	//	ft();
		System.out.println("--000000");
	  new kaT().te();
		//  org.apache.log4j.Logger
		// org.apache.log4j.Logger
		//  org.apache.log4j.Logger
		// org.apache.commons.logging.LogConfigurationException
		// org.apache.commons.logging.LogConfigurationException
	}

	private static void ft() {
		//org.jboss.logging.BasicLogger
	//	Logger
		HxCar a=new HxCar();
		a.setName("title");
	//	HxCarDAO dao=new HxCarDAO();
	//	dao.save(a);
 	PX px=IocX.getBean(PX.class);
	 	px.save(a);
	}

	private void te() throws Exception {
		String json_s=JsonX.getFrmAtiTxt(pathx.classPath(kaT.class)+"/car.json");
		System.out.println(json_s);
		
		JSONObject jo=JSONObject.fromObject(json_s);
		HxCar car=new HxCar();
	Map fldMpper=	FldMapX.frmTxt(pathx.classPath(kaT.class)+"/carMap.txt");
	System.out.println(core.toJsonStrO88(fldMpper));
	RefX.copyProperties(jo, car,fldMpper);	 
//	CarDAOImp cdc=new CarDAOImp();
//			cdc.save(car);
	System.out.println(core.toJsonStrO88(car));
	
	
	}

}
