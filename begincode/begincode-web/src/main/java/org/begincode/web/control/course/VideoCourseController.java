/**   
 * @Title: VideoCourseController.java 
 * @Package org.begincode.web.course 
 * @Description: 视频教程控制器 
 * @author liutao   
 * @date 2015年7月29日 下午9:03:31 
 * @version V1.0   
 */
package org.begincode.web.control.course;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.begincode.core.constant.BeginCodeConstant;
import org.begincode.core.model.BegincodeCourse;
import org.begincode.core.model.UserCourseRelation;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.course.facade.CourseFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: VideoCourseController
 * @Description: 视频教程控制器
 * @author liutao
 * @date 2015年7月29日 下午9:03:31
 * 
 */
@Controller
@RequestMapping(value = "/video")
public class VideoCourseController {

	private static Logger logger = Logger.getLogger(VideoCourseController.class);

	@Resource
	private CourseFacade courseFacade;

	@RequestMapping("")
	public String toVideo(Model model) {
		model.addAttribute("labels", courseFacade.findLabels());
		return "/page/course/course_list";
	}

	@RequestMapping(value = "attention/{userId}/{page}/{limit}/list", method = RequestMethod.GET)
	@ResponseBody
	public Map queryCourseByUser(@PathVariable("userId") Integer userId, @PathVariable("page") Integer page, @PathVariable("limit") Integer limit) {
		if (null == userId || null == page || null == limit) {
			logger.error("method:queryCourseByUser,errorMsg:查询参数为空,userId:" + userId + ",page:" + page + ",limit:" + limit);
			return null;
		}
		Paginator paginator = new Paginator(page, limit);
		UserCourseRelation userCourseRelation = new UserCourseRelation(null, userId, null, BeginCodeConstant.DELETE_FLAG_NOMAL, null);
		PageList<Map<String, Object>> listMap = courseFacade.findAttentionCourseByUserWithPage(paginator, userCourseRelation);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("pageInfo", listMap.getPaginator());
		resultMap.put("result", listMap);
		return resultMap;
	}

	@RequestMapping(value = "course/{labelId}/{page}/{limit}/list", method = RequestMethod.GET)
	@ResponseBody
	public Map queryCourseByLabel(@PathVariable("labelId") Integer labelId, @PathVariable("page") Integer page, @PathVariable("limit") Integer limit) {
		if (null == labelId || null == page || null == limit) {
			logger.error("method:queryCourseByLabel,errorMsg:查询参数为空,labelId:" + labelId + ",page:" + page + ",limit:" + limit);
			return null;
		}
		// 分页参数
		Paginator paginator = new Paginator(page, limit);
		// 查询参数
		BegincodeCourse begincodeCourse = new BegincodeCourse();
		begincodeCourse.setCourseLabelId(labelId);
		begincodeCourse.setDeleteFlag(BeginCodeConstant.DELETE_FLAG_NOMAL);
		PageList<BegincodeCourse> courseList = courseFacade.findCourseWithPage(paginator, begincodeCourse);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("pageInfo", courseList.getPaginator());
		resultMap.put("result", courseList);
		return resultMap;
	}
}
