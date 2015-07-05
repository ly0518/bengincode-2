package org.core.model;

public class BegincodeManager {
    private Integer begincodeManagerId;

    private String managerPicUrl;

    private String deleteFlag;

    private Integer begincodeUserId;

    private String mangerIntroduce;

    public Integer getBegincodeManagerId() {
        return begincodeManagerId;
    }

    public void setBegincodeManagerId(Integer begincodeManagerId) {
        this.begincodeManagerId = begincodeManagerId;
    }

    public String getManagerPicUrl() {
        return managerPicUrl;
    }

    public void setManagerPicUrl(String managerPicUrl) {
        this.managerPicUrl = managerPicUrl == null ? null : managerPicUrl.trim();
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public Integer getBegincodeUserId() {
        return begincodeUserId;
    }

    public void setBegincodeUserId(Integer begincodeUserId) {
        this.begincodeUserId = begincodeUserId;
    }

    public String getMangerIntroduce() {
        return mangerIntroduce;
    }

    public void setMangerIntroduce(String mangerIntroduce) {
        this.mangerIntroduce = mangerIntroduce == null ? null : mangerIntroduce.trim();
    }
}