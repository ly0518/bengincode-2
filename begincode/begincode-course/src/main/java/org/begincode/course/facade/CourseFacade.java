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

import org.begincode.core.model.CourseLabel;
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
	 * @throws
	 */
	public List<CourseLabel> findLabels() throws CourseRuntimeException;
}
