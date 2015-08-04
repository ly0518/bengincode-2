/**   
 * @Title: BegincodeCourse.java 
 * @Package org.begincode.course.service 
 * @Description: TODO 
 * @author liutao   
 * @date 2015年7月30日 下午10:43:41 
 * @version V1.0   
 */
package org.begincode.course.service;

import org.begincode.core.model.BegincodeCourse;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;

/**
 * @ClassName: BegincodeCourse
 * @Description: TODO
 * @author liutao
 * @date 2015年7月30日 下午10:43:41
 * 
 */
public interface BegincodeCourseService {
	/**
	 * @Description: 创建课程
	 * @param course
	 * @return 主键id int
	 * @throws
	 */
	public int create(BegincodeCourse course);

	/**
	 * @Description: 分页查询课程
	 * @param paginator
	 *            分页参数
	 * @param begincodeCourse
	 *            查询参数
	 * @return
	 * @throws
	 */
	public PageList<BegincodeCourse> findAllWithPage(Paginator paginator, BegincodeCourse begincodeCourse);

	/**
	 * @Description: 根据主键id查询详情
	 * @param begincodeCourseId
	 * @return
	 * @throws
	 */
	public BegincodeCourse findById(int begincodeCourseId);

}
