package com.lyq.pojo;

import java.io.Serializable;
import java.util.Objects;


public class Student implements Serializable {
    private int id;
    private String stuno;
    private String stuname;
    private String stusex;

    @Override
    public int hashCode() {
        return Objects.hash(id, stuno, stuname, stusex);
    }

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

    public Student(int id, String stuno, String stuname, String stusex) {
        this.id = id;
        this.stuno = stuno;
        this.stuname = stuname;
        this.stusex = stusex;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuno='" + stuno + '\'' +
                ", stuname='" + stuname + '\'' +
                ", stusex='" + stusex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(stuno, student.stuno) &&
                Objects.equals(stuname, student.stuname) &&
                Objects.equals(stusex, student.stusex);
    }

}
