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
* @ClassName: CodeCommentService 
* @Description: 代码评论服务
* @author yangsj 
* @date 2015年8月1日 下午3:16:36 
*  
*/
public interface CodeCommentService 
{
	 
 
	/** 
	* @Title: createCodeCommentSelective 
	* @Description: 创建评论
	* @param CodeComment codeComment
	* @return int   
	* @throws 
	*/
	public int createCodeCommentSelective(CodeComment codeComment);
	 
	/** 
	* @Title: findCodeCommentByCodeId 
	* @Description: 根据代码标识查询评论
	* @param codeId
	* @return PageList<CodeComment>   
	* @throws 
	*/
	public PageList<CodeComment> findCodeCommentByCodeId(Integer codeId);
	
}
