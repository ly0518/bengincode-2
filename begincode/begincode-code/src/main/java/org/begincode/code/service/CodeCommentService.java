package org.begincode.code.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.begincode.core.mapper.BegincodeCodeMapper;
import org.begincode.core.mapper.CodeCommentMapper;
import org.begincode.core.model.BegincodeCode;
import org.begincode.core.model.CodeComment;
import org.begincode.core.paginator.domain.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author yangsj
 *
 */
@Service
public class CodeCommentService 
{
	private Logger logger = Logger.getLogger(CodeCommentService.class);
	@Autowired	CodeCommentMapper codeCommentMapper;
	/**
	 * @param record
	 */
	public int createCodeCommentSelective(CodeComment codeComment){
		return  codeCommentMapper.insertSelective(codeComment);
	}
	
	public PageList findCodeComment(Integer codeId){
		return codeCommentMapper.selectByCodeId(codeId);
	}
	
}
