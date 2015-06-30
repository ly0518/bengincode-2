package com.inter;

import com.model.Img;
import com.model.ImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImgMapper {
    int countByExample(ImgExample example);

    int deleteByExample(ImgExample example);

    int insert(Img record);

    int insertSelective(Img record);

    List<Img> selectByExample(ImgExample example);

    int updateByExampleSelective(@Param("record") Img record, @Param("example") ImgExample example);

    int updateByExample(@Param("record") Img record, @Param("example") ImgExample example);
}