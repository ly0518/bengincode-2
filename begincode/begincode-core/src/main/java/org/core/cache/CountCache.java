package org.core.cache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.log4j.Logger;

/**
 * 记录页面浏览次数，点赞次数，踩次数 非线程安全，但不准确也没关系
 * */
public class CountCache {

	public final static String CODE_VIEW = "codeView";
	public final static String CODE_GOOD = "codeGood";
	public final static String CODE_BAD = "codeBad";
	public final static String VIDEO_CHAPTER_VIEW = "videoChapterView";
	public final static String VIDEO_CHAPTER_GOOD = "videoChapterGood";
	public final static String VIDEO_CHAPTER_BAD = "videoChapterBad";
	public final static String PROJECT_STAGE_VIEW = "projectStageView";
	public final static String PROJECT_STAGE_GOOD = "projectStageGood";
	public final static String PROJECT_STAGE_BAD = "projectStageBad";
	// 代码相关
	private static ConcurrentHashMap<Integer, AtomicInteger> codeViewMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	private static ConcurrentHashMap<Integer, AtomicInteger> codeGoodMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	private static ConcurrentHashMap<Integer, AtomicInteger> codeBadMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	// 视频教程章节
	private static ConcurrentHashMap<Integer, AtomicInteger> videoChapterViewMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	private static ConcurrentHashMap<Integer, AtomicInteger> videoChapterGoodMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	private static ConcurrentHashMap<Integer, AtomicInteger> videoChapterBadMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	// 项目开发
	private static ConcurrentHashMap<Integer, AtomicInteger> projectStageViewMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	private static ConcurrentHashMap<Integer, AtomicInteger> projectStageGoodMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	private static ConcurrentHashMap<Integer, AtomicInteger> projectStageBadMap = new ConcurrentHashMap<Integer, AtomicInteger>();


	// projectStageView 加1
	static void addProjectStageView(int projectStageId) {
		if (projectStageViewMap.get(projectStageId) != null) {
			projectStageViewMap.get(projectStageId).addAndGet(1);
		} else {
			projectStageViewMap.put(projectStageId, new AtomicInteger(1));
		}
	}

	// 获取videoChapterView 并重置
	static int getAndResetProjectStageView(int projectStageId) {
		int viewCount = projectStageViewMap.get(projectStageId).get();
		projectStageViewMap.put(projectStageId, new AtomicInteger(0));
		return viewCount;
	}

	// projectStageGood 加1
	  static void addProjectStageGood(int projectStageId) {
		if (projectStageGoodMap.get(projectStageId) != null) {
			projectStageGoodMap.get(projectStageId).addAndGet(1);
		} else {
			projectStageGoodMap.put(projectStageId, new AtomicInteger(1));
		}

	}

	// 获取videoChapterGood 并重置
	static int getAndResetaddProjectStageGood(int projectStageId) {
		int goodCount = projectStageGoodMap.get(projectStageId).get();
		projectStageGoodMap.put(projectStageId, new AtomicInteger(0));
		return goodCount;
	}

	// ProjectStageBad 加1
	  static void addProjectStagerBad(int projectStageId) {
		if (projectStageBadMap.get(projectStageId) != null) {
			projectStageBadMap.get(projectStageId).addAndGet(1);
		} else {
			projectStageBadMap.put(projectStageId, new AtomicInteger(1));
		}

	}

	// 获取ProjectStageBad 并重置
	static int getAndResetProjectStagerBad(int projectStageId) {
		int badCount = projectStageBadMap.get(projectStageId).get();
		projectStageBadMap.put(projectStageId, new AtomicInteger(0));
		return badCount;
	}
	
	
	// videoChapterView 加1
	static void addVideoChapterView(int videoChapterId) {
		if (videoChapterViewMap.get(videoChapterId) != null) {
			videoChapterViewMap.get(videoChapterId).addAndGet(1);
		} else {
			videoChapterViewMap.put(videoChapterId, new AtomicInteger(1));
		}
	}

	// 获取videoChapterView 并重置
	static int getAndResetVideoChapterView(int videoChapterId) {
		int viewCount = videoChapterViewMap.get(videoChapterId).get();
		videoChapterViewMap.put(videoChapterId, new AtomicInteger(0));
		return viewCount;
	}

