package org.begincode.core.model;

import java.util.Date;

public class CourseComment {
    private Integer courseCommentId;

    private String courseCommentContent;

    private Date createDatatime;

    private Integer begincodeUserId;

    private String nickname;

    private String pic;

    private String commentStatus;

    private Integer videoCourseChapterId;

    private String checkFlag;

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
        this.courseCommentContent = courseCommentContent == null ? null : courseCommentContent.trim();
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
        this.commentStatus = commentStatus == null ? null : commentStatus.trim();
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
}