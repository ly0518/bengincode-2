package org.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.core.cache.CountCache;
import org.core.cache.CountThread;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCore {

	@Test
	public void test() throws SQLException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext-core.xml");
		DataSource ds = (DataSource) ctx.getBean("dataSource");
		System.out.println(ds.getConnection().getMetaData().getDatabaseMinorVersion());
		ctx.close();
		
		
		//======================点赞，差评，浏览次数 使用类似方法
		new CountThread(CountCache.CODE_GOOD,2).start();				//加1方法
		System.out.println("@@"+CountCache.getAndResetCodeGood(2));		//获取并重置
		//======================点赞，差评，浏览次数 使用类似方法 结束
		
		
	}

}
