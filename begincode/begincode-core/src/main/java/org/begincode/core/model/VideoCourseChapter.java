package org.begincode.core.model;

import java.io.Serializable;

/**
 * @ClassName: VideoCourseChapter
 * @Description: 视频教程章节
 * @author liutao
 * @date 2015年7月29日 下午3:27:24
 *
 */
public class VideoCourseChapter extends BaseModel implements Serializable {

	private static final long serialVersionUID = -5925930501386425691L;

	/** 主键id */
	private Integer videoCourseChapterId;
	/** 章节简介 */
	private String videoCourseChapterMemo;
	/** 章节视频url */
	private String chapterVideoUrl;
	/** 查看数 */
	private Integer viewCount;
	/** 章节号（如第一讲，第二讲） */
	private String videoCourseChapterOrder;
	/** 站内标签 */
	private String begincodeKeys;
	/** 1可以流言 0禁止 */
	private String prohibitionMessage;
	/** 外键id */
	private Integer begincodeCourseId;
	/** 好评数 */
	private Integer goodCount;
	/** 差评数 */
	private Integer badCount;
	/** 删除标识 */
	private String deleteFlag;
	/** 代码下载地址 */
	private String chapterCodeDownUrl;
	/** 发布状态（1已发布，0未发布） */
	private String releaseState;
	/** 教程名称 */
	private String courseName;

	public VideoCourseChapter() {
		super();
	}

	/**
	 * @param videoCourseChapterId
	 * @param videoCourseChapterMemo
	 * @param chapterVideoUrl
	 * @param viewCount
	 * @param videoCourseChapterOrder
	 * @param begincodeKeys
	 * @param prohibitionMessage
	 * @param begincodeCourseId
	 * @param goodCount
	 * @param badCount
	 * @param deleteFlag
	 * @param chapterCodeDownUrl
	 * @param releaseState
	 * @param courseName
	 */
	public VideoCourseChapter(Integer videoCourseChapterId,
			String videoCourseChapterMemo, String chapterVideoUrl,
			Integer viewCount, String videoCourseChapterOrder,
			String begincodeKeys, String prohibitionMessage,
			Integer begincodeCourseId, Integer goodCount, Integer badCount,
			String deleteFlag, String chapterCodeDownUrl, String releaseState,
			String courseName) {
		super();
		this.videoCourseChapterId = videoCourseChapterId;
		this.videoCourseChapterMemo = videoCourseChapterMemo;
		this.chapterVideoUrl = chapterVideoUrl;
		this.viewCount = viewCount;
		this.videoCourseChapterOrder = videoCourseChapterOrder;
		this.begincodeKeys = begincodeKeys;
		this.prohibitionMessage = prohibitionMessage;
		this.begincodeCourseId = begincodeCourseId;
		this.goodCount = goodCount;
		this.badCount = badCount;
		this.deleteFlag = deleteFlag;
		this.chapterCodeDownUrl = chapterCodeDownUrl;
		this.releaseState = releaseState;
		this.courseName = courseName;
	}

	public Integer getVideoCourseChapterId() {
		return videoCourseChapterId;
	}

	public void setVideoCourseChapterId(Integer videoCourseChapterId) {
		this.videoCourseChapterId = videoCourseChapterId;
	}

	public String getVideoCourseChapterMemo() {
		return videoCourseChapterMemo;
	}

	public void setVideoCourseChapterMemo(String videoCourseChapterMemo) {
		this.videoCourseChapterMemo = videoCourseChapterMemo == null ? null
				: videoCourseChapterMemo.trim();
	}

	public String getChapterVideoUrl() {
		return chapterVideoUrl;
	}

	public void setChapterVideoUrl(String chapterVideoUrl) {
		this.chapterVideoUrl = chapterVideoUrl == null ? null : chapterVideoUrl
				.trim();
	}

	public Integer getViewCount() {
		return viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public String getVideoCourseChapterOrder() {
		return videoCourseChapterOrder;
	}

	public void setVideoCourseChapterOrder(String videoCourseChapterOrder) {
		this.videoCourseChapterOrder = videoCourseChapterOrder == null ? null
				: videoCourseChapterOrder.trim();
	}

	public String getBegincodeKeys() {
		return begincodeKeys;
	}

	public void setBegincodeKeys(String begincodeKeys) {
		this.begincodeKeys = begincodeKeys == null ? null : begincodeKeys
				.trim();
	}

	public String getProhibitionMessage() {
		return prohibitionMessage;
	}

	public void setProhibitionMessage(String prohibitionMessage) {
		this.prohibitionMessage = prohibitionMessage == null ? null
				: prohibitionMessage.trim();
	}

	public Integer getBegincodeCourseId() {
		return begincodeCourseId;
	}

	public void setBegincodeCourseId(Integer begincodeCourseId) {
		this.begincodeCourseId = begincodeCourseId;
	}

	public Integer getGoodCount() {
		return goodCount;
	}

	public void setGoodCount(Integer goodCount) {
		this.goodCount = goodCount;
	}

	public Integer getBadCount() {
		return badCount;
	}

	public void setBadCount(Integer badCount) {
		this.badCount = badCount;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
	}

	public String getChapterCodeDownUrl() {
		return chapterCodeDownUrl;
	}

	public void setChapterCodeDownUrl(String chapterCodeDownUrl) {
		this.chapterCodeDownUrl = chapterCodeDownUrl == null ? null
				: chapterCodeDownUrl.trim();
	}

	public String getReleaseState() {
		return releaseState;
	}

	public void setReleaseState(String releaseState) {
		this.releaseState = releaseState == null ? null : releaseState.trim();
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName == null ? null : courseName.trim();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VideoCourseChapter [videoCourseChapterId="
				+ videoCourseChapterId + ", videoCourseChapterMemo="
				+ videoCourseChapterMemo + ", chapterVideoUrl="
				+ chapterVideoUrl + ", viewCount=" + viewCount
				+ ", videoCourseChapterOrder=" + videoCourseChapterOrder
				+ ", begincodeKeys=" + begincodeKeys + ", prohibitionMessage="
				+ prohibitionMessage + ", begincodeCourseId="
				+ begincodeCourseId + ", goodCount=" + goodCount
				+ ", badCount=" + badCount + ", deleteFlag=" + deleteFlag
				+ ", chapterCodeDownUrl=" + chapterCodeDownUrl
				+ ", releaseState=" + releaseState + ", courseName="
				+ courseName + "]";
	}

}