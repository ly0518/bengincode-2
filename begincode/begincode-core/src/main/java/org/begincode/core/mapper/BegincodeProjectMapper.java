package org.begincode.core.mapper;

import org.begincode.core.model.BegincodeProject;

public interface BegincodeProjectMapper {
    int deleteByPrimaryKey(Integer begincodeProjectId);

    int insert(BegincodeProject record);

    int insertSelective(BegincodeProject record);

    BegincodeProject selectByPrimaryKey(Integer begincodeProjectId);

    int updateByPrimaryKeySelective(BegincodeProject record);

    int updateByPrimaryKey(BegincodeProject record);
}