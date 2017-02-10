package com.cdp.blog.controler;

import com.cdp.blog.service.BlogService;
import com.cdp.common.model.Blog;
import com.cdp.common.model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaohu on 2016/12/30.
 */
@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/bloglist")
    @ResponseBody
    public ModelAndView blogList(){

        ModelAndView modelAndView = new ModelAndView();

        List<Blog> list = new ArrayList<Blog>();

        list = blogService.getBlogList();

        modelAndView.setViewName("blog/index");
        modelAndView.addObject("bloglist",list);

        Page page = new Page(list.size(), 1);
        modelAndView.addObject("page", page);

        return modelAndView;
    }

    @RequestMapping(value = "blog-detail")
    @ResponseBody
    public ModelAndView getBlodDetial(@RequestParam int blogId){

        ModelAndView modelAndView = new ModelAndView();

        Blog blog = new Blog();
        blog = blogService.getBlogDetail(blogId);

        modelAndView.setViewName("blog/detail");
        modelAndView.addObject("blogdetail",blog);

        return modelAndView;
    }
}
