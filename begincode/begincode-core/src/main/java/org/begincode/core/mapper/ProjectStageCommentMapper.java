package org.begincode.core.mapper;

import org.begincode.core.model.ProjectStageComment;

public interface ProjectStageCommentMapper {
    int deleteByPrimaryKey(Integer projectStageCommentId);

    int insert(ProjectStageComment record);

    int insertSelective(ProjectStageComment record);

    ProjectStageComment selectByPrimaryKey(Integer projectStageCommentId);

    int updateByPrimaryKeySelective(ProjectStageComment record);

    int updateByPrimaryKey(ProjectStageComment record);
}