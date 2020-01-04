package com.xdclass.provide.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Teacher {
    private Integer tid;

    private String tname;

    private Integer tsex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tbirthday;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Integer getTsex() {
        return tsex;
    }

    public void setTsex(Integer tsex) {
        this.tsex = tsex;
    }
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getTbirthday() {
        return tbirthday;
    }

    public void setTbirthday(Date tbirthday) {
        this.tbirthday = tbirthday;
    }
}