package com.cdp.user.dao;

import com.cdp.blog.model.PlaBlog;
import com.cdp.blog.model.PlaUser;
import com.cdp.common.util.PubFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaohu on 2017/3/8.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String doLogin(HttpServletRequest request, HttpServletResponse response) {

        String str = "";

        String user_name = request.getParameter("user_name");
        String user_pwd = request.getParameter("user_pwd");

        user_pwd = PubFunction.getSha1(user_pwd);

        String sql = "select pla_user_id, pla_user_grpid from pla_user where pla_user_nickname = ? and pla_user_pwd = ?";
        Object[] param = new Object[]{user_name, user_pwd};
        SqlRowSet rs = jdbcTemplate.queryForRowSet(sql, param);

        PlaUser userInfo = new PlaUser();
        if(rs.next()){
            userInfo.setPlaUserNickname(user_name);
            userInfo.setPlaUserId(rs.getInt("pla_user_id"));
            userInfo.setPlaUserGrpid(rs.getInt("pla_user_grpid"));
        }

        if(userInfo.getPlaUserId() != 0){
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
    public List<PlaBlog> getUserBlogList(PlaUser plaUser) {
        List<PlaBlog> list = new ArrayList<PlaBlog>();

        int userid = plaUser.getPlaUserId();

        String sql = "select pla_blog_id,pla_blog_title,create_time,upd_time from pla_blog where pla_blog_author = ?";

        Object[] param = new Object[]{userid};

        SqlRowSet rs = jdbcTemplate.queryForRowSet(sql, param);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String date ="";
        String temp ="";
        try {
            while (rs.next()){
                PlaBlog blog = new PlaBlog();
                blog.setPlaBlogId(rs.getInt("pla_blog_id"));
                blog.setPlaBlogTitle(rs.getString("pla_blog_title"));
                temp = rs.getString("create_time");
                if(temp != null && temp.length() > 0 ){
                    date = sdf.format(rs.getDate("create_time"));
                    blog.setCreateTime(sdf.parse(date));
                }
                temp = rs.getString("upd_time");
                if(temp != null && temp.length() > 0 ){
                    date = sdf.format(rs.getDate("upd_time"));
                    blog.setUpdTime(sdf.parse(date));
                }

                list.add(blog);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return list;
    }


}
