package com.kunpeng.www.config;

import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.dom4j.DocumentException;

import com.kunpeng.www.domain.DBVo;


public class DBXMLTool {
	
	private DBVo dbDao=new DBVo();
	private boolean ishavedb=false;
	public DBVo getDbDao() {
		return dbDao;
	}
	public void setDbDao(DBVo dbDao) {
		this.dbDao = dbDao;
	}
	public boolean isIshavedb() {
		return ishavedb;
	}
	public void setIshavedb(boolean ishavedb) {
		this.ishavedb = ishavedb;
	}

	public DBXMLTool(String type) throws Exception{
		SAXReader reader=new SAXReader();
		Document doc=reader.read(DBXMLTool.class.getResourceAsStream("dbconfig.xml"));
		Element root = doc.getRootElement();// 先找根节点
		//模糊查询
		List<Element> elements = root.selectNodes("//dbconfig[@type='"+type+"']");
		if(elements.isEmpty()){
			this.ishavedb=false;
			setIshavedb(ishavedb);
		}else{
			this.ishavedb=true;
			setIshavedb(ishavedb);
			for (Element element : elements) {
				dbDao.setUrl(element.elementText("url"));
				dbDao.setUser(element.elementText("user"));
				dbDao.setPassword(element.elementText("password"));
				dbDao.setDbname(element.elementText("dbname"));
			}
			setDbDao(dbDao);
		}
		
	}
	
}
