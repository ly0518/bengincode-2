package org.begincode.core.mapper;

import org.begincode.core.model.CourseComment;

/**
 * @ClassName: CourseCommentMapper
 * @Description: TODO
 * @author liutao
 * @date 2015年7月27日 下午2:42:56
 *
 */
public interface CourseCommentMapper {
	/**
	 * @Description: 根据courseCommentId查询
	 * @param courseCommentId
	 * @return int
	 * @throws
	 */
	int deleteById(Integer courseCommentId);

	/**
	 * @Description: 这里用一句话描述这个方法的作用
	 * @param record
	 * @return int
	 * @throws
	 */
	int insert(CourseComment record);

	/**
	 * @Description: 这里用一句话描述这个方法的作用
	 * @param record
	 * @return int
	 * @throws
	 */
	int insertSelective(CourseComment record);

	/**
	 * @Description: 根据courseCommentId查询
	 * @param courseCommentId
	 * @return CourseComment
	 * @throws
	 */
	CourseComment selectById(Integer courseCommentId);

	/**
	 * @Description: 这里用一句话描述这个方法的作用
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateByIdWithSelective(CourseComment record);

	/**
	 * @Description: 这里用一句话描述这个方法的作用
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateById(CourseComment record);
}