package org.begincode.blog.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.begincode.core.mapper.BegincodeCodeMapper;
import org.begincode.core.mapper.CodeCommentMapper;
import org.begincode.core.model.BegincodeCode;
import org.begincode.core.model.BlogComment;
import org.begincode.core.model.CodeComment;
import org.begincode.core.paginator.domain.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
/** 
* @ClassName: BlogCommentService 
* @Description: 博客评论服务
* @author yangsj 
* @date 2015年8月1日 下午3:16:36 
*  
*/
public interface BlogCommentService 
{
	 
 
	/** 
	* @Title: createBlogCommentSelective 
	* @Description: 创建评论
	* @param BlogComment blogComment
	* @return int   
	* @throws 
	*/
	public int createBlogCommentSelective(BlogComment blogComment);
	 
	/** 
	* @Title: findBlogCommentByBlogId 
	* @Description: 根据博客标识查询评论
	* @param blogId
	* @return PageList<BlogComment>   
	* @throws 
	*/
	public PageList<BlogComment> findBlogCommentByBlogId(Integer blogId);
	
}
