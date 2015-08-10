package org.begincode.blog.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.begincode.blog.service.BlogTypeService;
import org.begincode.core.mapper.BlogTypeMapper;
import org.begincode.core.mapper.CodeTypeMapper;
import org.begincode.core.model.BlogType;
import org.begincode.core.model.CodeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author yangsj
 *
 */
@Service
public class BlogTypeServiceImpl implements BlogTypeService
{
	private Logger logger = Logger.getLogger(BlogTypeServiceImpl.class);
	@Autowired
	BlogTypeMapper blogTypeMapper;
	
	 
	/** (非 Javadoc) 
	 * <p>Title: findCodeTypeByUserId</p> 
	 * <p>Description: </p> 
	 * @param userId
	 * @return  
	 * @see org.begincode.code.service.CodeTypeService#findCodeTypeByUserId(int) 
	 */
	public List<BlogType> findBlogTypeByUserId(int userId){
		return blogTypeMapper.selectAllByUserId(userId);
	}
	 
}
