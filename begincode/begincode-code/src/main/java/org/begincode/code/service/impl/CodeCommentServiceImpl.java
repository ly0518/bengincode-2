package org.begincode.code.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.begincode.code.service.CodeCommentService;
import org.begincode.core.mapper.BegincodeCodeMapper;
import org.begincode.core.mapper.CodeCommentMapper;
import org.begincode.core.model.BegincodeCode;
import org.begincode.core.model.CodeComment;
import org.begincode.core.paginator.domain.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
/** 
* @ClassName: CodeCommentServiceImpl 
* @Description: 
* @author yangsj 
* @date 2015年8月1日 下午3:22:25 
*  
*/
@Service
public class CodeCommentServiceImpl implements CodeCommentService
{
	private Logger logger = Logger.getLogger(CodeCommentServiceImpl.class);
	 
	@Autowired	CodeCommentMapper codeCommentMapper;
	 
	/** (非 Javadoc) 
	 * <p>Title: createCodeCommentSelective</p> 
	 * <p>Description: </p> 
	 * @param codeComment
	 * @return 
	 * @see org.begincode.code.service.CodeCommentService#createCodeCommentSelective(org.begincode.core.model.CodeComment) 
	 */
	public int createCodeCommentSelective(CodeComment codeComment){
		return  codeCommentMapper.insertSelective(codeComment);
	}
	
	 
	/** (非 Javadoc) 
	 * <p>Title: findCodeCommentByCodeId</p> 
	 * <p>Description: </p> 
	 * @param codeId
	 * @return 
	 * @see org.begincode.code.service.CodeCommentService#findCodeCommentByCodeId(java.lang.Integer) 
	 */
	public PageList<CodeComment> findCodeCommentByCodeId(Integer codeId){
		return codeCommentMapper.selectByCodeId(codeId);
	}
	
}
