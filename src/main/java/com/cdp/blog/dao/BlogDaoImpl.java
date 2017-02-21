package com.cdp.blog.dao;

import com.cdp.common.model.Blog;
import com.cdp.common.model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by xiaohu on 2017/1/3.
 */
@Repository("BlogDao")
public class BlogDaoImpl implements BlogDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Blog> getBlogList(){

        List<Blog> list = new ArrayList<Blog>();

        String sql = "select pla_blog_id,pla_blog_title,pla_blog_body from pla_blog LIMIT 0,20";

        SqlRowSet rs = jdbcTemplate.queryForRowSet(sql);

        while (rs.next()){
            Blog blog = new Blog();
            blog.setId(rs.getInt("pla_blog_id"));
            blog.setTitle(rs.getString("pla_blog_title"));
            blog.setBody(rs.getString("pla_blog_body"));

            list.add(blog);
        }

        return list;
    }

    @Override
    public Blog getBlogDetail(int blogId) {

        Blog blog = new Blog();

        String sql = "select pla_blog_title,pla_user_nickname,pla_blog_body,pla_blog.create_time as create_time from pla_blog left join pla_user on pla_blog_author = pla_user_id where pla_blog_id = ?";

        Object[] param = new Object[]{blogId};
        SqlRowSet rs = jdbcTemplate.queryForRowSet(sql, param);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        if(rs.next()){
            blog.setTitle(rs.getString("pla_blog_title"));
            blog.setBody(rs.getString("pla_blog_body"));
            blog.setAuthor(rs.getString("pla_user_nickname"));
            String date = sdf.format(rs.getDate("create_time"));

            blog.setCreate_time(date);
        }

        return blog;

    }
}
