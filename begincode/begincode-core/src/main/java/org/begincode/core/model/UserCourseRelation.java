package org.begincode.core.model;

import java.io.Serializable;

public class UserCourseRelation extends BaseModel implements Serializable {

	private static final long serialVersionUID = -6821271284553147351L;

	private Integer userCourseRelationId;

	private Integer begincodeUserId;

	private Integer begincodeCourseId;

	private String deleteFlag;

	public UserCourseRelation() {
		super();
	}

	/**
	 * @param userCourseRelationId
	 * @param begincodeUserId
	 * @param begincodeCourseId
	 * @param deleteFlag
	 */
	public UserCourseRelation(Integer userCourseRelationId,
			Integer begincodeUserId, Integer begincodeCourseId,
			String deleteFlag) {
		super();
		this.userCourseRelationId = userCourseRelationId;
		this.begincodeUserId = begincodeUserId;
		this.begincodeCourseId = begincodeCourseId;
		this.deleteFlag = deleteFlag;
	}

	public Integer getUserCourseRelationId() {
		return userCourseRelationId;
	}

	public void setUserCourseRelationId(Integer userCourseRelationId) {
		this.userCourseRelationId = userCourseRelationId;
	}

	public Integer getBegincodeUserId() {
		return begincodeUserId;
	}

	public void setBegincodeUserId(Integer begincodeUserId) {
		this.begincodeUserId = begincodeUserId;
	}

	public Integer getBegincodeCourseId() {
		return begincodeCourseId;
	}

	public void setBegincodeCourseId(Integer begincodeCourseId) {
		this.begincodeCourseId = begincodeCourseId;
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
		return "UserCourseRelation [userCourseRelationId="
				+ userCourseRelationId + ", begincodeUserId=" + begincodeUserId
				+ ", begincodeCourseId=" + begincodeCourseId + ", deleteFlag="
				+ deleteFlag + "]";
	}

}