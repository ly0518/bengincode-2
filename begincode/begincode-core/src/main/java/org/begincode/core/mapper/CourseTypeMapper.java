package org.begincode.core.mapper;

import org.begincode.core.model.CourseType;

/**
 * @ClassName: CourseTypeMapper
 * @Description: TODO
 * @author liutao
 * @date 2015�?7�?27�? 下午3:29:28
 *
 */
public interface CourseTypeMapper {
	/**
	 * @Description: 根据courseTypeId删除
	 * @param courseTypeId
	 * @return int
	 * @throws
	 */
	int deleteById(Integer courseTypeId);

	/**
	 * @Description: 新增CourseType
	 * @param record
	 * @return int
	 * @throws
	 */
	int insert(CourseType record);

	/**
	 * @Description: 新增参数中不为空的属�?
	 * @param record
	 * @return int
	 * @throws
	 */
	int insertSelective(CourseType record);

	/**
	 * @Description: 根据courseTypeId查询
	 * @param courseTypeId
	 * @return CourseType
	 * @throws
	 */
	CourseType selectById(Integer courseTypeId);

	/**
	 * @Description: 更新参数中不为空的属�?
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateByIdWithSelective(CourseType record);

	/**
	 * @Description: 更新CourseType
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateById(CourseType record);
}