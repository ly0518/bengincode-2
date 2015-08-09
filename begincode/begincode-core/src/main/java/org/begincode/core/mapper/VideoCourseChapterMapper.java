package org.begincode.core.mapper;

import org.begincode.core.model.VideoCourseChapter;

/**
 * @ClassName: VideoCourseChapterMapper
 * @Description: TODO
 * @author liutao
 * @date 2015年7月27日 下午3:42:15
 *
 */
public interface VideoCourseChapterMapper {
	/**
	 * @Description: 根据videoCourseChapterId删除
	 * @param videoCourseChapterId
	 * @return int
	 * @throws
	 */
	int deleteById(Integer videoCourseChapterId);

	/**
	 * @Description: 新增VideoCourseChapter
	 * @param record
	 * @return int
	 * @throws
	 */
	int insert(VideoCourseChapter record);

	/**
	 * @Description: 新增参数中不为空的属�?
	 * @param record
	 * @return int
	 * @throws
	 */
	int insertSelective(VideoCourseChapter record);

	/**
	 * @Description: 根据videoCourseChapterId查询
	 * @param videoCourseChapterId
	 * @return VideoCourseChapter
	 * @throws
	 */
	VideoCourseChapter selectById(Integer videoCourseChapterId);

	/**
	 * 
	 * @Description: 更新参数中不为空的属�?
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateByIdWithSelective(VideoCourseChapter record);

	/**
	 * @Description: 更新VideoCourseChapter
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateById(VideoCourseChapter record);
	
	/**
	 * @Description: 更新VideoCourseChapter 浏览次数等
	 * 		新增最新浏览次数，点赞次数，差评次数 
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateAddCountById(VideoCourseChapter record);
}