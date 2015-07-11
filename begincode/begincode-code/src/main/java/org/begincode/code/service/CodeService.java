package org.begincode.code.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.begincode.core.mapper.BegincodeCodeMapper;
import org.begincode.core.model.BegincodeCode;
import org.begincode.core.util.PaginationResult;
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
	public PaginationResult<BegincodeCode> selCodeForPaper(BegincodeCode record){
		
		List list = begincodeCodeMapper.selectBySelective(record);
		int count =  begincodeCodeMapper.selectBySelectiveCount(record);
		PaginationResult pageCodes = new PaginationResult(list);
		pageCodes.setTotlePage(count);
		return pageCodes;
	}
	 
}