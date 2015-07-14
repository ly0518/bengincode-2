package org.begincode.test;

import java.sql.SQLException;

import org.begincode.code.service.CodeService;
import org.begincode.core.model.BegincodeCode;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCode{

	@Test
	public void test() throws SQLException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext-core.xml","classpath*:applicationContext-code.xml");
		CodeService codeService = (CodeService) ctx.getBean("codeService");
		System.out.println(codeService);
		BegincodeCode record = new BegincodeCode ();
		record.setCodeInfo("3");
		record.setBeginRowNum(13);
		record.setLimitNum(10);
		codeService.selCodeForPaper(record);
		ctx.close();
	}
	
}
