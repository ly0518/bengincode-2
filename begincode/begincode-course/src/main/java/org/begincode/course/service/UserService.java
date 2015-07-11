package org.begincode.course.service;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.begincode.core.mapper.BegincodeCodeMapper;
import org.begincode.core.mapper.BegincodeUserMapper;
import org.begincode.core.model.BegincodeCode;
import org.begincode.core.model.BegincodeUser;
import org.begincode.core.util.PaginationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private Logger logger = Logger.getLogger(UserService.class);
	@Autowired
	BegincodeUserMapper begincodeUserMapper;
	public void sel(){
		BegincodeUser record = new BegincodeUser();
		record.setAccessToken("111");
		record.setCdate(new Date());
		record.setEmail("yangshuangjun@126.com");
		record.setLoginName("yang");
		record.setCheckFlag("1");
		record.setCourse("12");
		record.setFrozen("1");
		record.setGag("1");
		record.setNickname("杨晓阳");
		record.setOpenId("");
		record.setPwd("dsdf");
		record.setPic("dd");
		record.setReceiveEmail("1");
		record.setSex("1");
		record.setTelPhone("12");
//		record.setUserSourceId("1");
		int count = begincodeUserMapper.insertSelective(record);
		logger.debug("插入成功数");
	}
	@Autowired
	BegincodeCodeMapper begincodeCodeMapper;
	/**
	 * @param record
	 */
	public PaginationResult<BegincodeCode> selCodeForPaper(BegincodeCode record){
		
		List list = begincodeCodeMapper.selectBySelective(record);
		int count =  begincodeCodeMapper.selectBySelectiveCount(record);
		PaginationResult pageCodes = new PaginationResult(list);
		pageCodes.setTotlePage(count);
		return pageCodes;
	}
}
