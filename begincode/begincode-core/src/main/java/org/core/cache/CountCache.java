package org.core.cache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 记录页面浏览次数，点赞次数，踩次数
 * */
public class CountCache {
	//代码相关
	public static ConcurrentHashMap<Integer,AtomicInteger> codeViewMap = new ConcurrentHashMap<Integer,AtomicInteger>();
	public static ConcurrentHashMap<Integer,AtomicInteger> codeGoodMap = new ConcurrentHashMap<Integer,AtomicInteger>();
	public static ConcurrentHashMap<Integer,AtomicInteger> codeBadMap = new ConcurrentHashMap<Integer,AtomicInteger>();
	//视频教程章节
	public static ConcurrentHashMap<Integer,AtomicInteger> videoChapterViewMap = new ConcurrentHashMap<Integer,AtomicInteger>();
	public static ConcurrentHashMap<Integer,AtomicInteger> videoChapterGoodMap = new ConcurrentHashMap<Integer,AtomicInteger>();
	public static ConcurrentHashMap<Integer,AtomicInteger> videoChapterBadMap = new ConcurrentHashMap<Integer,AtomicInteger>();
	//项目开发
	public static ConcurrentHashMap<Integer,AtomicInteger> projectStageViewMap = new ConcurrentHashMap<Integer,AtomicInteger>();
	public static ConcurrentHashMap<Integer,AtomicInteger> projectStageGoodMap = new ConcurrentHashMap<Integer,AtomicInteger>();
	public static ConcurrentHashMap<Integer,AtomicInteger> projectStageBadMap = new ConcurrentHashMap<Integer,AtomicInteger>();

	public static void addCodeView(int codeId){
		if(codeViewMap.get(codeId) != null){
			synchronized(codeViewMap){
					codeViewMap.get(codeId).addAndGet(1);
				}
		}else{
			synchronized(codeViewMap){
				if(codeViewMap.get(codeId) == null){
					codeViewMap.put(codeId, new AtomicInteger(1));
				}else{
					codeViewMap.get(codeId).addAndGet(1);
				}
			}
		}
	}
	public static int getAndResetCodeViewMap(int codId){
		synchronized(codeViewMap){
			int viewCount =  codeViewMap.get(codId).get();
			codeViewMap.put(codId, new AtomicInteger(0));
			return viewCount;
		}
	}
	public static void main(String[] args) throws InterruptedException{
		AtomicInteger numCount = new AtomicInteger(0);
		for(int i = 0;i<1000;i++){
			new MyThread(1).start();
			new MyThread(1).start();
			new MyThread(2).start();
			numCount.addAndGet(1);
		}
		while(true){
			System.out.println("循环"+numCount.get());
			if(numCount.get() >= 1000){
				System.out.println(CountCache.getAndResetCodeViewMap(1));
				System.out.println(CountCache.getAndResetCodeViewMap(2));
				break;
			}else{
				Thread.sleep(1000);
			}			
		}

	
	}
	
 
}
class MyThread extends Thread {  
	int codeId ;
	public MyThread(int codeId){
		this.codeId = codeId;
	}
	public void run() {  
		CountCache.addCodeView(codeId);
	}
} 
