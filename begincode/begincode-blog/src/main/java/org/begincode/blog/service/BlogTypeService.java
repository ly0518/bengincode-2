package org.begincode.blog.service;

import java.util.List;

import org.begincode.core.model.BlogType;

 
/** 
* @ClassName: BlogTypeService 
* @Description: 
* @author yangsj 
* @date 2015年8月1日 下午3:15:03 
*  
*/
public interface BlogTypeService 
{
	 
	
  
	/** 
	* @Title: findCodeTypeByUserId 
	* @Description: 根据用户标识查询blog类型
	* @param int userId
	* @param @return   
	* @return List<CodeType>   
	* @throws 
	*/
	public List<BlogType> findBlogTypeByUserId(int userId);
	
	 
	/** 
	* @Title: createBlogType 
	* @Description: 创建博客分类
	* @param blogType 
	* @return BlogType   
	* @throws 
	*/
	public BlogType createBlogType(BlogType blogType); 
}
