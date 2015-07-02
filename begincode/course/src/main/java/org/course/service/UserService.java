package org.course.service;

import org.core.mapper.ImgMapper;
import org.core.model.Img;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired ImgMapper imgMapper;
	public void sel(){
		Img  record  = new Img ();
		record.setFlag(1);
		record.setSku(4444);
		record.setUrl("yangshuangjun");
		int count = imgMapper.insertSelective(record);
		System.out.println("插入成功数"+count);
	}
}
