package com.cdp.blog.service;

import com.cdp.blog.model.PlaBlog;

import java.util.List;

/**
 * Created by xiaohu on 2017/1/3.
 */
public interface BlogService {

    public List<PlaBlog> getBlogList();

    public PlaBlog getBlogDetail(int blogId);
}
