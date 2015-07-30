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
import org.begincode.course.exception.CourseRuntimeException;

/**
 * @ClassName: BegincodeCourse
 * @Description: TODO
 * @author liutao
 * @date 2015年7月30日 下午10:43:41
 * 
 */
public interface BegincodeCourseService {
	/**
	 * @Description: 这里用一句话描述这个方法的作用
	 * @param course
	 * @return 主键id int
	 * @throws
	 */
	public int create(BegincodeCourse course) throws CourseRuntimeException;

}
