package org.begincode.core.model;

import java.io.Serializable;

/**
 * @ClassName: CourseKeynote
 * @Description: 教程重点内容Bean
 * @author liutao
 * @date 2015年7月28日 上午11:34:04
 *
 */
public class CourseKeynote extends BaseModel implements Serializable {

	private static final long serialVersionUID = 6015076442612072793L;
	/** 主键id */
	private Integer courseKeynoteId;
	/** 视频教程章节主键id */
	private Integer videoCourseChapterId;
	/** 重点内容 */
	private String courseKeynoteContent;

	public CourseKeynote() {
		super();
	}

	/**
	 * @param courseKeynoteId
	 * @param videoCourseChapterId
	 * @param courseKeynoteContent
	 */
	public CourseKeynote(Integer courseKeynoteId, Integer videoCourseChapterId,
			String courseKeynoteContent) {
		super();
		this.courseKeynoteId = courseKeynoteId;
		this.videoCourseChapterId = videoCourseChapterId;
		this.courseKeynoteContent = courseKeynoteContent;
	}

	public Integer getCourseKeynoteId() {
		return courseKeynoteId;
	}

	public void setCourseKeynoteId(Integer courseKeynoteId) {
		this.courseKeynoteId = courseKeynoteId;
	}

	public Integer getVideoCourseChapterId() {
		return videoCourseChapterId;
	}

	public void setVideoCourseChapterId(Integer videoCourseChapterId) {
		this.videoCourseChapterId = videoCourseChapterId;
	}

	public String getCourseKeynoteContent() {
		return courseKeynoteContent;
	}

	public void setCourseKeynoteContent(String courseKeynoteContent) {
		this.courseKeynoteContent = courseKeynoteContent == null ? null
				: courseKeynoteContent.trim();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CourseKeynote [courseKeynoteId=" + courseKeynoteId
				+ ", videoCourseChapterId=" + videoCourseChapterId
				+ ", courseKeynoteContent=" + courseKeynoteContent + "]";
	}

}