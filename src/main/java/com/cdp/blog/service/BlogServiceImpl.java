package com.cdp.blog.service;

import com.cdp.blog.dao.BlogDao;
import com.cdp.common.model.Blog;
import com.cdp.common.model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaohu on 2017/1/3.
 */
@Service("BlogService")
public class BlogServiceImpl implements BlogService{

    @Autowired
    private BlogDao blogDao;

    @Override
    public List<Blog> getBlogList() {

        List<Blog> list = new ArrayList<Blog>();

        list = blogDao.getBlogList();

        return list;
    }

    @Override
    public Blog getBlogDetail(int blogId) {

        Blog blog = new Blog();

        blog = blogDao.getBlogDetail(blogId);

        return blog;
    }


}
