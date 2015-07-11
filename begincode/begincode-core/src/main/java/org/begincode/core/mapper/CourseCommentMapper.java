package org.begincode.core.mapper;

import org.begincode.core.model.CourseComment;

public interface CourseCommentMapper {
    int deleteByPrimaryKey(Integer courseCommentId);

    int insert(CourseComment record);

    int insertSelective(CourseComment record);

    CourseComment selectByPrimaryKey(Integer courseCommentId);

    int updateByPrimaryKeySelective(CourseComment record);

    int updateByPrimaryKey(CourseComment record);
}