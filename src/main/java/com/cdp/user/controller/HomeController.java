package com.cdp.user.controller;

import com.cdp.user.service.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaohu on 2016/12/23.
 */

@Controller
public class HomeController {

    private  static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private HomeService homeService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        //输出日志
        logger.info("the first jsp pages");

        System.out.println("controller");
        homeService.homeTest();

        //返回一个index.jsp
        return "ssssss";
    }

}
