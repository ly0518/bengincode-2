package org.begincode.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.begincode.core.model.CourseLabel;

/**
 * @ClassName: CourseLabelMapper
 * @Description: 教程标签分类Dao
 * @author liutao
 * @date 2015年7月27日 下午3:37:05
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
	 * @return int
	 * @throws
	 */
	int insert(CourseLabel record);

	/**
	 * @Description: 新增参数中不为空的属性
	 * @param record
	 * @return int
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
	 * @Description: 更新参数中不为空的属性
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateByIdWithSelective(CourseLabel record);

	/**
	 * @Description: 更新CourseType
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateById(CourseLabel record);

	/**
	 * @Description: 这里用一句话描述这个方法的作用
	 * @param deleteFlag
	 * @return List<{@link CourseLabel}>
	 * @throws
	 */
	List<CourseLabel> selectAll(@Param("deleteFlag") String deleteFlag);
}