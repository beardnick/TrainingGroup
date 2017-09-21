package com.example.asus.traininggroup.db;

/**
 * Created by xwy15 on 2017/9/21.
 */

public class StuClass {
    private int classId;
    private int teacherId;
    private String className;
    private String time;
    private String room;

    public StuClass(){}

    public StuClass(int classId,int teacherId,String className,String time,String room){
        this.classId=classId;
        this.teacherId=teacherId;
        this.className=className;
        this.time=time;
        this.room=room;
    }
    public int getClassId() {
        return classId;
    }

    public StuClass setClassId(int classId) {
        this.classId = classId;
        return this;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public StuClass setTeacherId(int teacherId) {
        this.teacherId = teacherId;
        return this;
    }

    public String getClassName() {
        return className;
    }

    public StuClass setClassName(String className) {
        this.className = className;
        return this;
    }

    public String getTime() {
        return time;
    }

    public StuClass setTime(String time) {
        this.time = time;
        return this;
    }

    public String getRoom() {
        return room;
    }

    public StuClass setRoom(String room) {
        this.room = room;
        return this;
    }
}
