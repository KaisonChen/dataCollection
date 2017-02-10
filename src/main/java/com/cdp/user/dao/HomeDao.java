package com.cdp.user.dao;

import com.cdp.common.model.Blog;
import com.cdp.common.model.UserInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by xiaohu on 2016/12/24.
 */
public interface HomeDao {

    public String homeTest();

    public String doLogin(HttpServletRequest request, HttpServletResponse response);

    public List<Blog> getUserBlogList(UserInfo userInfo);
}
