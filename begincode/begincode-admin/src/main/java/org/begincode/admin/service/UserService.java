package org.begincode.admin.service;

import java.util.List;

import org.begincode.core.model.BegincodeUser;

public interface UserService {

	public int createUser(BegincodeUser user);
	
	public int deleteUser(BegincodeUser user);
	
	public int forzenUser(BegincodeUser user);
	
	public int updateUser(BegincodeUser user);
	
	public BegincodeUser selectUserById(int userId);
	
	public List<BegincodeUser> selectUsers(BegincodeUser user);
 	
}