package com.cdp.user.dao;

import com.cdp.common.model.Blog;
import com.cdp.common.model.UserInfo;
import com.cdp.common.util.PubFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.RowSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaohu on 2016/12/26.
 */
@Repository("HomeDao")
public class HomeDaoImpl implements HomeDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String homeTest(){

        String sql = "select * from manager";

        SqlRowSet rs = jdbcTemplate.queryForRowSet(sql);


        while(rs.next()){

            System.out.println("================"+rs.getString(2));
        }

        return null;
    }

    @Override
    public String doLogin(HttpServletRequest request, HttpServletResponse response){

        String str = "";

        String user_name = request.getParameter("user_name");
        String user_pwd = request.getParameter("user_pwd");

        user_pwd = PubFunction.getSha1(user_pwd);

        String sql = "select pla_user_id, pla_user_grpid from pla_user where pla_user_nickname = ? and pla_user_pwd = ?";
        Object[] param = new Object[]{user_name, user_pwd};
        SqlRowSet rs = jdbcTemplate.queryForRowSet(sql, param);

        UserInfo userInfo = new UserInfo();
        if(rs.next()){
            userInfo.setUsername(user_name);
            userInfo.setUseid(rs.getInt("pla_user_id"));
            userInfo.setGrpid(rs.getInt("pla_user_grpid"));
        }

        if(userInfo.getUseid() != 0){
            request.getSession(true).setAttribute("userinfo",userInfo);
        }else{
            str = "用户名密码错误！";
        }

        return str;
    }



   /**
    *@Author xiaohu
    *@Date 2017/2/10 14:07:02
    *后台获取博客列表
    */
    @Override
    public List<Blog> getUserBlogList(UserInfo userInfo) {
        List<Blog> list = new ArrayList<Blog>();

        int userid = userInfo.getUseid();

        String sql = "select pla_blog_id,pla_blog_title,create_time,upd_time from pla_blog where pla_blog_author = ?";

        Object[] param = new Object[]{userid};

        SqlRowSet rs = jdbcTemplate.queryForRowSet(sql, param);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String date ="";
        while (rs.next()){
            Blog blog = new Blog();
            blog.setId(rs.getInt("pla_blog_id"));
            blog.setTitle(rs.getString("pla_blog_title"));
            date = sdf.format(rs.getDate("create_time"));
            blog.setCreate_time(date);
            date = sdf.format(rs.getDate("upd_time"));
            blog.setUpd_time(date);

            list.add(blog);
        }

        return list;
    }
}
