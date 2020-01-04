package com.xdclass.provide.pojo;

public class StudentandsubjectKey {
    private String stid;

    private Integer subid;

    public String getStid() {
        return stid;
    }

    public void setStid(String stid) {
        this.stid = stid == null ? null : stid.trim();
    }

    public Integer getSubid() {
        return subid;
    }

    public void setSubid(Integer subid) {
        this.subid = subid;
    }
}