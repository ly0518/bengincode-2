package org.core.model;

public class BegincodeInfo {
    private Integer begincodeInfoId;

    private String begincodeInfoContent;

    public Integer getBegincodeInfoId() {
        return begincodeInfoId;
    }

    public void setBegincodeInfoId(Integer begincodeInfoId) {
        this.begincodeInfoId = begincodeInfoId;
    }

    public String getBegincodeInfoContent() {
        return begincodeInfoContent;
    }

    public void setBegincodeInfoContent(String begincodeInfoContent) {
        this.begincodeInfoContent = begincodeInfoContent == null ? null : begincodeInfoContent.trim();
    }
}