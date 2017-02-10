package com.cdp.user.service;

import com.cdp.common.model.Blog;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by xiaohu on 2016/12/24.
 */
public interface HomeService {

    public String homeTest();

    public String doLogin(HttpServletRequest request, HttpServletResponse response);

    public List<Blog> getUserBlogList(HttpServletRequest request, HttpServletResponse response);
}
