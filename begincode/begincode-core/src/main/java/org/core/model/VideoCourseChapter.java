package org.core.model;

public class VideoCourseChapter {
    private Integer videoCourseChapterId;

    private String videoCourseChapterMemo;

    private String chapterVideoUrl;

    private Integer viewCount;

    private String videoCourseChapterOrder;

    private String begincodeKeys;

    private String prohibitionMessage;

    private Integer begincodeCourseId;

    private Integer goodCount;

    private Integer badCount;

    private String deleteFlag1;

    private String chapterCodeDownUrl;

    private String releaseState;

    private String courseName;

    public Integer getVideoCourseChapterId() {
        return videoCourseChapterId;
    }

    public void setVideoCourseChapterId(Integer videoCourseChapterId) {
        this.videoCourseChapterId = videoCourseChapterId;
    }

    public String getVideoCourseChapterMemo() {
        return videoCourseChapterMemo;
    }

    public void setVideoCourseChapterMemo(String videoCourseChapterMemo) {
        this.videoCourseChapterMemo = videoCourseChapterMemo == null ? null : videoCourseChapterMemo.trim();
    }

    public String getChapterVideoUrl() {
        return chapterVideoUrl;
    }

    public void setChapterVideoUrl(String chapterVideoUrl) {
        this.chapterVideoUrl = chapterVideoUrl == null ? null : chapterVideoUrl.trim();
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public String getVideoCourseChapterOrder() {
        return videoCourseChapterOrder;
    }

    public void setVideoCourseChapterOrder(String videoCourseChapterOrder) {
        this.videoCourseChapterOrder = videoCourseChapterOrder == null ? null : videoCourseChapterOrder.trim();
    }

    public String getBegincodeKeys() {
        return begincodeKeys;
    }

    public void setBegincodeKeys(String begincodeKeys) {
        this.begincodeKeys = begincodeKeys == null ? null : begincodeKeys.trim();
    }

    public String getProhibitionMessage() {
        return prohibitionMessage;
    }

    public void setProhibitionMessage(String prohibitionMessage) {
        this.prohibitionMessage = prohibitionMessage == null ? null : prohibitionMessage.trim();
    }

    public Integer getBegincodeCourseId() {
        return begincodeCourseId;
    }

    public void setBegincodeCourseId(Integer begincodeCourseId) {
        this.begincodeCourseId = begincodeCourseId;
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

    public String getDeleteFlag1() {
        return deleteFlag1;
    }

    public void setDeleteFlag1(String deleteFlag1) {
        this.deleteFlag1 = deleteFlag1 == null ? null : deleteFlag1.trim();
    }

    public String getChapterCodeDownUrl() {
        return chapterCodeDownUrl;
    }

    public void setChapterCodeDownUrl(String chapterCodeDownUrl) {
        this.chapterCodeDownUrl = chapterCodeDownUrl == null ? null : chapterCodeDownUrl.trim();
    }

    public String getReleaseState() {
        return releaseState;
    }

    public void setReleaseState(String releaseState) {
        this.releaseState = releaseState == null ? null : releaseState.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }
}