package org.begincode.core.model;

public class CourseLabel extends BaseModel{
    private Integer courseLabelId;

    private String courseTypeName;

    private String deleteFlag;

    private Integer labelCourseCount;


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
        this.courseTypeName = courseTypeName == null ? null : courseTypeName.trim();
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

}