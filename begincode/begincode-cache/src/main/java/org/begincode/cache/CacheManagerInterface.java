package org.begincode.cache;

import org.begincode.core.model.BegincodeUser;

/** 
* @ClassName: CacheManager 
* @Description: 缓存管理
* @author yangsj 
* @date 2015年8月6日 下午9:44:19 
*  
*/
public interface CacheManagerInterface {

	/** 
	* @Title: findUserByCache 
	* @Description: 根据accessToken获取用户
	* @param token
	* @return BegincodeUser   
	* @throws 
	*/
	public BegincodeUser findUserByCache(String accessToken);
	
	/** 
	* @Title: addUserToCache 
	* @Description: 缓存添加用户
	* @param user void   
	* @throws 
	*/
	public void addUserToCache(BegincodeUser user);
}
