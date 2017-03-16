package com.cdp.user.controller;

import com.cdp.blog.model.PlaBlog;
import com.cdp.blog.service.BlogService;
import com.cdp.common.util.CaptchaUtil;
import com.cdp.user.service.UserService;
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
 * Created by xiaohu on 2017/3/8.
 */
@Controller
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private BlogService blogService;

    @RequestMapping("/doLogin")
    public ModelAndView doLogin(HttpServletRequest request, HttpServletResponse response,
                                @RequestParam  String user_name, @RequestParam String user_pwd, @RequestParam String captcha){

        ModelAndView modelAndView = new ModelAndView();

        //session中的验证码
        String randomString = (String)request.getSession().getAttribute("randomString");
        //验证码错误
        if(!randomString.equalsIgnoreCase(captcha)){
            modelAndView.addObject("message","验证码错误");
            modelAndView.setViewName("user/login");
            return modelAndView;
        }

        String str = userService.doLogin(request, response);

        if(str.length() > 0){
            modelAndView.addObject("message", str);
            modelAndView.setViewName("user/login");
            return modelAndView;
        }

        modelAndView.addObject("message",str);
        modelAndView.addObject("userInfo");
        modelAndView.setViewName("user/userInfo");


        return modelAndView;
    }

    @RequestMapping("/userBlogList")
    public ModelAndView gerUserBlogList(HttpServletRequest request, HttpServletResponse response){

        ModelAndView modelAndView = new ModelAndView();

        List<PlaBlog> list = new ArrayList<PlaBlog>();
        list = userService.getUserBlogList(request, response);

        modelAndView.setViewName("user/userBlog");
        modelAndView.addObject("blogList",list);

        return modelAndView;

    }

    @RequestMapping("captcha")
    @ResponseBody
    public void captcha(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        CaptchaUtil.outputCaptcha(request, response);
    }

    @RequestMapping("/logout")
    public ModelAndView logout(HttpServletRequest request, HttpServletResponse response){

        ModelAndView modelAndView = new ModelAndView();

        request.getSession().removeAttribute("userinfo");

        modelAndView.setViewName("/com/index");

        return modelAndView;
    }

    @RequestMapping(value = "userBlogInfo")
    public ModelAndView getBlodDetial(@RequestParam int blogId){

        ModelAndView modelAndView = new ModelAndView();

        PlaBlog blog = new PlaBlog();
        blog = blogService.getBlogDetail(blogId);

        modelAndView.setViewName("user/updBlog");
        modelAndView.addObject("blogdetail",blog);

        return modelAndView;
    }

    @RequestMapping(value = "updateBlog")
    public ModelAndView updBlog(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();

        PlaBlog plaBlog = new PlaBlog();
        plaBlog.setPlaBlogId(Integer.parseInt(request.getParameter("plaBlogId")));
        plaBlog.setPlaBlogTitle(request.getParameter("plaBlogTile"));
        plaBlog.setPlaBlogBody(request.getParameter("plaBlogBody"));

        blogService.updateByPrimaryKeySelective(plaBlog);
        modelAndView.setViewName("redirect:/userBlogList");
        return modelAndView;
    }
}
