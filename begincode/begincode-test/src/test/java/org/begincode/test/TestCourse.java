package org.begincode.test;

import java.sql.SQLException;

import org.begincode.course.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCourse {

	@Test
	public void test() throws SQLException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext-core.xml","classpath*:applicationContext-course.xml");
		UserService userService = (UserService) ctx.getBean("userService");
		userService.sel();
		ctx.close();
	}
	
}
