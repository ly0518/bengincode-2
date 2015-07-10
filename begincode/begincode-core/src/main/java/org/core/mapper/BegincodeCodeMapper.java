package org.core.mapper;

import org.core.model.BegincodeCode;

public interface BegincodeCodeMapper {
    int deleteByPrimaryKey(Integer begincodeCodeCodeId);

    int insert(BegincodeCode record);

    int insertSelective(BegincodeCode record);

    BegincodeCode selectByPrimaryKey(Integer begincodeCodeCodeId);

    int updateByPrimaryKeySelective(BegincodeCode record);

    int updateByPrimaryKeyWithBLOBs(BegincodeCode record);

    int updateByPrimaryKey(BegincodeCode record);
}