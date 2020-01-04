package com.xdclass.provide.pojo;

import java.util.Date;

public class Classinformation {
    private String clid;

    private String clname;

    private Date clbgdate;

    private Date cleddate;

    private Integer tid;

    public String getClid() {
        return clid;
    }

    public void setClid(String clid) {
        this.clid = clid == null ? null : clid.trim();
    }

    public String getClname() {
        return clname;
    }

    public void setClname(String clname) {
        this.clname = clname == null ? null : clname.trim();
    }

    public Date getClbgdate() {
        return clbgdate;
    }

    public void setClbgdate(Date clbgdate) {
        this.clbgdate = clbgdate;
    }

    public Date getCleddate() {
        return cleddate;
    }

    public void setCleddate(Date cleddate) {
        this.cleddate = cleddate;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}