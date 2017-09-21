package com.example.asus.traininggroup.db;

import android.speech.tts.TextToSpeech;

/**
 * Created by xwy15 on 2017/9/21.
 */

public class Teacher extends User {
    private String course;
    private int age;
    private int teachAge;
    private String experience;
    private String awards;

    public Teacher(){}

    public String getCourse() {
        return course;
    }

    public User setCourse(String course) {
        this.course = course;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public int getTeachAge() {
        return teachAge;
    }

    public User setTeachAge(int teachAge) {
        this.teachAge = teachAge;
        return this;
    }

    public String getExperience() {
        return experience;
    }

    public User setExperience(String experience) {
        this.experience = experience;
        return this;
    }

    public String getAwards() {
        return awards;
    }

    public User setAwards(String awards) {
        this.awards = awards;
        return this;
    }
}
