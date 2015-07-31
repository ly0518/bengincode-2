/**   
 * @Title: CourseFacadeImpl.java 
 * @Package org.begincode.course.facade.impl 
 * @Description: 课程门面实现类 
 * @author liutao   
 * @date 2015年7月30日 下午6:40:50 
 * @version V1.0   
 */
package org.begincode.course.facade.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.begincode.core.model.BegincodeCourse;
import org.begincode.core.model.CourseLabel;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.course.exception.CourseRuntimeException;
import org.begincode.course.facade.CourseFacade;
import org.begincode.course.service.BegincodeCourseService;
import org.begincode.course.service.CourseLabelService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: CourseFacadeImpl
 * @Description: 课程门面实现类
 * @author liutao
 * @date 2015年7月30日 下午6:40:50
 * 
 */
@Service
public class CourseFacadeImpl implements CourseFacade {

	private static Logger logger = Logger.getLogger(CourseFacadeImpl.class);

	@Resource
	private CourseLabelService courseLabelService;
	@Resource
	private BegincodeCourseService begincodeCourseService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.begincode.course.facade.CourseFacade#findCourseLabel()
	 */
	@Override
	public List<CourseLabel> findLabels() throws CourseRuntimeException {
		try {
			return courseLabelService.findAll();
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new CourseRuntimeException(CourseRuntimeException.COS0001, e.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.begincode.course.facade.CourseFacade#createLabel()
	 */
	@Override
	public int createLabel(CourseLabel courseLabel) throws CourseRuntimeException {
		try {
			return courseLabelService.create(courseLabel);
		} catch (CourseRuntimeException ce) {
			throw ce;
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new CourseRuntimeException(CourseRuntimeException.COS0001, e.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.begincode.course.facade.CourseFacade#createCourse(org.begincode.core
	 * .model.BegincodeCourse)
	 */
	@Override
	public int createCourse(BegincodeCourse course) throws CourseRuntimeException {
		try {
			return begincodeCourseService.create(course);
		} catch (CourseRuntimeException ce) {
			throw ce;
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new CourseRuntimeException(CourseRuntimeException.COS0001, e.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.begincode.course.facade.CourseFacade#findeCourseWithPage(org.begincode
	 * .core.paginator.domain.Paginator,
	 * org.begincode.core.model.BegincodeCourse)
	 */
	@Override
	public PageList<BegincodeCourse> findeCourseWithPage(Paginator paginator, BegincodeCourse begincodeCourse) throws CourseRuntimeException {
		try {
			return begincodeCourseService.findAllWithPage(paginator, begincodeCourse);
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new CourseRuntimeException(CourseRuntimeException.COS0001, e.getMessage());
		}
	}
}
