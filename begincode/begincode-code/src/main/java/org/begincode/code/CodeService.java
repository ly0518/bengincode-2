package org.begincode.code;

import java.util.List;

import org.apache.log4j.Logger;
import org.core.mapper.BegincodeCodeMapper;
import org.core.model.BegincodeCode;
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
	public void selCodeForPaper(BegincodeCode record){
		
		List list = begincodeCodeMapper.selectBySelective(record);
		System.out.println(list.size());
	}
	
	/**
	 * @param record
	 */
	public void selCodeCount(BegincodeCode record){
		int count =  begincodeCodeMapper.selectBySelectiveCount(record);
		System.out.println("总数："+count);
	}
}
