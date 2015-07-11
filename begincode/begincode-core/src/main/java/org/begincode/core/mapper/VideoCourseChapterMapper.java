package org.begincode.core.mapper;

import org.begincode.core.model.VideoCourseChapter;

public interface VideoCourseChapterMapper {
    int deleteByPrimaryKey(Integer videoCourseChapterId);

    int insert(VideoCourseChapter record);

    int insertSelective(VideoCourseChapter record);

    VideoCourseChapter selectByPrimaryKey(Integer videoCourseChapterId);

    int updateByPrimaryKeySelective(VideoCourseChapter record);

    int updateByPrimaryKey(VideoCourseChapter record);
}