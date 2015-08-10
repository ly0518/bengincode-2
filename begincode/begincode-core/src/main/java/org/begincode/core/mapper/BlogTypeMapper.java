package org.begincode.core.mapper;

import java.util.List;

import org.begincode.core.model.BlogType;

public interface BlogTypeMapper {
    int deleteByPrimaryKey(Integer blogTypeId);

    int insert(BlogType record);

    int insertSelective(BlogType record);

    BlogType selectByPrimaryKey(Integer blogTypeId);

    int updateByPrimaryKeySelective(BlogType record);

    int updateByPrimaryKey(BlogType record);
    
    List<BlogType> selectAllByUserId(Integer userId);
}