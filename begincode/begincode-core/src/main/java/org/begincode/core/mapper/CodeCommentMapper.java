package org.begincode.core.mapper;

import java.util.List;

import org.begincode.core.model.CodeComment;

public interface CodeCommentMapper {
    int deleteByPrimaryKey(Integer codeCommentId);

    int insert(CodeComment record);

    int insertSelective(CodeComment record);

    CodeComment selectByPrimaryKey(Integer codeCommentId);

    int updateByPrimaryKeySelective(CodeComment record);

    int updateByPrimaryKey(CodeComment record);
    
    List<CodeComment> selectByCodeId(Integer codeId);
}