	// videoChapterGood 加1
	  static void addVideoChapterGood(int videoChapterId) {
		if (videoChapterGoodMap.get(videoChapterId) != null) {
			videoChapterGoodMap.get(videoChapterId).addAndGet(1);
		} else {
			videoChapterGoodMap.put(videoChapterId, new AtomicInteger(1));
		}

	}

	// 获取videoChapterGood 并重置
	static int getAndResetaddVideoChapterGood(int videoChapterId) {
		int goodCount = videoChapterGoodMap.get(videoChapterId).get();
		videoChapterGoodMap.put(videoChapterId, new AtomicInteger(0));
		return goodCount;
	}

	// videoChapterBad 加1
	  static void addVideoChapterBad(int videoChapterId) {
		if (videoChapterBadMap.get(videoChapterId) != null) {
			videoChapterBadMap.get(videoChapterId).addAndGet(1);
		} else {
			videoChapterBadMap.put(videoChapterId, new AtomicInteger(1));
		}

	}

	// 获取videoChapterBad 并重置
	static int getAndResetVideoChapterBad(int videoChapterId) {
		int badCount = videoChapterBadMap.get(videoChapterId).get();
		videoChapterBadMap.put(videoChapterId, new AtomicInteger(0));
		return badCount;
	}

	// codeView 加1
	static void addCodeView(int codeId) {
		if (codeViewMap.get(codeId) != null) {
			codeViewMap.get(codeId).addAndGet(1);
		} else {
			codeViewMap.put(codeId, new AtomicInteger(1));
		}
	}

	// 获取codeView 并重置
	static int getAndResetCodeView(int codId) {
		int viewCount = codeViewMap.get(codId).get();
		codeViewMap.put(codId, new AtomicInteger(0));
		return viewCount;
	}

	// codeGood 加1
	 static void addCodeGood(int codeId) {
		if (codeGoodMap.get(codeId) != null) {
			codeGoodMap.get(codeId).addAndGet(1);
		} else {
			codeGoodMap.put(codeId, new AtomicInteger(1));
		}

	}

	// 获取codeGood 并重置
	static int getAndResetCodeGood(int codId) {
		int goodCount = codeGoodMap.get(codId).get();
		codeGoodMap.put(codId, new AtomicInteger(0));
		return goodCount;
	}

	// codeBad 加1
	 static void addCodeBad(int codeId) {
		if (codeBadMap.get(codeId) != null) {
			codeBadMap.get(codeId).addAndGet(1);
		} else {
			codeBadMap.put(codeId, new AtomicInteger(1));
		}

	}

	// 获取codeBad 并重置
	static int getAndResetCodeBad(int codId) {
		int badCount = codeBadMap.get(codId).get();
		codeBadMap.put(codId, new AtomicInteger(0));
		return badCount;
	}
}

class CountThread extends Thread {
	Logger logger = Logger.getLogger(CountThread.class);
	int codeId;
	String typeId;

	public CountThread(String typeId, int codeId) {
		this.codeId = codeId;
		this.typeId = typeId;
	}

	public void run() {
		switch (typeId) {
		case CountCache.CODE_VIEW:
			CountCache.addCodeView(codeId);
			break;
		case CountCache.CODE_GOOD:
			CountCache.addCodeGood(codeId);
			break;
		case CountCache.CODE_BAD:
			CountCache.addCodeBad(codeId);;
			break;
		case CountCache.VIDEO_CHAPTER_VIEW:
			CountCache.addVideoChapterView(codeId);
			break;
		case CountCache.VIDEO_CHAPTER_GOOD:
			CountCache.addProjectStageGood(codeId);
			break;
		case CountCache.VIDEO_CHAPTER_BAD:
			CountCache.addVideoChapterBad(codeId);
			break;
		case CountCache.PROJECT_STAGE_VIEW:
			CountCache.addProjectStageView(codeId);
			break;
		case CountCache.PROJECT_STAGE_GOOD:
			CountCache.addProjectStageGood(codeId);
			break;
		case CountCache.PROJECT_STAGE_BAD:
			CountCache.addProjectStagerBad(codeId);
			break;
		default:
			logger.warn(" CountCache run default add method ");
			break;
		}   
	}
}
