package org.begincode.core.mapper;

import org.begincode.core.model.UserCourseRelation;

public interface UserCourseRelationMapper {
    int deleteByPrimaryKey(Integer userCourseRelationId);

    int insert(UserCourseRelation record);

    int insertSelective(UserCourseRelation record);

    UserCourseRelation selectByPrimaryKey(Integer userCourseRelationId);

    int updateByPrimaryKeySelective(UserCourseRelation record);

    int updateByPrimaryKey(UserCourseRelation record);
}