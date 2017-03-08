package com.cdp.user.service;

import com.cdp.blog.model.PlaBlog;
import com.cdp.blog.model.PlaUser;
import com.cdp.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaohu on 2017/3/8.
 */
@Service("userService")
public class UserServiceImpl implements UserService{


    @Autowired
    private UserDao userDao;
    @Override
    public String doLogin(HttpServletRequest request, HttpServletResponse response) {

        String str = userDao.doLogin(request, response);

        return str;
    }

    @Override
    public List<PlaBlog> getUserBlogList(HttpServletRequest request, HttpServletResponse response) {

        List<PlaBlog> list = new ArrayList<PlaBlog>();

        PlaUser userInfo = (PlaUser) request.getSession().getAttribute("userinfo");

        list = userDao.getUserBlogList(userInfo);

        return list;
    }
}
