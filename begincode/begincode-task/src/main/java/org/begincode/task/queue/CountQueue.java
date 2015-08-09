package org.begincode.task.queue;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

import org.begincode.task.comparator.CountComparator;



/**
 * 分类记录浏览次数标识队列，只记录浏览的数据标识 ID
 * 	codeViewQueue   	代码浏览队列
 *  courseViewQueue		教程浏览队列
 * 
 */
public class CountQueue {
	/** 
	* @Fields codeViewQueue : 代码浏览队列，初始化10个长度
	*/ 
	public static  PriorityBlockingQueue<Integer> codeViewQueue = new PriorityBlockingQueue<Integer>(10,new CountComparator());
	/** 
	* @Fields courseViewQueue : 教程浏览队列，初始化10长度
	*/ 
	public static  PriorityBlockingQueue<Integer> videoCourseViewQueue = new PriorityBlockingQueue<Integer>(10,new CountComparator());


	
	/** 
	* @Title: addCodeViewQueue 
	* @Description: 新增代码访问记录，
	* 	可能返回脏数据，不影响
	* @param codeId	代码标识
	* @return int   
	* @throws 
	*/
	public static int addCodeViewQueue(Integer codeId){
		if(codeId != null){
			codeViewQueue.add(codeId);
		}
		return codeViewQueue.size();
	}
	/** 
	* @Title: getCodeViewQueue 
	* @Description: 获取代码浏览队列数据，并返回Map<标识Id,次数>
	* 	从队列取数据，直到取到null位置，返回map
	* @return Map<Integer,Integer>   
	* @throws 
	*/
	public static Map<Integer,Integer> getCodeViewQueue(){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		while(true){
			Integer codeId = codeViewQueue.poll();
			if(codeId != null){
				if(map.containsKey(codeId)){
					map.put(codeId, map.get(codeId)+1);
				}else{
					map.put(codeId,1);
				}				
			}else{
				break;
			}
		}
		return map;
	}
	
	/** 
	* @Title: addCourseViewQueue 
	* @Description: 新增课程浏览记录
	* 	返回队列长度，可能获取脏数据，不影响
	* @param courseId 课程标识
	* @return int   
	* @throws 
	*/
	public static int addCourseViewQueue(Integer courseId){
		if(courseId != null){
			videoCourseViewQueue.add(courseId);
		}
		return videoCourseViewQueue.size();
	}
	
	/** 
	* @Title: getCourseViewQueue 
	* @Description: 获取教程浏览队列数据，并返回Map<标识Id,次数>
	* 	从队列取数据，直到取到null位置，返回map
	* @return Map<Integer,Integer>   
	* @throws 
	*/
	public static Map<Integer,Integer> getVideoCourseViewQueue(){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		while(true){
			Integer courseId = videoCourseViewQueue.poll();
			if(courseId != null){
				if(map.containsKey(courseId)){
					map.put(courseId, map.get(courseId)+1);
				}else{
					map.put(courseId,1);
				}				
			}else{
				break;
			}
		}
		return map;
	}
}
