package org.core.model;

public class BegincodeVersion {
    private Integer begincodeVersionId;

    private String version;

    public Integer getBegincodeVersionId() {
        return begincodeVersionId;
    }

    public void setBegincodeVersionId(Integer begincodeVersionId) {
        this.begincodeVersionId = begincodeVersionId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }
}