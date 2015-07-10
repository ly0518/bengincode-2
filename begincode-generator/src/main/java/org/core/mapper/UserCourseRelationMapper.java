package org.core.mapper;

import org.core.model.UserCourseRelation;

public interface UserCourseRelationMapper {
    int deleteByPrimaryKey(Integer userCourseRelationId);

    int insert(UserCourseRelation record);

    int insertSelective(UserCourseRelation record);

    UserCourseRelation selectByPrimaryKey(Integer userCourseRelationId);

    int updateByPrimaryKeySelective(UserCourseRelation record);

    int updateByPrimaryKey(UserCourseRelation record);
}