package org.begincode.web.cache.testCase;

import java.util.Random;

import org.begincode.web.cache.context.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

public class CacheTest extends BaseTest {
//	@Autowired
//	private CountOperator countOperator;
	
	
	 @BeforeClass
	 public static void init(){
		  
		 
	 }
	@Test
	public void testPutCache() throws InterruptedException{
//		countOperator.testAsyncMethod();
//		System.out.println("wancheng ");
		Random radom = new Random();
//		for(int i = 0;i<1024;i++){
//			int id = radom.nextInt(42);
//			countOperator.addCodeViewCount(1);
//		}
//		for(int i = 0;i<1024;i++){
//			int id = radom.nextInt(42);
//			countOperator.addBatCodeViewCount(1);
//		}
		 Thread.sleep(80000);
	}
	
}
