/**   
 * @Title: UserServiceImpl.java 
 * @Package org.begincode.user.service.impl 
 * @Description: 
 * @author yangsj   
 * @date 2015年8月3日 下午9:48:28 
 * @version V1.0   
 */
package org.begincode.user.service.impl;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.begincode.core.mapper.BegincodeUserMapper;
import org.begincode.core.model.BegincodeUser;
import org.begincode.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Description: 用户服务实现
 * @author yangsj
 * @date 2015年8月3日 下午9:48:28
 * 
 */
@Service
public class UserServiceImpl implements UserService {

	private Logger logger = Logger.getLogger(UserServiceImpl.class);

	@Resource
	BegincodeUserMapper begincodeUserMapper;

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: createUser
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param user
	 * @return
	 * @see org.begincode.user.service.UserService#createUser(org.begincode.core.model.BegincodeUser)
	 */
	@Override
	public Integer createUser(BegincodeUser user) {
			begincodeUserMapper.insertSelective(user);
			if(user != null){
				System.out.println(user.toString());
				return null;
			}else{
				return user.getBegincodeUserId();
			}
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: findUserByToken
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param tokenId
	 * @return
	 * @see org.begincode.user.service.UserService#findUserByToken(java.lang.String)
	 */
	@Override
	public BegincodeUser findUserByTokenIdAndOpenId(String accessToken,String openId) {
		if(StringUtils.isNotEmpty(accessToken) && StringUtils.isNotEmpty(openId)){
			BegincodeUser begincodeUser = new BegincodeUser();
			begincodeUser.setOpenId(openId);
			begincodeUser.setAccessToken(accessToken);
			begincodeUser = begincodeUserMapper.selectByTokenIdAndOpenId(begincodeUser);
			if(begincodeUser != null){
				return begincodeUser;
			}else{
				return null;
			}
		}else{
			logger.error(" accessToken ,openId  不能为空 ");
			throw new IllegalArgumentException("accessToken,openId 不能为空 ");

		}

	}
	@Override
	public BegincodeUser findUserByOpenId(String openId) {
		if(StringUtils.isNotEmpty(openId)){
			BegincodeUser begincodeUser = new BegincodeUser();
			begincodeUser.setOpenId(openId);
			begincodeUser = begincodeUserMapper.selectByTokenIdAndOpenId(begincodeUser);
			if(begincodeUser != null){
				return begincodeUser;
			}else{
				return null;
			}
		}else{
			logger.error(" accessToken ,openId  不能为空 ");
			throw new IllegalArgumentException("accessToken,openId 不能为空 ");

		}

	}
	@Override
	public BegincodeUser findUserById(Integer userId) {
		return begincodeUserMapper.selectByPrimaryKey(userId);
	}

}
