package org.begincode.code.service;

import java.util.List;

import org.apache.log4j.Logger;
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
public class CodeTypeService 
{
	private Logger logger = Logger.getLogger(CodeTypeService.class);
	@Autowired
	CodeTypeMapper codeTypeMapper;
	
	/**
	 * @param userId
	 */
	public List<CodeType> selectCodeTypeByUserId(int userId){
		return codeTypeMapper.selectAllByUserId(userId);
	}
	 
}
