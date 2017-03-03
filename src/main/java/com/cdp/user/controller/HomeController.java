package com.cdp.user.controller;

import com.cdp.common.model.Blog;
import com.cdp.common.util.CaptchaUtil;
import com.cdp.user.service.HomeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaohu on 2016/12/23.
 */

@Controller
public class HomeController {

    private  static final Logger logger = Logger.getLogger(HomeController.class);

    @Autowired
    private HomeService homeService;

    @RequestMapping("/index")
    public String index(){
        //输出日志
        logger.info("the first jsp pages");

        System.out.println("controller");
        homeService.homeTest();

        //返回一个index.jsp
        return "com/header";
    }

    @RequestMapping("captcha")
    @ResponseBody
    public void captcha(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            CaptchaUtil.outputCaptcha(request, response);
    }

    @RequestMapping("/login")
    public ModelAndView doLogin(HttpServletRequest request, HttpServletResponse response,
                                @RequestParam  String user_name,@RequestParam String user_pwd,@RequestParam String captcha){
        ModelAndView modelAndView = new ModelAndView();

        //session中的验证码
        String randomString = (String)request.getSession().getAttribute("randomString");
        //验证码错误
        if(!randomString.equalsIgnoreCase(captcha)){
            modelAndView.addObject("message","验证码错误");
            modelAndView.setViewName("user/login");
            return modelAndView;
        }

        String str = homeService.doLogin(request, response);

        if(str.length() > 0){
            modelAndView.addObject("message", str);
            modelAndView.setViewName("user/login");
            return modelAndView;
        }

        modelAndView.addObject("message",str);
        modelAndView.setViewName("user/userInfo");


        return modelAndView;

    }

    @RequestMapping("/logout")
    public ModelAndView logout(HttpServletRequest request, HttpServletResponse response){

        ModelAndView modelAndView = new ModelAndView();

        request.getSession().removeAttribute("userinfo");

        modelAndView.setViewName("/com/index");

        return modelAndView;
    }

    @RequestMapping("/userBlogList")
    @ResponseBody
    public ModelAndView gerUserBlogList(HttpServletRequest request, HttpServletResponse response){

        ModelAndView modelAndView = new ModelAndView();

        List<Blog> list = new ArrayList<Blog>();
        list = homeService.getUserBlogList(request, response);

        modelAndView.setViewName("user/userBlog");
        modelAndView.addObject("blogList",list);

        return modelAndView;

    }

}
