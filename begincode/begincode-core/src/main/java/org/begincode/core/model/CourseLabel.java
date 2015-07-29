package org.begincode.core.model;

import java.io.Serializable;

/**
 * @ClassName: CourseLabel
 * @Description: 教程标签分类
 * @author liutao
 * @date 2015年7月28日 上午11:39:29
 *
 */
public class CourseLabel extends BaseModel implements Serializable {

	private static final long serialVersionUID = -1389279488273772525L;
	/** 主键id */
	private Integer courseLabelId;
	/** 类型名称 */
	private String courseTypeName;
	/** 是否删除标识（1：可用 0：删除） */
	private String deleteFlag;
	/** 标签内文章数 */
	private Integer labelCourseCount;

	public CourseLabel() {
		super();
	}

	/**
	 * @param courseLabelId
	 * @param courseTypeName
	 * @param deleteFlag
	 * @param labelCourseCount
	 */
	public CourseLabel(Integer courseLabelId, String courseTypeName,
			String deleteFlag, Integer labelCourseCount) {
		super();
		this.courseLabelId = courseLabelId;
		this.courseTypeName = courseTypeName;
		this.deleteFlag = deleteFlag;
		this.labelCourseCount = labelCourseCount;
	}

	public Integer getCourseLabelId() {
		return courseLabelId;
	}

	public void setCourseLabelId(Integer courseLabelId) {
		this.courseLabelId = courseLabelId;
	}

	public String getCourseTypeName() {
		return courseTypeName;
	}

	public void setCourseTypeName(String courseTypeName) {
		this.courseTypeName = courseTypeName == null ? null : courseTypeName
				.trim();
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
	}

	public Integer getLabelCourseCount() {
		return labelCourseCount;
	}

	public void setLabelCourseCount(Integer labelCourseCount) {
		this.labelCourseCount = labelCourseCount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CourseLabel [courseLabelId=" + courseLabelId
				+ ", courseTypeName=" + courseTypeName + ", deleteFlag="
				+ deleteFlag + ", labelCourseCount=" + labelCourseCount + "]";
	}

}