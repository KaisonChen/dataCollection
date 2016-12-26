package com.cdp.user.service;

import com.cdp.user.dao.HomeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
