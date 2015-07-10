package org.core.mapper;

import org.core.model.CourseComment;

public interface CourseCommentMapper {
    int deleteByPrimaryKey(Integer courseCommentId);

    int insert(CourseComment record);

    int insertSelective(CourseComment record);

    CourseComment selectByPrimaryKey(Integer courseCommentId);

    int updateByPrimaryKeySelective(CourseComment record);

    int updateByPrimaryKey(CourseComment record);
}