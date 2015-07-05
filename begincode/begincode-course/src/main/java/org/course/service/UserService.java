package org.course.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private Logger logger = Logger.getLogger(UserService.class);
	
	public void sel(){
		logger.debug("插入成功数");
	}
}
