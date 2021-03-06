package org.begincode.code.service;

import java.util.List;

import org.begincode.core.model.BegincodeCode;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;

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
	 * @param BegincodeCode record,Paginator page
	 * @return PageList
	 * @throws
	 */
	public PageList findCodesByRecords(BegincodeCode record,Paginator page);
	
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
	
	/** 
	* @Title: updateAddCountById 
	* @Description: 修改代码分享 浏览，好评，差评次数，原有基础上增加，供定时任务用
	* @param record void   
	* @throws 
	*/
	public void updateAddCountById(BegincodeCode record);
	
	
	/** 
	* @Title: batchUpdateAddCountById 
	* @Description: 批量更新浏览次数
	* @param codes void   
	* @throws 
	*/
	public void batchUpdateAddCountById(List<BegincodeCode> codes);
}
