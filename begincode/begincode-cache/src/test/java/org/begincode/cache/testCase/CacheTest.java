package org.begincode.cache.testCase;

import javax.annotation.Resource;

import org.begincode.cache.CacheManagerInterface;
import org.begincode.cache.context.BaseTest;
import org.begincode.core.model.BegincodeUser;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CacheTest extends BaseTest {
	@Autowired
	private CacheManagerInterface cacheManagerInterface;
	
	private static BegincodeUser user;
	
	 @BeforeClass
	 public static void init(){
		 user = new BegincodeUser();
		 user.setAccessToken("yangsj");
		 user.setPic("sjkdjskjfs");
		 user.setNickname("杨晓阳");
		 
	 }
	@Test
	public void testPutCache(){
		cacheManagerInterface.addUserToCache(user);
		BegincodeUser t = cacheManagerInterface.findUserByCache("yangsj");
		System.out.println(t.toString());
	}
	
}
