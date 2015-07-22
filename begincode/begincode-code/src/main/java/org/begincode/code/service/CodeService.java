package org.begincode.code.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.begincode.core.mapper.BegincodeCodeMapper;
import org.begincode.core.model.BegincodeCode;
import org.begincode.core.paginator.domain.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author yangsj
 *
 */
@Service
public class CodeService 
{
	private Logger logger = Logger.getLogger(CodeService.class);
	@Autowired
	BegincodeCodeMapper begincodeCodeMapper;
	/**
	 * @param record
	 */
	public PageList findCodesByRecord(BegincodeCode record){
		return  begincodeCodeMapper.selectBySelective(record);
	}
	
	public BegincodeCode findCodeById(int codeId){
		return begincodeCodeMapper.selectByPrimaryKey(codeId);
	}
	
	public PageList findCodes(){
		return  begincodeCodeMapper.selectAll();
	}
}
