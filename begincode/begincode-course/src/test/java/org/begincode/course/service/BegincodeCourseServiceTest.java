/**   
 * @Title: BegincodeCourseServiceTest.java 
 * @Package org.begincode.course.service 
 * @Description: TODO 
 * @author liutao   
 * @date 2015年7月30日 下午11:04:55 
 * @version V1.0   
 */
package org.begincode.course.service;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.begincode.core.model.BegincodeCourse;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.course.contant.Constants;
import org.begincode.course.context.BaseTest;
import org.junit.Test;

/**
 * @ClassName: BegincodeCourseServiceTest
 * @Description: TODO
 * @author liutao
 * @date 2015年7月30日 下午11:04:55
 * 
 */
public class BegincodeCourseServiceTest extends BaseTest {

	private static Logger logger = Logger.getLogger(BegincodeCourseServiceTest.class);

	@Resource
	private BegincodeCourseService begincodeCourseService;

	@Test
	public void testCreate() {
		BegincodeCourse begincodeCourse = new BegincodeCourse(null, "java 课程第一节", "http://img.mukewang.com/558ba3980001db0e06000338-240-135.jpg", "jianjie",
				"1", 5, 234, 1, 1, "大牛", "1", 1, Constants.DELETE_FLAG_NOMAL, "video", new Date());
		begincodeCourseService.create(begincodeCourse);
		logger.info(begincodeCourse.getBegincodeCourseId());
	}

	@Test
	public void testFindAllWithPage() {
		Paginator paginator = new org.begincode.core.paginator.domain.Paginator(0, 4);
		paginator.setOrderStr(" order by create_time");
		BegincodeCourse begincodeCourse = new BegincodeCourse();
		begincodeCourse.setCourseLabelId(5);
		PageList<BegincodeCourse> list = begincodeCourseService.findAllWithPage(paginator, begincodeCourse);
		logger.info("result:" + list.size());
	}
}
