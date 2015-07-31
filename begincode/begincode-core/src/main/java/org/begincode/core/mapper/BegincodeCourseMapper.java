package org.begincode.core.mapper;

import org.begincode.core.model.BegincodeCourse;
import org.begincode.core.paginator.domain.PageList;

/**
 * @ClassName: BegincodeCourseMapper
 * @Description: 教程dao mapper
 * @author liutao
 * @date 2015年7月31日 上午11:55:59
 *
 */
public interface BegincodeCourseMapper {

	/**
	 * @Description: 删除
	 * @param begincodeCourseId主键id
	 * @return int 删除记录条数
	 * @throws
	 */
	int deleteById(Integer begincodeCourseId);

	/**
	 * @Description: 新增
	 * @param record
	 * @return int 新增记录条数
	 * @throws
	 */
	int insert(BegincodeCourse record);

	/**
	 * @Description: 新增
	 * @param record
	 * @return int 新增记录条数
	 * @throws
	 */
	int insertSelective(BegincodeCourse record);

	/**
	 * @Description: 根据主键查询
	 * @param begincodeCourseId主键id
	 * @return BegincodeCourse
	 * @throws
	 */
	BegincodeCourse selectById(Integer begincodeCourseId);

	/**
	 * @Description: 更新（参数中不为空的属性）
	 * @param record
	 * @return int 更新条数
	 * @throws
	 */
	int updateByIdWithSelective(BegincodeCourse record);

	/**
	 * @Description: 更新
	 * @param record
	 * @return int 更新条数
	 * @throws
	 */
	int updateById(BegincodeCourse record);

	/**
	 * @Description: 根据参数中的属性查询所有的记录
	 * @param begincodeCourse
	 * @return PageList<BegincodeCourse>
	 * @throws
	 */
	PageList<BegincodeCourse> selectAllBy(BegincodeCourse begincodeCourse);
}