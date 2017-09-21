package com.example.asus.traininggroup.db;

import android.media.Image;

/**
 * Created by xwy15 on 2017/9/21.
 */

public class User {
    private int imageId;
    private long id;
    private String nickName;
    private String phoneNum;
    private String gender;
    private String birthday;
    private String address;
    private String school;

    public User(){}
    public User(int imageId,long Id,String nickName,String phoneNum,String gender,String birthday,String address,String school){
        this.imageId=imageId;
        this.id=Id;
        this.nickName=nickName;
        this.phoneNum=phoneNum;
        this.gender=gender;
        this.birthday=birthday;
        this.address=address;
        this.school=school;
    }
    public long getId() {
        return id;
    }

    public User setId(long id) {
        this.id = id;
        return this;
    }

    public int getImageId() {
        return imageId;
    }

    public User setImageId(int imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getNickName() {
        return nickName;
    }

    public User setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
    public User setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }

    public String getBirthday() {
        return birthday;
    }

    public User setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getSchool() {
        return school;
    }

    public User setSchool(String school) {
        this.school = school;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public User setGender(String gender) {
        this.gender = gender;
        return this;
    }
}
