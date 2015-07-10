package org.core.mapper;

import org.core.model.CourseKeynote;

public interface CourseKeynoteMapper {
    int deleteByPrimaryKey(Integer courseKeynoteId);

    int insert(CourseKeynote record);

    int insertSelective(CourseKeynote record);

    CourseKeynote selectByPrimaryKey(Integer courseKeynoteId);

    int updateByPrimaryKeySelective(CourseKeynote record);

    int updateByPrimaryKeyWithBLOBs(CourseKeynote record);

    int updateByPrimaryKey(CourseKeynote record);
}