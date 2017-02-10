package com.cdp.user.service;

import com.cdp.common.model.Blog;
import com.cdp.common.model.UserInfo;
import com.cdp.user.dao.HomeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaohu on 2016/12/26.
 */
@Service("HomeService")
public class HomeServiceImpl implements HomeService{


    @Autowired
    private HomeDao homeDao;

    @Override
    public String homeTest(){

        homeDao.homeTest();

        return null;
    }

    @Override
    public String doLogin(HttpServletRequest request, HttpServletResponse response){

        String str = homeDao.doLogin(request, response);

        return str;
    }

    @Override
    public List<Blog> getUserBlogList(HttpServletRequest request, HttpServletResponse response) {

        List<Blog> list = new ArrayList<Blog>();

        UserInfo userInfo = (UserInfo)request.getSession().getAttribute("userinfo");

        list = homeDao.getUserBlogList(userInfo);

        return list;
    }
}
