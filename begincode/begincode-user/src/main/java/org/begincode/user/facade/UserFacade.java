package org.begincode.user.facade;

import org.begincode.core.model.BegincodeUser;

/** 
* @ClassName: UserFacade 
* @Description: 用户服务封装
* @author yangsj 
* @date 2015年8月3日 下午10:41:07 
*  
*/
public interface UserFacade {
	/** 
	* @Title: createUser 
	* @Description: 创建用户，先检查用户是否存在，如果存在则直接返回，如不存在，新增用户再返回
	* @param user
	* @return BegincodeUser   
	* @throws 
	*/
	public BegincodeUser createUser(BegincodeUser user);
	
	/** 
	* @Title: findUser 
	* @Description: 根据token查询用户信息，
	* 	1、查询cache，
	* 	2、cache不命中查询数据库
	* @param accessToken
	* @return BegincodeUser   
	* @throws 
	*/
	public BegincodeUser findUser(String openId,String accessToken);
}
