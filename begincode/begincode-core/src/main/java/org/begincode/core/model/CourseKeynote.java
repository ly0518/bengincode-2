package org.begincode.core.model;

public class CourseKeynote extends BaseModel{
    private Integer courseKeynoteId;

    private Integer videoCourseChapterId;

    private String courseKeynoteContent;

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
        this.courseKeynoteContent = courseKeynoteContent == null ? null : courseKeynoteContent.trim();
    }
}