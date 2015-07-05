package org.core.model;

public class UserSource {
    private Integer userSourceId;

    private String userSourceName;

    private String deleteFlag1;

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

    public String getDeleteFlag1() {
        return deleteFlag1;
    }

    public void setDeleteFlag1(String deleteFlag1) {
        this.deleteFlag1 = deleteFlag1 == null ? null : deleteFlag1.trim();
    }
}