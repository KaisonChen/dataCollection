package com.cdp.blog.service;

import com.cdp.blog.dao.PlaBlogMapper;
import com.cdp.blog.model.PlaBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaohu on 2017/1/3.
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService{

    private PlaBlogMapper plaBlogMapper;

    public PlaBlogMapper getPlaBlogMapper() {
        return plaBlogMapper;
    }

    @Autowired
    public void setPlaBlogMapper(PlaBlogMapper plaBlogMapper) {
        this.plaBlogMapper = plaBlogMapper;
    }

    @Override
    public List<PlaBlog> getBlogList() {

        List<PlaBlog> list = new ArrayList<PlaBlog>();

//        list.add(plaBlogMapper.selectByPrimaryKey(1));

        list = plaBlogMapper.getBlogList();

        return list;
    }

    @Override
    public PlaBlog getBlogDetail(int blogId) {

        PlaBlog blog = new PlaBlog();

        blog = plaBlogMapper.selectByPrimaryKey(blogId);

        return blog;
    }


    @Override
    public void updateByPrimaryKeySelective(PlaBlog plaBlog){

        plaBlogMapper.updateByPrimaryKeySelective(plaBlog);
    }

}
