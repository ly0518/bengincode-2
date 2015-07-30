/**   
 * @Title: VideoCourseController.java 
 * @Package org.begincode.web.course 
 * @Description: 视频教程控制器 
 * @author liutao   
 * @date 2015年7月29日 下午9:03:31 
 * @version V1.0   
 */
package org.begincode.web.control.course;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
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

	private static Logger logger = Logger
			.getLogger(VideoCourseController.class);

	@RequestMapping("")
	public String toVideo() {
		logger.info("sfsdfsdfsdfds");
		return "/page/course/course_list";
	}

}
