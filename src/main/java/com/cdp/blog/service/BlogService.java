package com.cdp.blog.service;

import com.cdp.common.model.Blog;

import java.util.List;

/**
 * Created by xiaohu on 2017/1/3.
 */
public interface BlogService {

    public List<Blog> getBlogList();

    public Blog getBlogDetail(int blogId);
}
