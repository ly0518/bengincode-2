package org.begincode.blog.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.begincode.blog.service.BlogService;
import org.begincode.core.mapper.BlogMapper;
import org.begincode.core.model.Blog;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.core.util.BeginCodePageParam;
import org.begincode.exception.BeginCodeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author yangsj
 *
 */
@Service
public class BlogServiceImpl implements BlogService
{
	private Logger logger = Logger.getLogger(BlogServiceImpl.class);
	 
	@Autowired
	BlogMapper blogMapper;
	
	
	@Override
	public PageList findBlogsByRecord(Blog record){
		return  blogMapper.selectBySelective(record);
	}
	
	@Override
	public Blog findBlogById(int blogId){
		Blog record ;
		try{
			record = blogMapper.selectByPrimaryKey(blogId);
		}catch(Exception e){
			throw new BeginCodeException(e,"blogId 不存在" +blogId);
		}
		return record;
	}
	 
	@Override
	public PageList findBlogs(Paginator page){
		BeginCodePageParam.initPaginator(page);
		return  blogMapper.selectAll();
	}
	
	@Override
	public Blog createBlog(Blog record){
		blogMapper.insertSelective(record);
		return record;
	}

	 
	@Override
	public void updateAddCountById(Blog record) {
		blogMapper.updateAddCountById(record);
	}

	@Override
	public void batchUpdateAddCountById(List<Blog> blogs) {
		blogMapper.batchUpdateAddCountById(blogs);
	}
}
