package com.kunpeng.www.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadBase;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;


/**
 * Servlet implementation class UpLoadPic
 */
@WebServlet("/UpLoadPic")
public class UpLoadPic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpLoadPic() {
        super();
        // TODO Auto-generated constructor stub
    }
    static int i = 0;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.setCharacterEncoding("utf-8");
		/*
	   ServletInputStream sis = request.getInputStream();
		File f = new File("e:\\", "b.txt");
		FileOutputStream fos = new FileOutputStream(f);
		byte[] b = new byte[1024];
		int n;
		while ((n = sis.read(b)) != -1) {
			String str = new String(b);
			System.out.println(str);
			fos.write(b, 0, n);
		}

		fos.close();
		sis.close();
		*/
		//上传图片代码
		
		/*ServletInputStream in = request.getInputStream();
		File file = new File(request.getSession().getServletContext().getRealPath("/img/"), "img_" + i + ".jpg");
				// response.getWriter().append(file.getPath());
				FileOutputStream out =new FileOutputStream(file);
			
				byte[] bytes = new byte[1024];
				int len=in.read(bytes, 0, 1024);
				while(len!=-1)
				{
					out.write(bytes, 0, len);
					 len=in.read(bytes, 0, 1024);
				}

				out.close();
				in.close();*/
		
		
				/*
				 DiskFileItemFactory factory = new DiskFileItemFactory(1024*1024*5,new File(this.getServletContext().getRealPath("\\") +"uploadfiles"));        
				 // 设置缓冲区大小为 5M              
				 factory.setSizeThreshold(1024 * 1024 * 5);	
				 
				// 创建一个文件上传的句柄           
				 ServletFileUpload upload = new ServletFileUpload(factory);        
				 //设置上传文件的整个大小和上传的单个文件大小         
				 upload.setSizeMax(1024*1024*50);           
				 upload.setFileSizeMax(1024*1024*5);          
				 try {                
					 //把页面表单中的每一个表单元素解析成一个FileItem    
					 List<FileItem> items = upload.parseRequest(request);      
					 for (FileItem fileItem : items) {              
						 //如果是一个普通的表单元素(type不是file的表单元素)       
						 if(fileItem.isFormField()){          
							 System.out.println(fileItem.getFieldName());  //得到对应表单元素的名字   
							 System.out.println(fileItem.getString());  //得到表单元素的值          
							 }else{                           
								 //获取文件的后缀名         
								 String fileName = fileItem.getName();//得到文件的名字          
								 String fileExt = fileName.substring(fileName.lastIndexOf(".")+1, fileName.length());        
									 try {                                  
										 //将文件上传到项目的upload目录并命名，getRealPath可以得到该web项目下包含/upload的绝对路径//    
										 fileItem.write(new File(request.getServletContext().getRealPath("/uploadfiles")+"/" + UUID.randomUUID().toString()+"."+fileExt));                                 
										 fileItem.write(new File(request.getSession().getServletContext().getRealPath("/img/"), "img_" + i + ".jpg"));                  
										      
										 } catch (Exception e) {             
											 e.printStackTrace();          
											 }                       
								 }                   
						 }            
					 } catch (FileUploadBase.SizeLimitExceededException e) {       
						 System.out.println("整个请求的大小超过了规定的大小...");     
						 } catch (FileUploadBase.FileSizeLimitExceededException e) {     
							 System.out.println("请求中一个上传文件的大小超过了规定的大小...");    
							 }catch (FileUploadException e) {              
								 e.printStackTrace();           
							}
									 
					 */
				 
				 
				 
				 
				 
				 
				
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload uploader = new ServletFileUpload(factory);

		List<FileItem> items = null;
		try {
			items = uploader.parseRequest(request);
			for (FileItem fileItem : items) {
			if (fileItem.isFormField()) {
				// 处理普通表单域
				String field = fileItem.getFieldName();// 表单域名
				System.out.println(field);

				String value = fileItem.getString("UTF-8");
				System.out.println(value);
			} else {
				// 将临时文件保存到指定目录
				String fileName = fileItem.getName();// 文件名称，注意实际开发的时候文件名要用当前时间命名!
				String filepath = this.getServletContext().getRealPath("\\") +"uploadfiles"+File.separator+fileName;//上传路径在实际开发中用this.getServletContext().getRealPath("/uploadfiles")
				System.out
						.println(this.getServletContext().getRealPath("\\") +"uploadfiles"+File.separator+fileName);
				System.out.println(fileName);
				try {
					fileItem.write(new File(filepath));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}// 执行保存
			}
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
