package com.cdp.common.model;

/**
 * Created by xiaohu on 2017/1/6.
 */
public class UserInfo {

    private int useid;

    private String username;

    private String userpwd;

    private int grpid;

    private String create_time;

    private String login_time;

    public int getUseid() {
        return useid;
    }

    public void setUseid(int useid) {
        this.useid = useid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public int getGrpid() {
        return grpid;
    }

    public void setGrpid(int grpid) {
        this.grpid = grpid;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getLogin_time() {
        return login_time;
    }

    public void setLogin_time(String login_time) {
        this.login_time = login_time;
    }
}
