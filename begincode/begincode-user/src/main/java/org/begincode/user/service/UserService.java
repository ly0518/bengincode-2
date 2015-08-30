package org.begincode.user.service;

import org.begincode.core.model.BegincodeUser;

/** 
* @ClassName: UserService 
* @Description: 用户信息服务
* @author yangsj 
* @date 2015年8月3日 下午9:42:56 
*  
*/
public interface UserService {
	/** 
	* @Title: createUser 
	* @Description: QQ登陆，注册用户
	* @param user
	* @return Integer   
	* @throws 
	*/
	public Integer createUser(BegincodeUser user); 
	/** 
	* @Title: findUserByToken 
	* @Description: 根据QQ登陆信息验证用户
	* @param accessToken,openId
	* @return BegincodeUser   
	* @throws 
	*/
	public BegincodeUser findUserByTokenIdAndOpenId(String accessToken,String openId);
	
	/** 
	* @Title: findUserById 
	* @Description: 查询用户By Id
	* @param userId
	* @return BegincodeUser   
	* @throws 
	*/
	public BegincodeUser findUserById(Integer userId);
}
