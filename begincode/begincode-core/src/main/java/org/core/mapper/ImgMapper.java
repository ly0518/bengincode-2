package org.core.mapper;

import org.core.model.Img;

public interface ImgMapper {
    int insert(Img record);

    int insertSelective(Img record);
}