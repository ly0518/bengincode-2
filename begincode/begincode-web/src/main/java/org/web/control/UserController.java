package org.web.control;


import org.apache.log4j.Logger;
import org.core.exception.BeginCodeException;
import org.course.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired UserService userService;
	@RequestMapping("/list")
	public void selUser(){
		int i = 23/0;
		logger.debug("测试Controller");
		userService.sel();
	}
	
	@RequestMapping("/list1")
	public void testException(){
		throw new BeginCodeException("业务异常！");
	}
}
