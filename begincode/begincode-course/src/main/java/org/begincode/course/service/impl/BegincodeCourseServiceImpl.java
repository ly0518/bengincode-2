/**   
 * @Title: BegincodeCourseServiceImpl.java 
 * @Package org.begincode.course.service.impl 
 * @Description: 课程service实现类 
 * @author liutao   
 * @date 2015年7月30日 下午10:57:14 
 * @version V1.0   
 */
package org.begincode.course.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.begincode.core.mapper.BegincodeCourseMapper;
import org.begincode.core.model.BegincodeCourse;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.course.exception.CourseRuntimeException;
import org.begincode.course.service.BegincodeCourseService;
import org.begincode.course.utils.CourseUtils;
import org.springframework.stereotype.Service;

/**
 * @ClassName: BegincodeCourseServiceImpl
 * @Description: 课程service实现类
 * @author liutao
 * @date 2015年7月30日 下午10:57:14
 * 
 */
@Service
public class BegincodeCourseServiceImpl implements BegincodeCourseService {

	private static Logger logger = Logger.getLogger(BegincodeCourseServiceImpl.class);

	@Resource
	private BegincodeCourseMapper begincodeCourseMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.begincode.course.service.BegincodeCourseService#create(org.begincode
	 * .core.model.BegincodeCourse)
	 */
	@Override
	public int create(BegincodeCourse course) throws CourseRuntimeException {
		if (null == course) {
			logger.error("method:createBegincodeCourse,message:参数为空");
			throw new CourseRuntimeException(CourseRuntimeException.COS0002, "参数不能为空");
		}
		begincodeCourseMapper.insert(course);
		return course.getBegincodeCourseId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.begincode.course.service.BegincodeCourseService#findAllWithPage()
	 */
	@Override
	public PageList<BegincodeCourse> findAllWithPage(Paginator paginator, BegincodeCourse begincodeCourse) {
		CourseUtils.setPaginator(paginator);
		return begincodeCourseMapper.selectAllBy(begincodeCourse);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.begincode.course.service.BegincodeCourseService#findById(int)
	 */
	@Override
	public BegincodeCourse findById(int begincodeCourseId) {
		return begincodeCourseMapper.selectById(begincodeCourseId);
	}

}
