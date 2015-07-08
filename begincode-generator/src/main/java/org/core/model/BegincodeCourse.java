package org.core.model;

public class BegincodeCourse {
    private Integer begincodeCourseId;

    private String courseName;

    private String coursePicUrl;

    private String introduction;

    private String recommend;

    private Integer courseLabelId;

    private Integer attentionCount;

    private Integer courseTypeId;

    private Integer begincodeUserId;

    private String producerIntroduction;

    private String completionStatus;

    private Integer begincodeNavigationId;

    private String deleteFlag1;

    private String courseTypeName;

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

    public String getDeleteFlag1() {
        return deleteFlag1;
    }

    public void setDeleteFlag1(String deleteFlag1) {
        this.deleteFlag1 = deleteFlag1 == null ? null : deleteFlag1.trim();
    }

    public String getCourseTypeName() {
        return courseTypeName;
    }

    public void setCourseTypeName(String courseTypeName) {
        this.courseTypeName = courseTypeName == null ? null : courseTypeName.trim();
    }
}