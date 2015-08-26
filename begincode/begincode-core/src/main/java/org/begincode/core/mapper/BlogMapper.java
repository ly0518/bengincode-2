package org.begincode.core.mapper;

import java.util.List;

import org.begincode.core.model.BegincodeCode;
import org.begincode.core.model.Blog;
import org.begincode.core.paginator.domain.PageList;

public interface BlogMapper {
    int deleteByPrimaryKey(Integer blogId);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer blogId);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKeyWithBLOBs(Blog record);

    int updateByPrimaryKey(Blog record);
    
    
    PageList<Blog> selectBySelective(Blog record);
    
//    int  selectBySelectiveCount(Blog record);
    
    PageList<Blog> selectAll();
    
    int updateAddCountById(Blog record);
    
    int batchUpdateAddCountById(List<Blog> blogList);
    
    Blog selectRecommendBlog();

}