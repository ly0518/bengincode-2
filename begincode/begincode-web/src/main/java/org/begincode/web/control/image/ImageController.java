package org.begincode.web.control.image;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author yangsj
 * 图片上传方法，用于文本编辑器
 */
@Controller
@RequestMapping("/image")
public class ImageController {
	
	private Logger logger = Logger.getLogger(ImageController.class);
	
	String  imgPath= "D://";
	String url ="http://img.begincode.net/";
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public void uploadImg(HttpServletRequest request, HttpServletResponse response) throws JsonGenerationException, JsonMappingException, IOException{
		String renameFileName = ""; 
		 Map message = new HashMap( );
		boolean isMultipart= ServletFileUpload.isMultipartContent(request);
		  if(isMultipart){  
	            //构造一个文件上传处理对象  
	            FileItemFactory factory = new DiskFileItemFactory();  
	            ServletFileUpload upload = new ServletFileUpload(factory);  
	            Iterator items;  
	            try{  
	                //解析表单中提交的所有文件内容  
	                items = upload.parseRequest(request).iterator();  
	                while(items.hasNext()){  
	                    FileItem item = (FileItem) items.next();  
	                    if(!item.isFormField()){  
	                        //取出上传文件的文件名称  
	                        String name = item.getName();  
	                        //取得上传文件以后的存储路径  
	                        String fileName = name.substring(name.lastIndexOf('\\') + 1, name.length());  
	                        //上传文件以后的存储路径  
//	                        String saveDir ="D://";  
	                        if (!(new File(imgPath).isDirectory())){  
	                            new File(imgPath).mkdir();  
	                        }  
	            			SimpleDateFormat format = new SimpleDateFormat("yyyyMMDDHHmmss");
	            			String versionNo = format.format(new Date());
	            			 renameFileName =  versionNo+fileName.substring(fileName.indexOf("."));
	                        String path= imgPath + File.separatorChar + renameFileName;  
	                        //上传文件  
	                        File uploaderFile = new File(path);  
	                        item.write(uploaderFile);  
	                        logger.info("上传图片:"+renameFileName);
	                    }  
	                }  
	            }catch(Exception e){  
                   logger.info("上传图片异常:"+e.getMessage());
	            }  
		  }else{
			  logger.info("上传图片失败:未获取图片");
		  }
		  response.getWriter().print(url+renameFileName);
	}
	
}
