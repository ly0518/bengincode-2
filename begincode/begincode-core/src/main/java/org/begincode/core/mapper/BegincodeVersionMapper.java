package org.begincode.core.mapper;

import org.begincode.core.model.BegincodeVersion;

public interface BegincodeVersionMapper {
    int deleteByPrimaryKey(Integer begincodeVersionId);

    int insert(BegincodeVersion record);

    int insertSelective(BegincodeVersion record);

    BegincodeVersion selectByPrimaryKey(Integer begincodeVersionId);

    int updateByPrimaryKeySelective(BegincodeVersion record);

    int updateByPrimaryKey(BegincodeVersion record);
}