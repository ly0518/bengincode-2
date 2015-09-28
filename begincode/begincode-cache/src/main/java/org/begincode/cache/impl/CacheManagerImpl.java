package org.begincode.cache.impl;

import java.io.File;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

import org.begincode.cache.CacheManagerInterface;
import org.begincode.core.model.BegincodeUser;
import org.springframework.stereotype.Service;

/** 
* @ClassName: CacheManagerImpl 
* @Description: 
* @author yangsj 
* @date 2015年8月6日 下午9:59:04 
*  
*/
@Service
public class CacheManagerImpl implements CacheManagerInterface {
	Cache userCache;
	/**
	 * cache初始化
	 */
	public CacheManagerImpl(){
		CacheManager cacheManager = CacheManager.create(this.getClass().getResourceAsStream("/ehcache.xml"));
		userCache = cacheManager.getCache("userCache");
	}
	
	/** (非 Javadoc) 
	 * <p>Title: findUserByCache</p> 
	 * <p>Description: </p> 
	 * @param accessToken
	 * @return  
	 * @see org.begincode.cache.CacheManagerInterface#findUserByCache(java.lang.String) 
	 */
	@Override
	public BegincodeUser findUserByCache(String openId) {
		Element element = userCache.get(openId);
		if(element != null){
			return (BegincodeUser)element.getObjectValue();
		}else{
			return null;
		}
	}

	/** (非 Javadoc) 
	 * <p>Title: addUserToCache</p> 
	 * <p>Description: </p> 
	 * @param user  
	 * @see org.begincode.cache.CacheManagerInterface#addUserToCache(org.begincode.core.model.BegincodeUser) 
	 */
	@Override
	public void addUserToCache(BegincodeUser user) {
		Element element = new Element(user.getOpenId(), user);
		userCache.put(element);
	}

}
