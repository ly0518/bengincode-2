package org.begincode.core.mapper;

import java.util.Map;

import org.begincode.core.model.UserCourseRelation;
import org.begincode.core.paginator.domain.PageList;

/**
 * @ClassName: UserCourseRelationMapper
 * @Description: TODO
 * @author liutao
 * @date 2015年7月27日 下午3:52:53
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

	/**
	 * @Description: 根据查询参数查询符合条件的数据
	 * @param userCourseRelation
	 *            查询参数
	 * @return PageList<Map>
	 * @throws
	 */
	PageList<Map> selectAllBy(UserCourseRelation userCourseRelation);

}