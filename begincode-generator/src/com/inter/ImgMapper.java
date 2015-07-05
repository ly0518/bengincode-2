package com.inter;

import com.model.Img;

public interface ImgMapper {
    int insert(Img record);

    int insertSelective(Img record);
}