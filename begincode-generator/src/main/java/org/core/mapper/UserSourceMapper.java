package org.core.mapper;

import org.core.model.UserSource;

public interface UserSourceMapper {
    int deleteByPrimaryKey(Integer userSourceId);

    int insert(UserSource record);

    int insertSelective(UserSource record);

    UserSource selectByPrimaryKey(Integer userSourceId);

    int updateByPrimaryKeySelective(UserSource record);

    int updateByPrimaryKey(UserSource record);
}