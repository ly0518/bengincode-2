package org.begincode.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTask {

	@Test
	public void test() throws   InterruptedException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext*.xml");
//		CountOperator co = (CountOperator) ctx.getBean("CountOperator");
//		for(int i = 0 ;i<10;i++){
//			co.addCodeViewCount(1);
//		}
		Thread.sleep(10000);
	}
}
