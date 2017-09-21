package com.example.asus.traininggroup.db;

/**
 * Created by xwy15 on 2017/9/21.
 */

public class Student extends User {
    private String stuClass;

    private Student(){}

    public String getStuClass() {
        return stuClass;
    }

    public User setStuClass(String stuClass) {
        this.stuClass = stuClass;
        return this;
    }
}
