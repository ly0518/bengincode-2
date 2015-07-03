package org.course.service;

import org.apache.log4j.Logger;
import org.core.mapper.ImgMapper;
import org.core.model.Img;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private Logger logger = Logger.getLogger(UserService.class);
	
	@Autowired ImgMapper imgMapper;
	public void sel(){
		Img  record  = new Img ();
		record.setFlag(1);
		record.setSku(4444);
		record.setUrl("yangshuangjun");
		int count = imgMapper.insertSelective(record);
		logger.debug("插入成功数"+count);
	}
}
