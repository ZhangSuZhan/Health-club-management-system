package com.zhang.domain;

public class ViewClassMember {
    private String mname;
    private String cname;

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "ViewClassMember{" +
                "mname='" + mname + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }

}
