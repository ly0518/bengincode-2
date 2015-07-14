package org.begincode.test;

import java.sql.SQLException;
import java.util.Date;

import org.apache.log4j.Logger;
import org.begincode.admin.service.UserService;
import org.begincode.core.model.BegincodeUser;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdminUser {

	private Logger logger = Logger.getLogger(TestAdminUser.class);
	private static ClassPathXmlApplicationContext ctx;
	private static UserService userService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext-core.xml","classpath*:applicationContext-admin.xml");
		userService = (UserService) ctx.getBean("userService");
	}
    
	@Test
	public void testCreateUser() throws SQLException {
		BegincodeUser user = new BegincodeUser();
		user.setLoginName("houjinxin");
		user.setEmail("woshihoujinxin@163.com");
		user.setNickname("芝麻古");
		user.setPwd("houjinxin");
		user.setCdate(new Date());
		user.setGag("1");
		user.setDeleteFlag("1");
		userService.createUser(user);
		
	}
	
	@Test
	public void testSelectUserById() throws SQLException {
		BegincodeUser user = userService.selectUserById(1);
		logger.info(user);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		ctx.close();
	}


}
