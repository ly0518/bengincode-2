package org.begincode.admin.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.begincode.admin.service.CourseService;
import org.begincode.core.mapper.BegincodeCourseMapper;
import org.begincode.core.model.BegincodeCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("courseService")
public class CourseServiceImpl implements CourseService {
	
	private Logger logger = Logger.getLogger(CourseServiceImpl.class);
	
	@Autowired
	BegincodeCourseMapper courseMapper;

	@Override
	public int createCourse(BegincodeCourse course) {
		logger.info("创建课程：" + course);
		return courseMapper.insert(course);
	}

	@Override
	public int deleteCourse(BegincodeCourse course) {
		course.setDeleteFlag("0");
		return courseMapper.updateById(course);
	}

	@Override
	public int forzenCourse(BegincodeCourse course) {
		course.setDeleteFlag("0");
		return courseMapper.updateById(course);
	}

	@Override
	public int updateCourse(BegincodeCourse course) {
		return courseMapper.updateById(course);
	}

	@Override
	public BegincodeCourse selectCourseById(int courseId) {
		return courseMapper.selectById(courseId);
	}

	@Override
	public List<BegincodeCourse> selectCourses(BegincodeCourse course) {
		// TODO Auto-generated method stub
		return null;
	}
}
