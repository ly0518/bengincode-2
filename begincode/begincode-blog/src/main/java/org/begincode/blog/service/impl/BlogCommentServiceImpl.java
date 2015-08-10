package org.begincode.blog.service.impl;

import org.apache.log4j.Logger;
import org.begincode.blog.service.BlogCommentService;
import org.begincode.core.mapper.BlogCommentMapper;
import org.begincode.core.model.BlogComment;
import org.begincode.core.paginator.domain.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
/** 
* @ClassName: CodeCommentServiceImpl 
* @Description: 
* @author yangsj 
* @date 2015年8月1日 下午3:22:25 
*  
*/
@Service
public class BlogCommentServiceImpl implements BlogCommentService
{
	private Logger logger = Logger.getLogger(BlogCommentServiceImpl.class);
	 
	@Autowired	BlogCommentMapper blogCommentMapper;
	 
 
	/** (非 Javadoc) 
	 * <p>Title: createBlogCommentSelective</p> 
	 * <p>Description: </p> 
	 * @param blogComment
	 * @return  
	 * @see org.begincode.blog.service.BlogCommentService#createBlogCommentSelective(org.begincode.core.model.BlogComment) 
	 */
	public int createBlogCommentSelective(BlogComment blogComment){
		return  blogCommentMapper.insertSelective(blogComment);
	}
	
	 
	 
	/** (非 Javadoc) 
	 * <p>Title: findBlogCommentByBlogId</p> 
	 * <p>Description: </p> 
	 * @param blogId
	 * @return  
	 * @see org.begincode.blog.service.BlogCommentService#findBlogCommentByBlogId(java.lang.Integer) 
	 */
	public PageList<BlogComment> findBlogCommentByBlogId(Integer blogId){
		return blogCommentMapper.selectByBlogId(blogId);
	}
	
}
