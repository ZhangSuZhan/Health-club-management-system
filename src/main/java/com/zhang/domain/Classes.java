package com.zhang.domain;

public class Classes {
    private int id;
    private String cname;
    private String price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
