package org.test;

import java.sql.SQLException;
import java.util.Date;

import javax.sql.DataSource;

import org.core.cache.CountCache;
import org.core.cache.CountThread;
import org.core.mapper.BegincodeCodeMapper;
import org.core.model.BegincodeCode;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCore {

	@Test
	public void test() throws SQLException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext-core.xml");
		DataSource ds = (DataSource) ctx.getBean("dataSource");
		System.out.println(ds.getConnection().getMetaData().getDatabaseMinorVersion());
		BegincodeCodeMapper mapper = ctx.getBean("begincodeCodeMapper",BegincodeCodeMapper.class);
		BegincodeCode record = new BegincodeCode();
		record.setCodeInfo("string");
		record.setCodeContent("String");
		record.setProhibitionMessage("1");
		record.setViewCount(10);
		record.setGoodCount(10);
		record.setBadCount(10);
		record.setReleaseState("1");
		record.setCheckFlag("1");
		record.setCreateDatetime(new Date());
		
		mapper.insert(record);
		
		ctx.close();
		
		//======================点赞，差评，浏览次数 使用类似方法
		new CountThread(CountCache.CODE_GOOD,2).start();				//加1方法
		System.out.println("@@"+CountCache.getAndResetCodeGood(2));		//获取并重置
		//======================点赞，差评，浏览次数 使用类似方法 结束
	}

}
