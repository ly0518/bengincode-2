package org.core.model;

import java.util.Date;

public class ProjectStage {
    private Integer projectStageId;

    private String stageName;

    private String stageAbstract;

    private String videoUrl;

    private Date createDatetime;

    private Integer begincodeProjectId;

    private Integer viewCount;

    private String releaseState;

    private Integer goodCount;

    private Integer badCount;

    private Integer begincodeUserId;

    private String nickname;

    private String pic;

    private String stageContent;

    public Integer getProjectStageId() {
        return projectStageId;
    }

    public void setProjectStageId(Integer projectStageId) {
        this.projectStageId = projectStageId;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName == null ? null : stageName.trim();
    }

    public String getStageAbstract() {
        return stageAbstract;
    }

    public void setStageAbstract(String stageAbstract) {
        this.stageAbstract = stageAbstract == null ? null : stageAbstract.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Integer getBegincodeProjectId() {
        return begincodeProjectId;
    }

    public void setBegincodeProjectId(Integer begincodeProjectId) {
        this.begincodeProjectId = begincodeProjectId;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public String getReleaseState() {
        return releaseState;
    }

    public void setReleaseState(String releaseState) {
        this.releaseState = releaseState == null ? null : releaseState.trim();
    }

    public Integer getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(Integer goodCount) {
        this.goodCount = goodCount;
    }

    public Integer getBadCount() {
        return badCount;
    }

    public void setBadCount(Integer badCount) {
        this.badCount = badCount;
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

    public String getStageContent() {
        return stageContent;
    }

    public void setStageContent(String stageContent) {
        this.stageContent = stageContent == null ? null : stageContent.trim();
    }
}