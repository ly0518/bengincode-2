package org.begincode.code.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.begincode.core.mapper.BegincodeCodeMapper;
import org.begincode.core.model.BegincodeCode;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** 
* @ClassName: CodeService 
* @Description: 代码分享服务
* @author yangsj 
* @date 2015年8月1日 下午3:13:51 
*  
*/
public interface CodeService 
{
	/**
	 * @Description: 查询代码
	 * @param BegincodeCode record
	 * @return PageList
	 * @throws
	 */
	public PageList findCodesByRecord(BegincodeCode record);
	
	/**
	 * @Description 根据ID查询
	 * @param int codeId
	 * return BegincodeCode
	 * */
	public BegincodeCode findCodeById(int codeId);
	 
	/** 
	* @Title: findCodes 
	* @Description: 查询代码
	* @param page
	* @return PageList   
	* @throws 
	*/
	public PageList findCodes(Paginator page);
	/**
	 * @Description: 创建代码
	 * @param BegincodeCode record
	 * @return BegincodeCode
	 * @throws
	 */
	public BegincodeCode createCode(BegincodeCode record);
}
