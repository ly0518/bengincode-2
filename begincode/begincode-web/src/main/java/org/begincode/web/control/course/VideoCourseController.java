/**   
 * @Title: VideoCourseController.java 
 * @Package org.begincode.web.course 
 * @Description: 视频教程控制器 
 * @author liutao   
 * @date 2015年7月29日 下午9:03:31 
 * @version V1.0   
 */
package org.begincode.web.control.course;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.begincode.core.contant.Contants;
import org.begincode.core.model.BegincodeCourse;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.course.facade.CourseFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@RequestMapping("{labelId}/{page}/{limit}/list")
	@ResponseBody
	public List queryCourseByLabel(@PathVariable("labelId") Integer labelId, @PathVariable("page") Integer page, @PathVariable("limit") Integer limit) {
		if (null == labelId || null == page || null == limit) {
			logger.error("method:queryCourseByLabel,info:查询课程参数为空,labelId:" + labelId + ",page:" + page + ",limit:" + limit);
			return null;
		}
		// 分页参数
		Paginator paginator = new Paginator(page, limit);
		// 查询参数
		BegincodeCourse begincodeCourse = new BegincodeCourse();
		begincodeCourse.setCourseLabelId(labelId);
		begincodeCourse.setDeleteFlag(Contants.DELETE_FLAG_NOMAL);
		return courseFacade.findeCourseWithPage(paginator, begincodeCourse);
	}
}
