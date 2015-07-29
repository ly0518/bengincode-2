package org.begincode.core.mapper;

import org.begincode.core.model.CourseLabel;

/**
 * @ClassName: CourseLabelMapper
 * @Description: TODO
 * @author liutao
 * @date 2015�?7�?27�? 下午3:37:05
 *
 */
public interface CourseLabelMapper {
	/**
	 * @Description: 根据courseLabelId删除
	 * @param courseLabelId
	 * @return
	 * @throws
	 */
	int deleteById(Integer courseLabelId);

	/**
	 * @Description: 新增CourseLabel
	 * @param record
	 * @return
	 * @throws
	 */
	int insert(CourseLabel record);

	/**
	 * @Description: 新增参数中不为空的属�?
	 * @param record
	 * @return
	 * @throws
	 */
	int insertSelective(CourseLabel record);

	/**
	 * @Description: 根据courseLabelId查询
	 * @param courseLabelId
	 * @return CourseLabel
	 * @throws
	 */
	CourseLabel selectById(Integer courseLabelId);

	/**
	 * @Description: 更新参数中不为空的属�?
	 * @param record
	 * @return
	 * @throws
	 */
	int updateByIdWithSelective(CourseLabel record);

	/**
	 * @Description: 更新CourseType
	 * @param record
	 * @return
	 * @throws
	 */
	int updateById(CourseLabel record);
}