package org.core.mapper;

import org.core.model.CodeComment;

public interface CodeCommentMapper {
    int deleteByPrimaryKey(Integer codeCommentId);

    int insert(CodeComment record);

    int insertSelective(CodeComment record);

    CodeComment selectByPrimaryKey(Integer codeCommentId);

    int updateByPrimaryKeySelective(CodeComment record);

    int updateByPrimaryKey(CodeComment record);
}