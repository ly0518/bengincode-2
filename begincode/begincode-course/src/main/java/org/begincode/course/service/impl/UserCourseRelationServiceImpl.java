/**   
 * @Title: UserCourseRelationService.java 
 * @Package org.begincode.course.service.impl 
 * @Description: 用户关注课程关系表service 
 * @author liutao   
 * @date 2015年7月31日 下午9:12:50 
 * @version V1.0   
 */
package org.begincode.course.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.begincode.core.mapper.UserCourseRelationMapper;
import org.begincode.core.model.UserCourseRelation;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.course.exception.CourseRuntimeException;
import org.begincode.course.service.UserCourseRelationService;

/**
 * @ClassName: UserCourseRelationService
 * @Description: 用户关注课程关系表service
 * @author liutao
 * @date 2015年7月31日 下午9:12:50
 * 
 */
public class UserCourseRelationServiceImpl implements UserCourseRelationService {

	private static Logger logger = Logger.getLogger(UserCourseRelationServiceImpl.class);

	@Resource
	private UserCourseRelationMapper userCourseRelationMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.begincode.course.service.UserCourseRelationService#createUserCourse
	 * (org.begincode.core.model.UserCourseRelation)
	 */
	@Override
	public int create(UserCourseRelation userCourseRelation) {
		if (null == userCourseRelation) {
			logger.error("method:createUserCourseRelation,message:参数为空");
			throw new CourseRuntimeException(CourseRuntimeException.COS0002, "参数不能为空");
		}
		userCourseRelationMapper.insert(userCourseRelation);
		return userCourseRelation.getBegincodeCourseId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.begincode.course.service.UserCourseRelationService#findAllWithPage
	 * (org.begincode.core.paginator.domain.Paginator,
	 * org.begincode.core.model.UserCourseRelation)
	 */
	@Override
	public PageList<UserCourseRelation> findAllWithPage(Paginator paginator, UserCourseRelation userCourseRelation) {
		// TODO Auto-generated method stub
		return null;
	}

}
