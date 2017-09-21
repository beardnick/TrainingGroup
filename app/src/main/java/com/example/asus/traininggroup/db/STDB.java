package com.example.asus.traininggroup.db;

/**
 * Created by xwy15 on 2017/9/21.
 */

public class STDB {
    private long teacherId;
    private long studentId;
    
    public STDB(){}
    
    public STDB(long teacherId, long studentID){
        this.studentId=studentID;
        this.teacherId=teacherId;
    }
}
