package org.test;

import java.sql.SQLException;

import org.course.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCourse {

	@Test
	public void test() throws SQLException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext_core.xml","classpath*:applicationContext_course.xml");
		UserService userService = (UserService) ctx.getBean("userService");
		userService.sel();
		ctx.close();
	}
	
}
