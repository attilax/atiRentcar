package www.attilax.car;

import java.util.Map;

import net.sf.json.JSONObject;

import com.attilax.car.HxCar;
import com.attilax.io.pathx;
import com.attilax.lang.core;
import com.attilax.lang.ref.FldMapX;
import com.attilax.lang.ref.RefX;
import com.kunpeng.www.dao.CarDAOImp;
import com.kunpeng.www.domain.CarVo;
import com.kunpeng.www.domain.ComVo;

import www.attilax.lang.JsonX;

public class carT {

	public static void main(String[] args) throws Exception {
		 new carT().te();
		//  org.apache.log4j.Logger
		// org.apache.log4j.Logger
		//  org.apache.log4j.Logger
		// org.apache.commons.logging.LogConfigurationException
		// org.apache.commons.logging.LogConfigurationException
	}

	private void te() throws Exception {
		String json_s=JsonX.getFrmAtiTxt(pathx.classPath(carT.class)+"/car.json");
		System.out.println(json_s);
		
		JSONObject jo=JSONObject.fromObject(json_s);
		HxCar car=new HxCar();
	Map fldMpper=	FldMapX.frmTxt(pathx.classPath(carT.class)+"/carMap.txt");
	System.out.println(core.toJsonStrO88(fldMpper));
	RefX.copyProperties(jo, car,fldMpper);	 
//	CarDAOImp cdc=new CarDAOImp();
//			cdc.save(car);
	System.out.println(core.toJsonStrO88(car));
	
	
	}

}
