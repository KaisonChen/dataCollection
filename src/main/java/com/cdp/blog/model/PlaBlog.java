package com.cdp.blog.model;

import java.util.Date;

public class PlaBlog {
    private Integer plaBlogId;

    private String plaBlogTitle;

    private String plaBlogAuthor;

    private Date createTime;

    private Date updTime;

    private String plaBlogBody;

    public Integer getPlaBlogId() {
        return plaBlogId;
    }

    public void setPlaBlogId(Integer plaBlogId) {
        this.plaBlogId = plaBlogId;
    }

    public String getPlaBlogTitle() {
        return plaBlogTitle;
    }

    public void setPlaBlogTitle(String plaBlogTitle) {
        this.plaBlogTitle = plaBlogTitle == null ? null : plaBlogTitle.trim();
    }

    public String getPlaBlogAuthor() {
        return plaBlogAuthor;
    }

    public void setPlaBlogAuthor(String plaBlogAuthor) {
        this.plaBlogAuthor = plaBlogAuthor == null ? null : plaBlogAuthor.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    public String getPlaBlogBody() {
        return plaBlogBody;
    }

    public void setPlaBlogBody(String plaBlogBody) {
        this.plaBlogBody = plaBlogBody == null ? null : plaBlogBody.trim();
    }
}