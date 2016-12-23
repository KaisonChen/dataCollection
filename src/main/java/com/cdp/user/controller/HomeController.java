package com.cdp.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaohu on 2016/12/23.
 */

@Controller
public class HomeController {

    private  static final Logger logger = LoggerFactory.getLogger(HomeController.class);


    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        //输出日志
        logger.info("the first jsp pages");

        //返回一个index.jsp
        return "index";
    }

}
