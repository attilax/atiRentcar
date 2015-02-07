//package com.kunpeng.www.controller;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//import java.util.UUID;
//
//import javax.servlet.ServletException;
//import javax.servlet.ServletInputStream;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.tomcat.util.http.fileupload.FileItem;
//import org.apache.tomcat.util.http.fileupload.FileUploadBase;
//import org.apache.tomcat.util.http.fileupload.FileUploadException;
//import org.apache.tomcat.util.http.fileupload.RequestContext;
//import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
//import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
//
//
///**
// * Servlet implementation class UpLoadPic
// */
//@WebServlet("/UpLoadPic")
//public class UpLoadPic extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public UpLoadPic() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//    static int i = 0;
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//	//	response.setCharacterEncoding("utf-8");
//		/*
//	   ServletInputStream sis = request.getInputStream();
//		File f = new File("e:\\", "b.txt");
//		FileOutputStream fos = new FileOutputStream(f);
//		byte[] b = new byte[1024];
//		int n;
//		while ((n = sis.read(b)) != -1) {
//			String str = new String(b);
//			System.out.println(str);
//			fos.write(b, 0, n);
//		}
//
//		fos.close();
//		sis.close();
//		*/
//		//�ϴ�ͼƬ����
//		
//		/*ServletInputStream in = request.getInputStream();
//		File file = new File(request.getSession().getServletContext().getRealPath("/img/"), "img_" + i + ".jpg");
//				// response.getWriter().append(file.getPath());
//				FileOutputStream out =new FileOutputStream(file);
//			
//				byte[] bytes = new byte[1024];
//				int len=in.read(bytes, 0, 1024);
//				while(len!=-1)
//				{
//					out.write(bytes, 0, len);
//					 len=in.read(bytes, 0, 1024);
//				}
//
//				out.close();
//				in.close();*/
//		
//		
//				/*
//				 DiskFileItemFactory factory = new DiskFileItemFactory(1024*1024*5,new File(this.getServletContext().getRealPath("\\") +"uploadfiles"));        
//				 // ���û�������СΪ 5M              
//				 factory.setSizeThreshold(1024 * 1024 * 5);	
//				 
//				// ����һ���ļ��ϴ��ľ��           
//				 ServletFileUpload upload = new ServletFileUpload(factory);        
//				 //�����ϴ��ļ���������С���ϴ��ĵ����ļ���С         
//				 upload.setSizeMax(1024*1024*50);           
//				 upload.setFileSizeMax(1024*1024*5);          
//				 try {                
//					 //��ҳ����е�ÿһ����Ԫ�ؽ�����һ��FileItem    
//					 List<FileItem> items = upload.parseRequest(request);      
//					 for (FileItem fileItem : items) {              
//						 //�����һ����ͨ�ı�Ԫ��(type����file�ı�Ԫ��)       
//						 if(fileItem.isFormField()){          
//							 System.out.println(fileItem.getFieldName());  //�õ���Ӧ��Ԫ�ص�����   
//							 System.out.println(fileItem.getString());  //�õ���Ԫ�ص�ֵ          
//							 }else{                           
//								 //��ȡ�ļ��ĺ�׺��         
//								 String fileName = fileItem.getName();//�õ��ļ�������          
//								 String fileExt = fileName.substring(fileName.lastIndexOf(".")+1, fileName.length());        
//									 try {                                  
//										 //���ļ��ϴ�����Ŀ��uploadĿ¼��������getRealPath���Եõ���web��Ŀ�°���/upload�ľ���·��//    
//										 fileItem.write(new File(request.getServletContext().getRealPath("/uploadfiles")+"/" + UUID.randomUUID().toString()+"."+fileExt));                                 
//										 fileItem.write(new File(request.getSession().getServletContext().getRealPath("/img/"), "img_" + i + ".jpg"));                  
//										      
//										 } catch (Exception e) {             
//											 e.printStackTrace();          
//											 }                       
//								 }                   
//						 }            
//					 } catch (FileUploadBase.SizeLimitExceededException e) {       
//						 System.out.println("��������Ĵ�С�����˹涨�Ĵ�С...");     
//						 } catch (FileUploadBase.FileSizeLimitExceededException e) {     
//							 System.out.println("������һ���ϴ��ļ��Ĵ�С�����˹涨�Ĵ�С...");    
//							 }catch (FileUploadException e) {              
//								 e.printStackTrace();           
//							}
//									 
//					 */
//				 
//				 
//				 
//				 
//				 
//				 
//				
//		DiskFileItemFactory factory = new DiskFileItemFactory();
//		ServletFileUpload uploader = new ServletFileUpload(factory);
//
//		List<FileItem> items = null;
//		try {
//			items = uploader.parseRequest((RequestContext)request);
//			for (FileItem fileItem : items) {
//			if (fileItem.isFormField()) {
//				// ������ͨ����
//				String field = fileItem.getFieldName();// ������
//				System.out.println(field);
//
//				String value = fileItem.getString("UTF-8");
//				System.out.println(value);
//			} else {
//				// ����ʱ�ļ����浽ָ��Ŀ¼
//				String fileName = fileItem.getName();// �ļ����ƣ�ע��ʵ�ʿ�����ʱ���ļ���Ҫ�õ�ǰʱ������!
//				String filepath = this.getServletContext().getRealPath("\\") +"uploadfiles"+File.separator+fileName;//�ϴ�·����ʵ�ʿ�������this.getServletContext().getRealPath("/uploadfiles")
//				System.out
//						.println(this.getServletContext().getRealPath("\\") +"uploadfiles"+File.separator+fileName);
//				System.out.println(fileName);
//				try {
//					fileItem.write(new File(filepath));
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}// ִ�б���
//			}
//			}
//		} catch (FileUploadException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
