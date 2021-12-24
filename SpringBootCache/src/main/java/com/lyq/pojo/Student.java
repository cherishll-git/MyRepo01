package com.lyq.pojo;

import java.io.Serializable;


public class Student implements Serializable {
    private int id;
    private String stuno;
    private String stuname;
    private String stusex;
    private String db;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuno='" + stuno + '\'' +
                ", stuname='" + stuname + '\'' +
                ", stusex='" + stusex + '\'' +
                ", db='" + db + '\'' +
                '}';
    }
}
