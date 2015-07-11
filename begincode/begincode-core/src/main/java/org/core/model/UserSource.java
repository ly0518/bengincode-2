package org.core.model;

public class UserSource {
    private Integer userSourceId;

    private String userSourceName;

    private String deleteFlag;

    public Integer getUserSourceId() {
        return userSourceId;
    }

    public void setUserSourceId(Integer userSourceId) {
        this.userSourceId = userSourceId;
    }

    public String getUserSourceName() {
        return userSourceName;
    }

    public void setUserSourceName(String userSourceName) {
        this.userSourceName = userSourceName == null ? null : userSourceName.trim();
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }
}