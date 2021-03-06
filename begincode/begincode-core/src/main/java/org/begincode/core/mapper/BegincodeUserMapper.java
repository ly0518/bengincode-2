package org.begincode.core.mapper;

import org.begincode.core.model.BegincodeUser;

public interface BegincodeUserMapper {
	
    int deleteByPrimaryKey(Integer begincodeUserId);

    int insert(BegincodeUser record);

    int insertSelective(BegincodeUser record);

    BegincodeUser selectByPrimaryKey(Integer begincodeUserId);

    int updateByPrimaryKeySelective(BegincodeUser record);

    int updateByPrimaryKey(BegincodeUser record);
    
    BegincodeUser selectByTokenIdAndOpenId(BegincodeUser record);
    
}