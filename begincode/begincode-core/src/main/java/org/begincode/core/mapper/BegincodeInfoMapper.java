package org.begincode.core.mapper;

import org.begincode.core.model.BegincodeInfo;

public interface BegincodeInfoMapper {
    int deleteByPrimaryKey(Integer begincodeInfoId);

    int insert(BegincodeInfo record);

    int insertSelective(BegincodeInfo record);

    BegincodeInfo selectByPrimaryKey(Integer begincodeInfoId);

    int updateByPrimaryKeySelective(BegincodeInfo record);

    int updateByPrimaryKeyWithBLOBs(BegincodeInfo record);
}