package org.begincode.code.testCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.begincode.code.context.BaseTest;
import org.begincode.code.service.CodeService;
import org.begincode.core.model.BegincodeCode;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CacheTest extends BaseTest {
	@Autowired
	private CodeService codeService;
	public static List<BegincodeCode> list = new ArrayList<BegincodeCode>();
	
	 @BeforeClass
	 public static void init(){
		 Random radom = new Random();
				
		  for(int i = 0 ;i<1024;i++){
			  BegincodeCode co = new BegincodeCode();
			  int id = radom.nextInt(42);
			  co.setbegincodeCodeId(id);
			  co.setViewCount(1);
			  list.add(co);
		  }
		 
	 }
	@Test
	public void testPutCache() throws InterruptedException{
		System.out.println(list.size());
		Long star =System.currentTimeMillis();
		for(BegincodeCode cc : list){
			codeService.updateAddCountById(cc);
		}
		System.out.println("用时1："+(System.currentTimeMillis()-star));
		
		Long star2 =System.currentTimeMillis();
		codeService.batchUpdateAddCountById(list);
		System.out.println("用时2："+(System.currentTimeMillis()-star2));
		
		
	}
	
}
