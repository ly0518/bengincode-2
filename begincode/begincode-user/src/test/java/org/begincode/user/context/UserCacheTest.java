package org.begincode.user.context;

import org.begincode.user.facade.UserFacade;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserCacheTest extends BaseTest {
	@Autowired
	private UserFacade userFacade;
 @Test
 public void test(){
	System.out.println(userFacade.findUser("123", "yangsj"));
 }
}
