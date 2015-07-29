package org.begincode.core.mapper;

import org.begincode.core.model.CourseKeynote;

/**
 * @ClassName: CourseKeynoteMapper
 * @Description: TODO
 * @author liutao
 * @date 2015�?7�?27�? 下午2:57:41
 *
 */
public interface CourseKeynoteMapper {
	/**
	 * @Description: 根据courseKeynoteId删除
	 * @param courseKeynoteId
	 * @return int
	 * @throws
	 */
	int deleteById(Integer courseKeynoteId);

	/**
	 * @Description: 新增
	 * @param record
	 * @return int
	 * @throws
	 */
	int insert(CourseKeynote record);

	/**
	 * @Description: 新增参数中不为空的属�?
	 * @param record
	 * @return int
	 * @throws
	 */
	int insertSelective(CourseKeynote record);

	/**
	 * @Description: 根据courseKeynoteId查询
	 * @param courseKeynoteId
	 * @return int
	 * @throws
	 */
	CourseKeynote selectById(Integer courseKeynoteId);

	/**
	 * @Description: 更新参数中不为空的属�?
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateByIdWithSelective(CourseKeynote record);

	/**
	 * @Description: 更新全部
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateById(CourseKeynote record);

	/**
	 * @Description: 只更新videoCourseChapterId
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateByIdWithVideoId(CourseKeynote record);
}