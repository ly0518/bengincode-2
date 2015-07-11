package org.begincode.core.mapper;

import org.begincode.core.model.BegincodeCourse;

public interface BegincodeCourseMapper {
    int deleteByPrimaryKey(Integer begincodeCourseId);

    int insert(BegincodeCourse record);

    int insertSelective(BegincodeCourse record);

    BegincodeCourse selectByPrimaryKey(Integer begincodeCourseId);

    int updateByPrimaryKeySelective(BegincodeCourse record);

    int updateByPrimaryKey(BegincodeCourse record);
}