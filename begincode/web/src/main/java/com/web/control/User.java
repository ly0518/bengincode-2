package com.web.control;

import org.course.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class User {
	
	@Autowired UserService userService;
	@RequestMapping("/list")
	public void selUser(){
		 System.out.println("dd");
		userService.sel();
	   
	}
	
}
