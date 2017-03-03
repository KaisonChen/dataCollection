package com.cdp.blog.model;

import java.util.Date;

public class PlaUser {
    private Integer plaUserId;

    private String plaUserNickname;

    private String plaUserPwd;

    private Integer plaUserGrpid;

    private String plaUserLang;

    private Date createTime;

    private Date lastLoginTime;

    public Integer getPlaUserId() {
        return plaUserId;
    }

    public void setPlaUserId(Integer plaUserId) {
        this.plaUserId = plaUserId;
    }

    public String getPlaUserNickname() {
        return plaUserNickname;
    }

    public void setPlaUserNickname(String plaUserNickname) {
        this.plaUserNickname = plaUserNickname == null ? null : plaUserNickname.trim();
    }

    public String getPlaUserPwd() {
        return plaUserPwd;
    }

    public void setPlaUserPwd(String plaUserPwd) {
        this.plaUserPwd = plaUserPwd == null ? null : plaUserPwd.trim();
    }

    public Integer getPlaUserGrpid() {
        return plaUserGrpid;
    }

    public void setPlaUserGrpid(Integer plaUserGrpid) {
        this.plaUserGrpid = plaUserGrpid;
    }

    public String getPlaUserLang() {
        return plaUserLang;
    }

    public void setPlaUserLang(String plaUserLang) {
        this.plaUserLang = plaUserLang == null ? null : plaUserLang.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}