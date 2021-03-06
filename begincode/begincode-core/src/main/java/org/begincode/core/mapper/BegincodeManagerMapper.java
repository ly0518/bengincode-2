package org.begincode.core.mapper;

import org.begincode.core.model.BegincodeManager;

public interface BegincodeManagerMapper {
    int deleteByPrimaryKey(Integer begincodeManagerId);

    int insert(BegincodeManager record);

    int insertSelective(BegincodeManager record);

    BegincodeManager selectByPrimaryKey(Integer begincodeManagerId);

    int updateByPrimaryKeySelective(BegincodeManager record);

    int updateByPrimaryKeyWithBLOBs(BegincodeManager record);

    int updateByPrimaryKey(BegincodeManager record);
}