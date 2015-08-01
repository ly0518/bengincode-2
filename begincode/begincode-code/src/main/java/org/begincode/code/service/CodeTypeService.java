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
* @ClassName: CodeTypeService 
* @Description: 
* @author yangsj 
* @date 2015年8月1日 下午3:15:03 
*  
*/
public interface CodeTypeService 
{
	 
	
  
	/** 
	* @Title: findCodeTypeByUserId 
	* @Description: 根据用户标识查询代码类型
	* @param int userId
	* @param @return   
	* @return List<CodeType>   
	* @throws 
	*/
	public List<CodeType> findCodeTypeByUserId(int userId);
	 
}
