package org.begincode.core.model;

import java.io.Serializable;

public class CourseType extends BaseModel implements Serializable {

	private static final long serialVersionUID = -1282670940942802031L;

	private Integer courseTypeId;

	private String courseTypeName;

	private String deleteFlag;

	public CourseType() {
		super();
	}

	/**
	 * @param courseTypeId
	 * @param courseTypeName
	 * @param deleteFlag
	 */
	public CourseType(Integer courseTypeId, String courseTypeName,
			String deleteFlag) {
		super();
		this.courseTypeId = courseTypeId;
		this.courseTypeName = courseTypeName;
		this.deleteFlag = deleteFlag;
	}

	public Integer getCourseTypeId() {
		return courseTypeId;
	}

	public void setCourseTypeId(Integer courseTypeId) {
		this.courseTypeId = courseTypeId;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CourseType [courseTypeId=" + courseTypeId + ", courseTypeName="
				+ courseTypeName + ", deleteFlag=" + deleteFlag + "]";
	}

}