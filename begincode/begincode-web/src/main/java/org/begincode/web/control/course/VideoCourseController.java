/**   
 * @Title: VideoCourseController.java 
 * @Package org.begincode.web.course 
 * @Description: 视频教程控制器 
 * @author liutao   
 * @date 2015年7月29日 下午9:03:31 
 * @version V1.0   
 */
package org.begincode.web.control.course;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.begincode.course.facade.CourseFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
