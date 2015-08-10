package org.begincode.task.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.begincode.code.service.CodeService;
import org.begincode.core.constant.BeginCodeConstant;
import org.begincode.core.model.BegincodeCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service  
@Async 
public class CountOperator {
	Logger logger = Logger.getLogger(CountOperator.class);
	@Autowired
	CodeService codeService;
	 
	/** 
	* @Title: changeViewCount 
	* @Description:  触发获取队列数据，修改数据库操作。
	* void   
	* @throws 
	*/
	public void changeViewCount(){
		updateChangeCodeViewCount();
//		updateChangeVideoCourseViewCount();
	}
	/** 
	* @Title: changeBatViewCount 
	* @Description:  触发获取队列数据，批量修改数据库操作
	* void   
	* @throws 
	*/
	public void changeBatViewCount(){
		updateBatchChangeCodeViewCount();
	}
	/** 
	* @Title: addCodeViewCount 
	* @Description: 新增代码浏览次数
	* @param codeId void   
	* @throws 
	*/
 
	public void addCodeViewCount(int codeId){
		int queueCount = CountQueue.addCodeViewQueue(codeId);
		if(queueCount >= BeginCodeConstant.MAX_QUEUE){
//			changeViewCount();    		     调用循环修改数据库策略
			changeBatViewCount();		//批量修改数据库策略
		}
	}
 
	/** 
	* @Title: addVideoCourseViewCount 
	* @Description: 新增视频浏览次数队列
	* @param videoCourseId void   
	* @throws 
	*/
	public void addVideoCourseViewCount(int videoCourseId){
		int queueCount = CountQueue.addCourseViewQueue(videoCourseId);
		if(queueCount >= BeginCodeConstant.MAX_QUEUE){
			changeViewCount();
		}
	}
	
	
	/** 
	* @Title: updateChangeCodeViewCount 
	* @Description:   获取代码浏览次数，并循环修改数据库,
	* void   
	* @throws 
	*/
	private void updateChangeCodeViewCount(){
		Long start = System.currentTimeMillis();
		Map<Integer, Integer> codeMap = CountQueue.getCodeViewQueue();
		for(Integer key : codeMap.keySet()){
				BegincodeCode code = new BegincodeCode();
				code.setViewCount(codeMap.get(key));
				code.setbegincodeCodeId(key);
				codeService.updateAddCountById(code);
		}
	}
	/** 
	* @Title: updateBatchChangeCodeViewCount 
	* @Description:  获取代码浏览次数，修改数据库，批量操作数据库
	* void   
	* @throws 
	*/
	private void updateBatchChangeCodeViewCount(){
		List<BegincodeCode> list = new ArrayList<BegincodeCode>();
		Map<Integer, Integer> codeMap = CountQueue.getCodeViewQueue();
		for(Integer key : codeMap.keySet()){
				BegincodeCode code = new BegincodeCode();
				code.setViewCount(codeMap.get(key));
				code.setbegincodeCodeId(key);
				list.add(code);
		}
		if(list != null && list.size() > 0){
			codeService.batchUpdateAddCountById(list);
		}
	}
	/** 
	* @Title: updateChangeVideoCourseViewCount 
	* @Description:  获取视频教程浏览次数，并修改数据库
	* void   
	* @throws 
	*/
	private void updateChangeVideoCourseViewCount(){
		Map<Integer, Integer> codeMap = CountQueue.getVideoCourseViewQueue();
		BegincodeCode code = new BegincodeCode();
		for(Integer key : codeMap.keySet()){
			code.setbegincodeCodeId(key);
			code.setViewCount(codeMap.get(key));
			//TODO 视频教程修改次数代码
		}
	}
}
