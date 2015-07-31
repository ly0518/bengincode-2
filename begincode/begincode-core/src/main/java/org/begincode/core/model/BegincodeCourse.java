package org.begincode.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: BegincodeCourse
 * @Description: 教程bean
 * @author liutao
 * @date 2015年7月29日 下午3:46:33
 *
 */
public class BegincodeCourse extends BaseModel implements Serializable {

	private static final long serialVersionUID = 5877214983114804836L;

	/** 主键Id */
	private Integer begincodeCourseId;
	/** 教程名称 */
	private String courseName;
	/** 教程图标 */
	private String coursePicUrl;
	/** 教程简介 */
	private String introduction;
	/** 推荐（1推荐，0没有） */
	private String recommend;
	/** 标签id */
	private Integer courseLabelId;
	/** 关注数 */
	private Integer attentionCount;
	/** 课程类型id */
	private Integer courseTypeId;
	/** 用户id */
	private Integer begincodeUserId;
	/** 出品人简介 */
	private String producerIntroduction;
	/** 完结状态（1完结，0未完结） */
	private String completionStatus;
	/** 网站导航Id */
	private Integer begincodeNavigationId;
	/** 删除标识 */
	private String deleteFlag;
	/** 课程类型名称 */
	private String courseTypeName;
	/** 创建时间 */
	private Date createTime;

	public BegincodeCourse() {
		super();
	}

	/**
	 * @param begincodeCourseId
	 * @param courseName
	 * @param coursePicUrl
	 * @param introduction
	 * @param recommend
	 * @param courseLabelId
	 * @param attentionCount
	 * @param courseTypeId
	 * @param begincodeUserId
	 * @param producerIntroduction
	 * @param completionStatus
	 * @param begincodeNavigationId
	 * @param deleteFlag
	 * @param courseTypeName
	 * @param createTime
	 */
	public BegincodeCourse(Integer begincodeCourseId, String courseName, String coursePicUrl, String introduction, String recommend, Integer courseLabelId,
			Integer attentionCount, Integer courseTypeId, Integer begincodeUserId, String producerIntroduction, String completionStatus,
			Integer begincodeNavigationId, String deleteFlag, String courseTypeName, Date createTime) {
		super();
		this.begincodeCourseId = begincodeCourseId;
		this.courseName = courseName;
		this.coursePicUrl = coursePicUrl;
		this.introduction = introduction;
		this.recommend = recommend;
		this.courseLabelId = courseLabelId;
		this.attentionCount = attentionCount;
		this.courseTypeId = courseTypeId;
		this.begincodeUserId = begincodeUserId;
		this.producerIntroduction = producerIntroduction;
		this.completionStatus = completionStatus;
		this.begincodeNavigationId = begincodeNavigationId;
		this.deleteFlag = deleteFlag;
		this.courseTypeName = courseTypeName;
		this.createTime = createTime;
	}

	public Integer getBegincodeCourseId() {
		return begincodeCourseId;
	}

	public void setBegincodeCourseId(Integer begincodeCourseId) {
		this.begincodeCourseId = begincodeCourseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName == null ? null : courseName.trim();
	}

	public String getCoursePicUrl() {
		return coursePicUrl;
	}

	public void setCoursePicUrl(String coursePicUrl) {
		this.coursePicUrl = coursePicUrl == null ? null : coursePicUrl.trim();
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction == null ? null : introduction.trim();
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend == null ? null : recommend.trim();
	}

	public Integer getCourseLabelId() {
		return courseLabelId;
	}

	public void setCourseLabelId(Integer courseLabelId) {
		this.courseLabelId = courseLabelId;
	}

	public Integer getAttentionCount() {
		return attentionCount;
	}

	public void setAttentionCount(Integer attentionCount) {
		this.attentionCount = attentionCount;
	}

	public Integer getCourseTypeId() {
		return courseTypeId;
	}

	public void setCourseTypeId(Integer courseTypeId) {
		this.courseTypeId = courseTypeId;
	}

	public Integer getBegincodeUserId() {
		return begincodeUserId;
	}

	public void setBegincodeUserId(Integer begincodeUserId) {
		this.begincodeUserId = begincodeUserId;
	}

	public String getProducerIntroduction() {
		return producerIntroduction;
	}

	public void setProducerIntroduction(String producerIntroduction) {
		this.producerIntroduction = producerIntroduction == null ? null : producerIntroduction.trim();
	}

	public String getCompletionStatus() {
		return completionStatus;
	}

	public void setCompletionStatus(String completionStatus) {
		this.completionStatus = completionStatus == null ? null : completionStatus.trim();
	}

	public Integer getBegincodeNavigationId() {
		return begincodeNavigationId;
	}

	public void setBegincodeNavigationId(Integer begincodeNavigationId) {
		this.begincodeNavigationId = begincodeNavigationId;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
	}

	public String getCourseTypeName() {
		return courseTypeName;
	}

	public void setCourseTypeName(String courseTypeName) {
		this.courseTypeName = courseTypeName == null ? null : courseTypeName.trim();
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BegincodeCourse [begincodeCourseId=" + begincodeCourseId + ", courseName=" + courseName + ", coursePicUrl=" + coursePicUrl + ", introduction="
				+ introduction + ", recommend=" + recommend + ", courseLabelId=" + courseLabelId + ", attentionCount=" + attentionCount + ", courseTypeId="
				+ courseTypeId + ", begincodeUserId=" + begincodeUserId + ", producerIntroduction=" + producerIntroduction + ", completionStatus="
				+ completionStatus + ", begincodeNavigationId=" + begincodeNavigationId + ", deleteFlag=" + deleteFlag + ", courseTypeName=" + courseTypeName
				+ ", createTime=" + createTime + "]";
	}

}