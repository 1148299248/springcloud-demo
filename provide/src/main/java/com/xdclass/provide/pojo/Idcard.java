package com.xdclass.provide.pojo;

import java.util.Date;

public class Idcard {
    private String stid;

    private Date carddate;

    public String getStid() {
        return stid;
    }

    public void setStid(String stid) {
        this.stid = stid == null ? null : stid.trim();
    }

    public Date getCarddate() {
        return carddate;
    }

    public void setCarddate(Date carddate) {
        this.carddate = carddate;
    }
}