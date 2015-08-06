
/**   
* @Title: UserFacadeImpl.java 
* @Package org.begincode.user.facade.impl 
* @Description: 
* @author yangsj   
* @date 2015年8月3日 下午10:43:01 
* @version V1.0   
*/
package org.begincode.user.facade.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.begincode.cache.CacheManagerInterface;
import org.begincode.core.model.BegincodeUser;
import org.begincode.user.facade.UserFacade;
import org.begincode.user.service.UserService;
import org.springframework.stereotype.Service;

/** 
 * @ClassName: UserFacadeImpl 
 * @Description: 用户服务封装实现
 * @author yangsj 
 * @date 2015年8月3日 下午10:43:01 
 *  
 */
@Service(value="userFacade")
public class UserFacadeImpl implements UserFacade {
	
	private Logger logger = Logger.getLogger(UserFacadeImpl.class);

	@Resource	UserService userService;
	@Resource CacheManagerInterface cacheManagerInterface;
	/** (非 Javadoc) 
	 * <p>Title: createUser</p> 
	 * <p>Description: </p> 
	 * @param user
	 * @return  
	 * @see org.begincode.user.facade.UserFacade#createUser(org.begincode.core.model.BegincodeUser) 
	 */
	@Override
	public BegincodeUser createUser(BegincodeUser user) {
		if (user == null) {
			logger.error("注册用户，参数不能为 null");
			throw new IllegalArgumentException("注册用户，参数不能为 null");
		}
		BegincodeUser tempUser = userService.findUserByTokenIdAndOpenId(user.getAccessToken(), user.getOpenId());
		if(tempUser != null){
			//添加缓存
			cacheManagerInterface.addUserToCache(tempUser);
			return tempUser;
		}else{
			user.setLoginName("");
			user.setPwd("");
			user.setCdate(new Date());
			user.setGag("1");
			userService.createUser(user);
			//添加缓存
			cacheManagerInterface.addUserToCache(user);
			return user;
		}
	}
	@Override
	public BegincodeUser findUser(String openId,String accessToken) {
		BegincodeUser begincodeUser =  cacheManagerInterface.findUserByCache(accessToken);
		if(begincodeUser != null){
			return begincodeUser;
		}else{
			return userService.findUserByTokenIdAndOpenId(accessToken, openId);
		}
	}

}
