package org.begincode.code.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.begincode.code.service.CodeService;
import org.begincode.core.mapper.BegincodeCodeMapper;
import org.begincode.core.model.BegincodeCode;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.core.util.BeginCodePageParam;
import org.begincode.exception.BeginCodeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author yangsj
 *
 */
@Service
public class CodeServiceImpl implements CodeService
{
	private Logger logger = Logger.getLogger(CodeServiceImpl.class);
	 
	@Autowired
	BegincodeCodeMapper begincodeCodeMapper;
	
	
	/** (非 Javadoc) 
	 * <p>Title: findCodesByRecord</p> 
	 * <p>Description: </p> 
	 * @param record
	 * @return  
	 * @see org.begincode.code.service.CodeService#findCodesByRecord(org.begincode.core.model.BegincodeCode) 
	 */
	public PageList findCodesByRecord(BegincodeCode record){
		return  begincodeCodeMapper.selectBySelective(record);
	}
	
	/** (非 Javadoc) 
	 * <p>Title: findCodeById</p> 
	 * <p>Description: </p> 
	 * @param codeId
	 * @return  
	 * @see org.begincode.code.service.CodeService#findCodeById(int) 
	 */
	public BegincodeCode findCodeById(int codeId){
		BegincodeCode record ;
		try{
			record = begincodeCodeMapper.selectByPrimaryKey(codeId);
		}catch(Exception e){
			throw new BeginCodeException(e,"codeId 不存在" +codeId);
		}
		return record;
	}
	 
	/** (非 Javadoc) 
	 * <p>Title: findCodes</p> 
	 * <p>Description: </p> 
	 * @param page
	 * @return  
	 * @see org.begincode.code.service.CodeService#findCodes(org.begincode.core.paginator.domain.Paginator) 
	 */
	public PageList findCodes(Paginator page){
		BeginCodePageParam.initPaginator(page);
		return  begincodeCodeMapper.selectAll();
	}
	
	/** (非 Javadoc) 
	 * <p>Title: createCode</p> 
	 * <p>Description: </p> 
	 * @param record
	 * @return  
	 * @see org.begincode.code.service.CodeService#createCode(org.begincode.core.model.BegincodeCode) 
	 */
	public BegincodeCode createCode(BegincodeCode record){
		begincodeCodeMapper.insertSelective(record);
		return record;
	}

	/** (非 Javadoc) 
	 * <p>Title: updateAddCountById</p> 
	 * <p>Description: </p> 
	 * @param record  
	 * @see org.begincode.code.service.CodeService#updateAddCountById(org.begincode.core.model.BegincodeCode) 
	 */
	@Override
	public void updateAddCountById(BegincodeCode record) {
		begincodeCodeMapper.updateAddCountById(record);
	}

	@Override
	public void batchUpdateAddCountById(List<BegincodeCode> codes) {
		begincodeCodeMapper.batchUpdateAddCountById(codes);
	}

	@Override
	public PageList findCodesByRecords(BegincodeCode record, Paginator page) {
		BeginCodePageParam.initPaginator(page);
		return begincodeCodeMapper.selectBySelective(record);
	}
}
