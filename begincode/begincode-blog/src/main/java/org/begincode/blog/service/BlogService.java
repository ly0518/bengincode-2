package org.begincode.blog.service;

import java.util.List;

import org.begincode.core.model.Blog;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;

/** 
* @ClassName: BlogService 
* @Description: 博客服务
* @author yangsj 
* @date 2015年8月1日 下午3:13:51 
*  
*/
public interface BlogService 
{
	/**
	 * @Description: 查询blog
	 * @param Blog record,Paginator page
	 * @return PageList
	 * @throws
	 */
	public PageList findBlogsByRecords(Blog record,Paginator page);
	/**
	 * @Description: 查询blog
	 * @param Blog record
	 * @return PageList
	 * @throws
	 */
	public PageList findBlogsByRecord(Blog record);
	
	/**
	 * @Description 根据ID查询
	 * @param int blogId
	 * return Blog
	 * */
	public Blog findBlogById(int blogId);
	 
	/** 
	* @Title: findBlogs 
	* @Description: 查询代码
	* @param page
	* @return PageList   
	* @throws 
	*/
	public PageList findBlogs(Paginator page);
	/**
	 * @Description: 创建博客
	 * @param Blog record
	 * @return Blog
	 * @throws
	 */
	public Blog createBlog(Blog record);
	
	/** 
	* @Title: updateBlog 
	* @Description: 修改blog
	* @param record
	* @return Blog   
	* @throws 
	*/
	public int updateBlog(Blog record);
	/** 
	* @Title: updateAddCountById 
	* @Description: 修改博客浏览，好评，差评次数，原有基础上增加，供定时任务用
	* @param record void   
	* @throws 
	*/
	public void updateAddCountById(Blog record);
	
	
	/** 
	* @Title: batchUpdateAddCountById 
	* @Description: 批量更新浏览次数
	* @param blogs void   
	* @throws 
	*/
	public void batchUpdateAddCountById(List<Blog> blogs);
	
	/** 
	* @Title: findRecommendBlog 
	* @Description: 查看推荐博文
	* @param recommendId
	* @return Blog   
	* @throws 
	*/
	public Blog findRecommendBlog();
}
