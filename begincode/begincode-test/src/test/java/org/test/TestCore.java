package org.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCore {

	@Test
	public void test() throws SQLException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext-core.xml");
		DataSource ds = (DataSource) ctx.getBean("dataSource");
		System.out.println(ds.getConnection().getMetaData().getDatabaseMinorVersion());
		ctx.close();
	}

}
