package org.begincode.core.mapper;

import org.begincode.core.model.BlogComment;
import org.begincode.core.paginator.domain.PageList;

public interface BlogCommentMapper {
    int deleteByPrimaryKey(Integer blogCommentId);

    int insert(BlogComment record);

    int insertSelective(BlogComment record);

    BlogComment selectByPrimaryKey(Integer blogCommentId);

    int updateByPrimaryKeySelective(BlogComment record);

    int updateByPrimaryKey(BlogComment record);
    
    PageList<BlogComment> selectByBlogId(Integer blogId) ;
}