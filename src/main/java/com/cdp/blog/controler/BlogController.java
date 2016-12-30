package com.cdp.blog.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xiaohu on 2016/12/30.
 */
@Controller
public class BlogController {

    @RequestMapping(value = "/list")
    public ModelAndView blogList(){
        ModelAndView modelAndView = new ModelAndView();

//        modelAndView.setViewName("blog/index");

        return modelAndView;
    }
}
