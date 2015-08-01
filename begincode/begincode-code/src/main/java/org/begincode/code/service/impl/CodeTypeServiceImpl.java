package org.begincode.code.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.begincode.code.service.CodeTypeService;
import org.begincode.core.mapper.BegincodeCodeMapper;
import org.begincode.core.mapper.CodeTypeMapper;
import org.begincode.core.model.BegincodeCode;
import org.begincode.core.model.CodeType;
import org.begincode.core.paginator.domain.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author yangsj
 *
 */
@Service
public class CodeTypeServiceImpl implements CodeTypeService
{
	private Logger logger = Logger.getLogger(CodeTypeService.class);
	@Autowired
	CodeTypeMapper codeTypeMapper;
	
	 
	/** (非 Javadoc) 
	 * <p>Title: findCodeTypeByUserId</p> 
	 * <p>Description: </p> 
	 * @param userId
	 * @return  
	 * @see org.begincode.code.service.CodeTypeService#findCodeTypeByUserId(int) 
	 */
	public List<CodeType> findCodeTypeByUserId(int userId){
		return codeTypeMapper.selectAllByUserId(userId);
	}
	 
}
