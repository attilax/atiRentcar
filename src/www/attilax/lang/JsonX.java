/**
 * 
 */
package www.attilax.lang;

import java.util.List;

import com.attilax.io.filex;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @author ASIMO
 *
 */
public class JsonX {

	/**
	@author attilax 老哇的爪�?
	@since   p1p e_q_46
	 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static String toJsonStrO88(final Object objOrArr) {
		// attilax 鑰佸搰鐨勭埅瀛�涓嬪�?02:08:01 2014-5-12
//   涓嬪�?07:17:11 2014-9-1  鑰佸搰鐨勭埅瀛� Attilax
		try {
			return JSONObject.fromObject(objOrArr).toString(2);
		} catch (Exception e) {
			return JSONArray.fromObject(objOrArr).toString(2);
		}
		 
	}


	public static String getFrmAtiTxt(String f) {
		List<String> li=filex.toList_filtEmptyNTrim(f);
		JSONObject jo=new JSONObject();
		for (String line : li) {
			String[] a=line.split(",");
		
			jo.put(a[0], a[1]);
			
		}
		return jo.toString(2);
	}

}
