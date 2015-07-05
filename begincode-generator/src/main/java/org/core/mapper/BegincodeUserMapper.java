package org.core.mapper;

import org.core.model.BegincodeUser;

public interface BegincodeUserMapper {
    int deleteByPrimaryKey(Integer begincodeUserId);

    int insert(BegincodeUser record);

    int insertSelective(BegincodeUser record);

    BegincodeUser selectByPrimaryKey(Integer begincodeUserId);

    int updateByPrimaryKeySelective(BegincodeUser record);

    int updateByPrimaryKey(BegincodeUser record);
}