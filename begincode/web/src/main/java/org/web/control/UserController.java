package org.web.control;

import org.course.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired UserService userService;
	@RequestMapping("/list")
	public void selUser(){
		System.out.println(11);
		userService.sel();
	}
	
}