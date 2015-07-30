package org.begincode.course.service;

import java.util.List;

import org.begincode.core.model.CourseLabel;

/**
 * @ClassName: CourseLabelService
 * @Description: 课程标签service接口
 * @author liutao
 * @date 2015年7月30日 上午10:29:04
 *
 */
public interface CourseLabelService {
	/**
	 * @Description: 创建课程标签
	 * @param courseLabel
	 * @return 主键id
	 * @throws
	 */
	public int create(CourseLabel courseLabel);

	/**
	 * @Description: 查询所有的课程标签 按照课程数目倒序排序
	 * @return
	 * @throws
	 */
	public List<CourseLabel> findAll();
}
