package com.cdp.blog.dao;

import com.cdp.common.model.Blog;

import java.util.List;

/**
 * Created by xiaohu on 2017/1/3.
 */
public interface BlogDao {

    public List<Blog> getBlogList();

    public Blog getBlogDetail(int blogId);
}
