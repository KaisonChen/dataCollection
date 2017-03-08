package com.cdp.user.service;

import com.cdp.blog.model.PlaBlog;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by xiaohu on 2017/3/8.
 */
public interface UserService {

    public String doLogin(HttpServletRequest request, HttpServletResponse response);

    public List<PlaBlog> getUserBlogList(HttpServletRequest request, HttpServletResponse response);
}

