package org.begincode.core.mapper;

import java.util.List;

import org.begincode.core.model.CodeType;

public interface CodeTypeMapper {
    int deleteByPrimaryKey(Integer codeTypeId);

    int insert(CodeType record);

    int insertSelective(CodeType record);

    CodeType selectByPrimaryKey(Integer codeTypeId);

    int updateByPrimaryKeySelective(CodeType record);

    int updateByPrimaryKey(CodeType record);
    
    List<CodeType> selectAllByUserId(Integer userId);
}