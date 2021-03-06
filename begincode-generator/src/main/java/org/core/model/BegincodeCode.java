package org.core.model;

import java.util.Date;

public class BegincodeCode {
    private Integer begincodeCodeCodeId;

    private String codeInfo;

    private String codeDownloadUrl;

    private String prohibitionMessage;

    private String begincodeKeys;

    private Integer viewCount;

    private Integer begincodeNavigationId;

    private Integer bcNavigationId;

    private Date createDatetime;

    private String deleteFlag;

    private Integer goodCount;

    private Integer badCount;

    private Integer codeTypeId;

    private String releaseState;

    private String checkFlag;

    private String codeTypeName;

    private String codeContent;

    public Integer getBegincodeCodeCodeId() {
        return begincodeCodeCodeId;
    }

    public void setBegincodeCodeCodeId(Integer begincodeCodeCodeId) {
        this.begincodeCodeCodeId = begincodeCodeCodeId;
    }

    public String getCodeInfo() {
        return codeInfo;
    }

    public void setCodeInfo(String codeInfo) {
        this.codeInfo = codeInfo == null ? null : codeInfo.trim();
    }

    public String getCodeDownloadUrl() {
        return codeDownloadUrl;
    }

    public void setCodeDownloadUrl(String codeDownloadUrl) {
        this.codeDownloadUrl = codeDownloadUrl == null ? null : codeDownloadUrl.trim();
    }

    public String getProhibitionMessage() {
        return prohibitionMessage;
    }

    public void setProhibitionMessage(String prohibitionMessage) {
        this.prohibitionMessage = prohibitionMessage == null ? null : prohibitionMessage.trim();
    }

    public String getBegincodeKeys() {
        return begincodeKeys;
    }

    public void setBegincodeKeys(String begincodeKeys) {
        this.begincodeKeys = begincodeKeys == null ? null : begincodeKeys.trim();
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getBegincodeNavigationId() {
        return begincodeNavigationId;
    }

    public void setBegincodeNavigationId(Integer begincodeNavigationId) {
        this.begincodeNavigationId = begincodeNavigationId;
    }

    public Integer getBcNavigationId() {
        return bcNavigationId;
    }

    public void setBcNavigationId(Integer bcNavigationId) {
        this.bcNavigationId = bcNavigationId;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
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

    public Integer getCodeTypeId() {
        return codeTypeId;
    }

    public void setCodeTypeId(Integer codeTypeId) {
        this.codeTypeId = codeTypeId;
    }

    public String getReleaseState() {
        return releaseState;
    }

    public void setReleaseState(String releaseState) {
        this.releaseState = releaseState == null ? null : releaseState.trim();
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag == null ? null : checkFlag.trim();
    }

    public String getCodeTypeName() {
        return codeTypeName;
    }

    public void setCodeTypeName(String codeTypeName) {
        this.codeTypeName = codeTypeName == null ? null : codeTypeName.trim();
    }

    public String getCodeContent() {
        return codeContent;
    }

    public void setCodeContent(String codeContent) {
        this.codeContent = codeContent == null ? null : codeContent.trim();
    }
}