package com.cdp.blog.dao;


import com.cdp.blog.model.PlaBlog;

import java.util.List;

public interface PlaBlogMapper {
    int deleteByPrimaryKey(Integer plaBlogId);

    int insert(PlaBlog record);

    int insertSelective(PlaBlog record);

    PlaBlog selectByPrimaryKey(Integer plaBlogId);

    int updateByPrimaryKeySelective(PlaBlog record);

    int updateByPrimaryKeyWithBLOBs(PlaBlog record);

    int updateByPrimaryKey(PlaBlog record);

    List<PlaBlog> getBlogList();

}