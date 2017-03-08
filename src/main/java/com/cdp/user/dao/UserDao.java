package com.cdp.user.dao;

import com.cdp.blog.model.PlaBlog;
import com.cdp.blog.model.PlaUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by xiaohu on 2017/3/8.
 */
public interface UserDao {

    public String doLogin(HttpServletRequest request, HttpServletResponse response);

    public List<PlaBlog> getUserBlogList(PlaUser plaUser);
}
