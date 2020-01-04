package com.xdclass.provide.pojo;

import java.util.Date;

public class Testinformation {
    private Integer tmid;

    private String tmname;

    private Date begintime;

    private Date endtime;

    private String address;

    public Integer getTmid() {
        return tmid;
    }

    public void setTmid(Integer tmid) {
        this.tmid = tmid;
    }

    public String getTmname() {
        return tmname;
    }

    public void setTmname(String tmname) {
        this.tmname = tmname == null ? null : tmname.trim();
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}