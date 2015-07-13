package org.begincode.core.model;

public class ProjectStageDetail extends BaseModel{
    private Integer projectStageContentId;

    private Integer projectStageId;

    private String projectStageContent;

    public Integer getProjectStageContentId() {
        return projectStageContentId;
    }

    public void setProjectStageContentId(Integer projectStageContentId) {
        this.projectStageContentId = projectStageContentId;
    }

    public Integer getProjectStageId() {
        return projectStageId;
    }

    public void setProjectStageId(Integer projectStageId) {
        this.projectStageId = projectStageId;
    }

    public String getProjectStageContent() {
        return projectStageContent;
    }

    public void setProjectStageContent(String projectStageContent) {
        this.projectStageContent = projectStageContent == null ? null : projectStageContent.trim();
    }
}