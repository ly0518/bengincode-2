/**   
 * @Title: UserCourse.java 
 * @Package org.begincode.course.service 
 * @Description: TODO 
 * @author liutao   
 * @date 2015年7月31日 下午8:51:51 
 * @version V1.0   
 */
package org.begincode.course.service;

import java.util.Map;

import org.begincode.core.model.UserCourseRelation;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.course.exception.CourseRuntimeException;

/**
 * @ClassName: UserCourse
 * @Description: TODO
 * @author liutao
 * @date 2015年7月31日 下午8:51:51
 * 
 */
public interface UserCourseRelationService {
	/**
	 * @Description: 添加用户关注的课程关系
	 * @param userCourseRelation
	 * @return 添加的条数
	 * @throws CourseRuntimeException
	 */
	public int create(UserCourseRelation userCourseRelation) throws CourseRuntimeException;

	/**
	 * @Description: 根据用户id查询所关注的课程 （分页）
	 * @param paginator
	 *            分页参数
	 * @param userCourseRelation
	 *            查询参数
	 * @return PageList<UserCourseRelation>
	 * @throws
	 */
	public PageList<Map<String, Object>> findAllWithPage(Paginator paginator, UserCourseRelation userCourseRelation);

}
