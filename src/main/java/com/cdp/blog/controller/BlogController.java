package com.cdp.blog.controller;

import com.cdp.blog.model.Page;
import com.cdp.blog.model.PlaBlog;
import com.cdp.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaohu on 2016/12/30.
 */
@Controller
public class BlogController {

    private BlogService blogService;

    public BlogService getBlogService(){
        return blogService;
    }

    @Autowired
    public void setBlogService(BlogService blogService) {
        this.blogService = blogService;
    }

    @RequestMapping("/bloglist")
    public ModelAndView blogList(HttpServletRequest request){

        ModelAndView modelAndView = new ModelAndView();

        List<PlaBlog> list = new ArrayList<PlaBlog>();

        list = blogService.getBlogList();

        modelAndView.setViewName("blog/index");
        modelAndView.addObject("bloglist",list);

        Page page = new Page(list.size(), 1);
        modelAndView.addObject("page", page);

        //request.setAttribute("bloglist",list);

        return modelAndView;
    }

    @RequestMapping(value = "blog-detail")
    public ModelAndView getBlodDetial(@RequestParam int blogId){

        ModelAndView modelAndView = new ModelAndView();

        PlaBlog blog = new PlaBlog();
        blog = blogService.getBlogDetail(blogId);

        modelAndView.setViewName("blog/detail");
        modelAndView.addObject("blogdetail",blog);

        return modelAndView;
    }


}
