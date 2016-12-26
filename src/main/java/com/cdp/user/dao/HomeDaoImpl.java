package com.cdp.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import javax.sql.RowSet;

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
}
