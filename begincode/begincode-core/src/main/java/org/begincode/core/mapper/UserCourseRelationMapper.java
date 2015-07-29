package org.begincode.core.mapper;

import org.begincode.core.model.UserCourseRelation;

/**
 * @ClassName: UserCourseRelationMapper
 * @Description: TODO
 * @author liutao
 * @date 2015�?7�?27�? 下午3:52:53
 *
 */
public interface UserCourseRelationMapper {
	/**
	 * @Description: 根据userCourseRelationId删除
	 * @param userCourseRelationId
	 * @return int
	 * @throws
	 */
	int deleteById(Integer userCourseRelationId);

	/**
	 * @Description: 新增UserCourseRelation
	 * @param record
	 * @return int
	 * @throws
	 */
	int insert(UserCourseRelation record);

	/**
	 * @Description: 新增参数中不为空的属�?
	 * @param record
	 * @return int
	 * @throws
	 */
	int insertSelective(UserCourseRelation record);

	/**
	 * @Description: 根据userCourseRelationId查询
	 * @param userCourseRelationId
	 * @return UserCourseRelation
	 * @throws
	 */
	UserCourseRelation selectById(Integer userCourseRelationId);

	/**
	 * @Description: 更新参数中不为空的属�?
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateByIdWithSelective(UserCourseRelation record);

	/**
	 * @Description: 更新VideoCourseChapter
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateById(UserCourseRelation record);
}