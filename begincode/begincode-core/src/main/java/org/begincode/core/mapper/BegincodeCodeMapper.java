package org.begincode.core.mapper;

import java.util.List;

import org.begincode.core.model.BegincodeCode;

/**
 * @author yangsj
 *
 */
public interface BegincodeCodeMapper {
	
    int deleteByPrimaryKey(Integer begincodeCodeId);

    int insert(BegincodeCode record);

    int insertSelective(BegincodeCode record);

    BegincodeCode selectByPrimaryKey(Integer begincodeCodeId);

    int updateByPrimaryKeySelective(BegincodeCode record);

    int updateByPrimaryKeyWithBLOBs(BegincodeCode record);

    int updateByPrimaryKey(BegincodeCode record);
    
    List<BegincodeCode> selectBySelective(BegincodeCode record);
    
    int  selectBySelectiveCount(BegincodeCode record);
}