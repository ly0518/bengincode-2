/**   
 * @Title: UserCourseRelationServiceTest.java 
 * @Package org.begincode.course.service 
 * @Description: TODO 
 * @author liutao   
 * @date 2015年8月1日 上午10:49:42 
 * @version V1.0   
 */
package org.begincode.course.service;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.begincode.core.constant.BeginCodeConstant;
import org.begincode.core.model.UserCourseRelation;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.course.context.BaseTest;
import org.junit.Test;

/**
 * @ClassName: UserCourseRelationServiceTest
 * @Description: TODO
 * @author liutao
 * @date 2015年8月1日 上午10:49:42
 * 
 */
public class UserCourseRelationServiceTest extends BaseTest {

	private static Logger logger = Logger.getLogger(UserCourseRelationServiceTest.class);

	@Resource
	private UserCourseRelationService userCourseRelationService;

	@Test
	public void testFindAllWithPage() {
		Paginator paginator = new org.begincode.core.paginator.domain.Paginator(0, 4);
		paginator.setOrderStr(" order by create_time");
		UserCourseRelation userCourseRelation = new UserCourseRelation(null, 1, null, BeginCodeConstant.DELETE_FLAG_NOMAL, null);
		PageList<Map<String, Object>> list = userCourseRelationService.findAllWithPage(paginator, userCourseRelation);
		logger.info("result:" + list.size());
	}
}
