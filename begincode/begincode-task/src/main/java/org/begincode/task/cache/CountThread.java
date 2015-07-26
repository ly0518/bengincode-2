package org.begincode.task.cache;

import org.apache.log4j.Logger;

public class CountThread extends Thread {
	Logger logger = Logger.getLogger(CountThread.class);
	int codeId; 			// 对应字段标识
	String typeId; 			// 类型，查看CountCache 常量

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
			CountCache.addCodeBad(codeId);
			;
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
