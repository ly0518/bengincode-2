package org.begincode.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: CourseComment
 * @Description: 教程评论
 * @author liutao
 * @date 2015年7月29日 下午3:22:44
 *
 */
public class CourseComment extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1916871294783108057L;

	/** 主键 */
	private Integer courseCommentId;
	/** 评论内容 */
	private String courseCommentContent;
	/** 创建时间 */
	private Date createDatatime;
	/** 用户id */
	private Integer begincodeUserId;
	/** 昵称 */
	private String nickname;
	/** 头像 */
	private String pic;
	/** 状态 */
	private String commentStatus;
	/** 视频课程章节主键id */
	private Integer videoCourseChapterId;
	/** 审核标识 */
	private String checkFlag;

	public CourseComment() {
		super();
	}

	/**
	 * @param courseCommentId
	 * @param courseCommentContent
	 * @param createDatatime
	 * @param begincodeUserId
	 * @param nickname
	 * @param pic
	 * @param commentStatus
	 * @param videoCourseChapterId
	 * @param checkFlag
	 */
	public CourseComment(Integer courseCommentId, String courseCommentContent,
			Date createDatatime, Integer begincodeUserId, String nickname,
			String pic, String commentStatus, Integer videoCourseChapterId,
			String checkFlag) {
		super();
		this.courseCommentId = courseCommentId;
		this.courseCommentContent = courseCommentContent;
		this.createDatatime = createDatatime;
		this.begincodeUserId = begincodeUserId;
		this.nickname = nickname;
		this.pic = pic;
		this.commentStatus = commentStatus;
		this.videoCourseChapterId = videoCourseChapterId;
		this.checkFlag = checkFlag;
	}

	public Integer getCourseCommentId() {
		return courseCommentId;
	}

	public void setCourseCommentId(Integer courseCommentId) {
		this.courseCommentId = courseCommentId;
	}

	public String getCourseCommentContent() {
		return courseCommentContent;
	}

	public void setCourseCommentContent(String courseCommentContent) {
		this.courseCommentContent = courseCommentContent == null ? null
				: courseCommentContent.trim();
	}

	public Date getCreateDatatime() {
		return createDatatime;
	}

	public void setCreateDatatime(Date createDatatime) {
		this.createDatatime = createDatatime;
	}

	public Integer getBegincodeUserId() {
		return begincodeUserId;
	}

	public void setBegincodeUserId(Integer begincodeUserId) {
		this.begincodeUserId = begincodeUserId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname == null ? null : nickname.trim();
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic == null ? null : pic.trim();
	}

	public String getCommentStatus() {
		return commentStatus;
	}

	public void setCommentStatus(String commentStatus) {
		this.commentStatus = commentStatus == null ? null : commentStatus
				.trim();
	}

	public Integer getVideoCourseChapterId() {
		return videoCourseChapterId;
	}

	public void setVideoCourseChapterId(Integer videoCourseChapterId) {
		this.videoCourseChapterId = videoCourseChapterId;
	}

	public String getCheckFlag() {
		return checkFlag;
	}

	public void setCheckFlag(String checkFlag) {
		this.checkFlag = checkFlag == null ? null : checkFlag.trim();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CourseComment [courseCommentId=" + courseCommentId
				+ ", courseCommentContent=" + courseCommentContent
				+ ", createDatatime=" + createDatatime + ", begincodeUserId="
				+ begincodeUserId + ", nickname=" + nickname + ", pic=" + pic
				+ ", commentStatus=" + commentStatus
				+ ", videoCourseChapterId=" + videoCourseChapterId
				+ ", checkFlag=" + checkFlag + "]";
	}

}