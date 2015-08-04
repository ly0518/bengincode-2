/**   
 * @Title: CourseFacade.java 
 * @Package org.begincode.course.facade 
 * @Description: 课程门面类 
 * @author liutao   
 * @date 2015年7月30日 下午6:35:36 
 * @version V1.0   
 */
package org.begincode.course.facade;

import java.util.List;
import java.util.Map;

import org.begincode.core.model.BegincodeCourse;
import org.begincode.core.model.CourseLabel;
import org.begincode.core.model.UserCourseRelation;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.course.exception.CourseRuntimeException;

/**
 * @ClassName: CourseFacade
 * @Description: 课程门面
 * @author liutao
 * @date 2015年7月30日 下午6:35:36
 * 
 */
public interface CourseFacade {
	/**
	 * @Description: 查询课程标签
	 * @return List<CourseLabel>
	 * @throws CourseRuntimeException
	 */
	public List<CourseLabel> findLabels();

	/**
	 * @Description: 创建标签
	 * @return
	 * @throws CourseRuntimeException
	 */
	public int createLabel(CourseLabel courseLabel);

	/**
	 * @Description: 发布教程
	 * @param course
	 * @return
	 * @throws CourseRuntimeException
	 */
	public int createCourse(BegincodeCourse course);

	/**
	 * @Description: 分页查询课程
	 * @param begincodeCourse
	 *            查询参数
	 * @param paginator
	 *            分页参数
	 * @return PageList<BegincodeCourse>
	 * @throws CourseRuntimeException
	 */
	public PageList<BegincodeCourse> findCourseWithPage(Paginator paginator, BegincodeCourse begincodeCourse);

	/**
	 * @Description: 查询用户关注的课程(分页)
	 * @param paginator
	 *            分页参数
	 * @param userCourseRelation
	 *            查询参数
	 * @return PageList<Map<String, Object>>
	 * @throws CourseRuntimeException
	 */
	public PageList<Map<String, Object>> findAttentionCourseByUserWithPage(Paginator paginator, UserCourseRelation userCourseRelation)
			throws CourseRuntimeException;

	/**
	 * @Description: 创建用户关注的课程关系
	 * @param userCourseRelation
	 * @return 新增主键
	 * @throws CourseRuntimeException
	 */
	public int createUserCourseRelation(UserCourseRelation userCourseRelation);

}
