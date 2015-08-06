/**   
 * @Title: BaseTest.java 
 * @Package org.course.context 
 * @Description: TODO 
 * @author liutao   
 * @date 2015年7月30日 上午10:07:02 
 * @version V1.0   
 */
package org.begincode.cache.context;

import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * @ClassName: BaseTest
 * @Description: 测试类的父类，自动加载spring配置文件且运行于事务之下，测试完毕之后不回滚
 * @author liutao
 * @date 2015年7月30日 上午10:07:02
 */
// @RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations = { "classpath:applicationContext-cache.xml",
// "classpath:applicationContext-core.xml" })
// @TransactionConfiguration(defaultRollback = false)
@ContextConfiguration(locations = { "classpath:applicationContext-cache.xml",
		"classpath:applicationContext-core.xml" })
public class BaseTest extends AbstractJUnit4SpringContextTests {
	public <T> T getBean(Class<T> type) {
		return applicationContext.getBean(type);
	}

	public Object getBean(String beanName) {
		return applicationContext.getBean(beanName);
	}

	protected ApplicationContext getContext() {
		return applicationContext;
	}
}
