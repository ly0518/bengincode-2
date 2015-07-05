package org.core.mapper;

import org.core.model.CourseLabel;

public interface CourseLabelMapper {
    int deleteByPrimaryKey(Integer courseLabelId);

    int insert(CourseLabel record);

    int insertSelective(CourseLabel record);

    CourseLabel selectByPrimaryKey(Integer courseLabelId);

    int updateByPrimaryKeySelective(CourseLabel record);

    int updateByPrimaryKey(CourseLabel record);
}