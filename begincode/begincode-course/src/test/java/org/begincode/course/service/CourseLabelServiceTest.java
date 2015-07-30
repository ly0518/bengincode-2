/**   
 * @Title: CourseLabelServiceTest.java 
 * @Package org.begincode.course.service 
 * @Description: TODO 
 * @author liutao   
 * @date 2015年7月30日 上午10:41:40 
 * @version V1.0   
 */
package org.begincode.course.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.begincode.core.model.CourseLabel;
import org.begincode.course.contant.Constants;
import org.begincode.course.context.BaseTest;
import org.junit.Test;

/**
 * @ClassName: CourseLabelServiceTest
 * @Description: 课程标签service测试类
 * @author liutao
 * @date 2015年7月30日 上午10:41:40
 * 
 */
public class CourseLabelServiceTest extends BaseTest {

	private static Logger logger = Logger.getLogger(CourseLabelServiceTest.class);

	@Resource
	private CourseLabelService courseLabelService;

	@Test
	public void testCreate() {
		CourseLabel courseLabel = new CourseLabel(null, "JAVA 基础课程", Constants.DELETE_FLAG_NOMAL, 0);
		logger.info("CourseLabelServiceTest method:create, id:{" + courseLabelService.create(courseLabel) + "}, bean{" + courseLabel + "}");
	}
}
