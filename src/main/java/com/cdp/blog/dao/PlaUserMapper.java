package com.cdp.blog.dao;


import com.cdp.blog.model.PlaUser;

public interface PlaUserMapper {
    int deleteByPrimaryKey(Integer plaUserId);

    int insert(PlaUser record);

    int insertSelective(PlaUser record);

    PlaUser selectByPrimaryKey(Integer plaUserId);

    int updateByPrimaryKeySelective(PlaUser record);

    int updateByPrimaryKey(PlaUser record);
}