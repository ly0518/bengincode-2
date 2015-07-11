package org.begincode.core.mapper;

import org.begincode.core.model.ProjectStageDetail;

public interface ProjectStageDetailMapper {
    int deleteByPrimaryKey(Integer projectStageContentId);

    int insert(ProjectStageDetail record);

    int insertSelective(ProjectStageDetail record);

    ProjectStageDetail selectByPrimaryKey(Integer projectStageContentId);

    int updateByPrimaryKeySelective(ProjectStageDetail record);

    int updateByPrimaryKeyWithBLOBs(ProjectStageDetail record);

    int updateByPrimaryKey(ProjectStageDetail record);
}