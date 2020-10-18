package com.zhang.domain;

public class ViewClassCoach {
    private String cname;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String mname) {
        this.name = mname;
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
                "name='" + name + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }

}
