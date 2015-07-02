package org.course.inter;

import org.course.model.Img;

public interface ImgMapper {
    int insert(Img record);

    int insertSelective(Img record);
}