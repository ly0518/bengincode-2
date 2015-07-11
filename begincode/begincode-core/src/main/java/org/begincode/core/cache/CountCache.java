package org.begincode.core.cache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 记录页面浏览次数，点赞次数，踩次数 非线程安全，但不准确也没关系
 */
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
	// 代码相关 代码浏览次数，好评数，差评数
	private static ConcurrentHashMap<Integer, AtomicInteger> codeViewMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	public static ConcurrentHashMap<Integer, AtomicInteger> codeGoodMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	private static ConcurrentHashMap<Integer, AtomicInteger> codeBadMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	// 视频教程章节 视频教程浏览次数，好评数，差评数
	private static ConcurrentHashMap<Integer, AtomicInteger> videoChapterViewMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	private static ConcurrentHashMap<Integer, AtomicInteger> videoChapterGoodMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	private static ConcurrentHashMap<Integer, AtomicInteger> videoChapterBadMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	// 项目开发 项目开发阶段浏览次数，好评数，差评数
	private static ConcurrentHashMap<Integer, AtomicInteger> projectStageViewMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	private static ConcurrentHashMap<Integer, AtomicInteger> projectStageGoodMap = new ConcurrentHashMap<Integer, AtomicInteger>();
	private static ConcurrentHashMap<Integer, AtomicInteger> projectStageBadMap = new ConcurrentHashMap<Integer, AtomicInteger>();

	/**
	 * 项目阶段浏览次数 加1
	 * 
	 * @param projectStageId 项目阶段标识
	 */
	static void addProjectStageView(int projectStageId) {
		if (projectStageViewMap.get(projectStageId) != null) {
			projectStageViewMap.get(projectStageId).addAndGet(1);
		} else {
			projectStageViewMap.put(projectStageId, new AtomicInteger(1));
		}
	}

	/**
	 * 项目阶段浏览次数获取并重置
	 * 
	 * @param projectStageId 项目阶段标识
	 */
	static int getAndResetProjectStageView(int projectStageId) {
		int viewCount = projectStageViewMap.get(projectStageId).get();
		projectStageViewMap.put(projectStageId, new AtomicInteger(0));
		return viewCount;
	}

	/**
	 * 项目阶段 好评数 加1
	 * 
	 * @param projectStageId 项目阶段标识
	 */
	static void addProjectStageGood(int projectStageId) {
		if (projectStageGoodMap.get(projectStageId) != null) {
			projectStageGoodMap.get(projectStageId).addAndGet(1);
		} else {
			projectStageGoodMap.put(projectStageId, new AtomicInteger(1));
		}

	}

	/**
	 * 项目阶段好评数重置 ，并返回当前值
	 * 
	 * @param projectStageId 项目阶段标识
	 */
	static int getAndResetaddProjectStageGood(int projectStageId) {
		int goodCount = projectStageGoodMap.get(projectStageId).get();
		projectStageGoodMap.put(projectStageId, new AtomicInteger(0));
		return goodCount;
	}

	/**
	 * 项目阶段差评数 加1
	 * 
	 * @param projectStageId 项目阶段标识
	 */
	static void addProjectStagerBad(int projectStageId) {
		if (projectStageBadMap.get(projectStageId) != null) {
			projectStageBadMap.get(projectStageId).addAndGet(1);
		} else {
			projectStageBadMap.put(projectStageId, new AtomicInteger(1));
		}

	}

	/**
	 * 项目阶段差评数重置，并返回当前值
	 * 
	 * @param projectStageId 项目阶段标识
	 */
	static int getAndResetProjectStagerBad(int projectStageId) {
		int badCount = projectStageBadMap.get(projectStageId).get();
		projectStageBadMap.put(projectStageId, new AtomicInteger(0));
		return badCount;
	}

	/**
	 * 视频教程浏览次数加1 ，
	 * 
	 * @param videoChapterId 视频教程标识
	 */
	static void addVideoChapterView(int videoChapterId) {
		if (videoChapterViewMap.get(videoChapterId) != null) {
			videoChapterViewMap.get(videoChapterId).addAndGet(1);
		} else {
			videoChapterViewMap.put(videoChapterId, new AtomicInteger(1));
		}
	}

	/**
	 * 视频教程浏览次数重置，并返回当前值
	 * 
	 * @param videoChapterId 视频教程标识
	 */
	static int getAndResetVideoChapterView(int videoChapterId) {
		int viewCount = videoChapterViewMap.get(videoChapterId).get();
		videoChapterViewMap.put(videoChapterId, new AtomicInteger(0));
		return viewCount;
	}

	/**
	 * 视频教程好评数 加1
	 * 
	 * @param videoChapterId 视频教程标识
	 */
	static void addVideoChapterGood(int videoChapterId) {
		if (videoChapterGoodMap.get(videoChapterId) != null) {
			videoChapterGoodMap.get(videoChapterId).addAndGet(1);
		} else {
			videoChapterGoodMap.put(videoChapterId, new AtomicInteger(1));
		}

	}

	/**
	 * 视频教程好评数数重置，并返回当前值
	 * 
	 * @param videoChapterId 视频教程标识
	 */
	static int getAndResetaddVideoChapterGood(int videoChapterId) {
		int goodCount = videoChapterGoodMap.get(videoChapterId).get();
		videoChapterGoodMap.put(videoChapterId, new AtomicInteger(0));
		return goodCount;
	}

	/**
	 * 视频教程差评数加1
	 * 
	 * @param videoChapterId 视频教程标识
	 */
	static void addVideoChapterBad(int videoChapterId) {
		if (videoChapterBadMap.get(videoChapterId) != null) {
			videoChapterBadMap.get(videoChapterId).addAndGet(1);
		} else {
			videoChapterBadMap.put(videoChapterId, new AtomicInteger(1));
		}

	}

	/**
	 * 视频教程差评数重置，并返回当前值
	 * 
	 * @param videoChapterId 视频教程标识
	 */
	static int getAndResetVideoChapterBad(int videoChapterId) {
		int badCount = videoChapterBadMap.get(videoChapterId).get();
		videoChapterBadMap.put(videoChapterId, new AtomicInteger(0));
		return badCount;
	}

	/**
	 * 代码分享浏览次数加1
	 * 
	 * @param codId 代码分享标识
	 */
	static void addCodeView(int codeId) {
		if (codeViewMap.get(codeId) != null) {
			codeViewMap.get(codeId).addAndGet(1);
		} else {
			codeViewMap.put(codeId, new AtomicInteger(1));
		}
	}

	/**
	 * 代码分享浏览次数重置，返回当前值
	 * 
	 * @param codId 代码分享标识
	 */
	static int getAndResetCodeView(int codId) {
		try {
			int viewCount = codeViewMap.get(codId).get();
			codeViewMap.put(codId, new AtomicInteger(0));
			return viewCount;
		} catch (NullPointerException e) {
			return 0;
		}
	}

	/**
	 * 代码分享好评次数加1
	 * 
	 * @param codId 代码分享标识
	 */
	static void addCodeGood(int codeId) {
		if (codeGoodMap.get(codeId) != null) {
			codeGoodMap.get(codeId).addAndGet(1);
		} else {
			codeGoodMap.put(codeId, new AtomicInteger(1));
		}

	}

	/**
	 * 代码分享好评次数重置，返回当前值
	 * 
	 * @param codId 代码分享标识
	 */
	public static int getAndResetCodeGood(int codId) {
		try {
			synchronized (codeGoodMap) {
				int goodCount = codeGoodMap.get(codId).get();
				codeGoodMap.put(codId, new AtomicInteger(0));
				return goodCount;
			}
		} catch (NullPointerException e) {
			return 0;
		}
	}

	/**
	 * 代码分享差评次数加1
	 * 
	 * @param codId 代码分享标识
	 */
	static void addCodeBad(int codeId) {
		if (codeBadMap.get(codeId) != null) {
			codeBadMap.get(codeId).addAndGet(1);
		} else {
			codeBadMap.put(codeId, new AtomicInteger(1));
		}

	}

	/**
	 * 代码分享差评次数重置，返回当前值
	 * 
	 * @param codId 代码分享标识
	 */
	public static int getAndResetCodeBad(int codId) {
		int badCount = codeBadMap.get(codId).get();
		codeBadMap.put(codId, new AtomicInteger(0));
		return badCount;
	}
}
