package org.core.mapper;

import org.core.model.ProjectStage;

public interface ProjectStageMapper {
    int deleteByPrimaryKey(Integer projectStageId);

    int insert(ProjectStage record);

    int insertSelective(ProjectStage record);

    ProjectStage selectByPrimaryKey(Integer projectStageId);

    int updateByPrimaryKeySelective(ProjectStage record);

    int updateByPrimaryKeyWithBLOBs(ProjectStage record);

    int updateByPrimaryKey(ProjectStage record);
}