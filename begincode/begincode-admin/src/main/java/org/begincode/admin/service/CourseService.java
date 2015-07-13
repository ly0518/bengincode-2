package org.begincode.admin.service;

import java.util.List;

import org.begincode.core.model.BegincodeCourse;

public interface CourseService {

	public int createCourse(BegincodeCourse course);

	public int deleteCourse(BegincodeCourse course);

	public int forzenCourse(BegincodeCourse course);

	public int updateCourse(BegincodeCourse course);

	public BegincodeCourse selectCourseById(int courseId);

	public List<BegincodeCourse> selectCourses(BegincodeCourse course);
	
}
