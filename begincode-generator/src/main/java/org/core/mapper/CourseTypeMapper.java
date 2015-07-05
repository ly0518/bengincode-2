package org.core.mapper;

import org.core.model.CourseType;

public interface CourseTypeMapper {
    int deleteByPrimaryKey(Integer courseTypeId);

    int insert(CourseType record);

    int insertSelective(CourseType record);

    CourseType selectByPrimaryKey(Integer courseTypeId);

    int updateByPrimaryKeySelective(CourseType record);

    int updateByPrimaryKey(CourseType record);
}