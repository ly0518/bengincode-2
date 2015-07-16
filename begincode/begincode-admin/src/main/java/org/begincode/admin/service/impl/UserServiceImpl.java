package org.begincode.admin.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.begincode.admin.service.UserService;
import org.begincode.core.mapper.BegincodeUserMapper;
import org.begincode.core.model.BegincodeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	private Logger logger = Logger.getLogger(UserServiceImpl.class);

	@Autowired
	BegincodeUserMapper userMapper;

	@Override
	public int createUser(BegincodeUser user) {
		logger.info("创建用户：" + user);
		return userMapper.insert(user);
	}

	@Override
	public int deleteUser(BegincodeUser user) {
		user.setDeleteFlag("0");
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int forzenUser(BegincodeUser user) {
		user.setDeleteFlag("0");
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int updateUser(BegincodeUser user) {
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public BegincodeUser selectUserById(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public List<BegincodeUser> selectUsers(BegincodeUser user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
