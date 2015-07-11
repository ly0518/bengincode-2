package org.test;

import java.sql.SQLException;

import org.begincode.code.CodeService;
import org.core.model.BegincodeCode;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCode{

	@Test
	public void test() throws SQLException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext*.xml");
		CodeService codeService = (CodeService) ctx.getBean("codeService");
		System.out.println(codeService);
		BegincodeCode record = new BegincodeCode ();
		record.setCodeInfo("1");
		record.setBeginRowNum(0);
		record.setLimitNum(10);
		codeService.selCodeForPaper(record);
		codeService.selCodeCount(record);
		ctx.close();
	}
	
}
