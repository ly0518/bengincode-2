package org.begincode.admin.control;


import org.apache.log4j.Logger;
import org.begincode.exception.BeginCodeException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private Logger logger = Logger.getLogger(UserController.class);
	
	@RequestMapping("/list")
	public void selUser(){
		int i = 23/0;
		logger.debug("测试Controller");
	}
	
	@RequestMapping("/list1")
	public void testException(){
		throw new BeginCodeException("业务异常！");
	}
}
