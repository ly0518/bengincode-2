package org.begincode.core.model;

import java.util.Date;

public class ProjectStageComment {
    private Integer projectStageCommentId;

    private Date createDatetime;

    private String commentMemo;

    private String nickname;

    private String pic;

    private String commentStatus;

    private Integer orderNumber;

    private Integer begincodeUserId;

    private Integer projectStageId;

    public Integer getProjectStageCommentId() {
        return projectStageCommentId;
    }

    public void setProjectStageCommentId(Integer projectStageCommentId) {
        this.projectStageCommentId = projectStageCommentId;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getCommentMemo() {
        return commentMemo;
    }

    public void setCommentMemo(String commentMemo) {
        this.commentMemo = commentMemo == null ? null : commentMemo.trim();
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

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getBegincodeUserId() {
        return begincodeUserId;
    }

    public void setBegincodeUserId(Integer begincodeUserId) {
        this.begincodeUserId = begincodeUserId;
    }

    public Integer getProjectStageId() {
        return projectStageId;
    }

    public void setProjectStageId(Integer projectStageId) {
        this.projectStageId = projectStageId;
    }
}