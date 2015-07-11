package org.begincode.core.model;

public class UserCourseRelation {
    private Integer userCourseRelationId;

    private Integer begincodeUserId;

    private Integer begincodeCourseId;

    private String deleteFlag;

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
}