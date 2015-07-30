/**   
 * @Title: CourseLabelServiceImpl.java 
 * @Package org.begincode.course.service.impl 
 * @Description: TODO 
 * @author liutao   
 * @date 2015年7月30日 上午10:36:53 
 * @version V1.0   
 */
package org.begincode.course.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.begincode.core.mapper.CourseLabelMapper;
import org.begincode.core.model.CourseLabel;
import org.begincode.course.contant.Constants;
import org.begincode.course.exception.CourseRuntimeException;
import org.begincode.course.service.CourseLabelService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: CourseLabelServiceImpl
 * @Description: 课程标签service
 * @author liutao
 * @date 2015年7月30日 上午10:36:53
 * 
 */
@Service("courseLabelService")
public class CourseLabelServiceImpl implements CourseLabelService {

	@Resource
	private CourseLabelMapper courseLabelMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.begincode.course.service.CourseLabelService#create(org.begincode.
	 * core.model.CourseLabel)
	 */
	@Override
	public int create(CourseLabel courseLabel) throws CourseRuntimeException {
		if (null == courseLabel)
			throw new CourseRuntimeException(CourseRuntimeException.COS0002, "参数不能为空");
		courseLabelMapper.insert(courseLabel);
		return courseLabel.getCourseLabelId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.begincode.course.service.CourseLabelService#findAll()
	 */
	@Override
	public List<CourseLabel> findAll() {
		return courseLabelMapper.selectAll(Constants.DELETE_FLAG_NOMAL);
	}

}
