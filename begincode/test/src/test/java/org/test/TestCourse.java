package org.test;

import java.sql.SQLException;

import org.course.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCourse {
	
	private ClassPathXmlApplicationContext ctx;
	
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext_core.xml","classpath*:applicationContext_course.xml");
	}

	@Test
	public void test() throws SQLException {
		UserService userService = (UserService) ctx.getBean("userService");
		userService.sel();
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println(1);
		ctx.close();
	}
}
