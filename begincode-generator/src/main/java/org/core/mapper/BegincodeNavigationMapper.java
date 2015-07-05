package org.core.mapper;

import org.core.model.BegincodeNavigation;

public interface BegincodeNavigationMapper {
    int deleteByPrimaryKey(Integer begincodeNavigationId);

    int insert(BegincodeNavigation record);

    int insertSelective(BegincodeNavigation record);

    BegincodeNavigation selectByPrimaryKey(Integer begincodeNavigationId);

    int updateByPrimaryKeySelective(BegincodeNavigation record);

    int updateByPrimaryKey(BegincodeNavigation record);
}