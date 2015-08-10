package org.begincode.web.control.user;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.begincode.core.model.BegincodeUser;
import org.begincode.user.facade.UserFacade;
import org.begincode.user.service.UserService;
import org.begincode.web.control.cookie.CookieOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
* @ClassName: UserController 
* @Description: 注册用户信息控制器
* @author yangsj 
* @date 2015年8月3日 下午10:53:26 
*  
*/
@Controller
@RequestMapping("/user")
public class UserController {
	
	private Logger logger = Logger.getLogger(UserController.class);

	@Autowired UserFacade userFacade;
	@Autowired UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseBody
	public void findOrCreateUser(HttpServletResponse response,BegincodeUser user) {
		user.setCheckFlag("0");
		user.setUserSourceId(1);
		user.setDeleteFlag("1");
		userFacade.createUser(user);
		CookieOperation.addCookie(response, user);
	}
	
	
}
