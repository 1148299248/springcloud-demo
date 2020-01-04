package com.xdclass.provide.pojo;

import java.util.Date;

public class Student {
    private String stid;

    private String stname;

    private Date stbirthday;

    private Integer stsex;

    private String clid;

    public String getStid() {
        return stid;
    }

    public void setStid(String stid) {
        this.stid = stid == null ? null : stid.trim();
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname == null ? null : stname.trim();
    }

    public Date getStbirthday() {
        return stbirthday;
    }

    public void setStbirthday(Date stbirthday) {
        this.stbirthday = stbirthday;
    }

    public Integer getStsex() {
        return stsex;
    }

    public void setStsex(Integer stsex) {
        this.stsex = stsex;
    }

    public String getClid() {
        return clid;
    }

    public void setClid(String clid) {
        this.clid = clid == null ? null : clid.trim();
    }
}