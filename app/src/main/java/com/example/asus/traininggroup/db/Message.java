package com.example.asus.traininggroup.db;

/**
 * Created by xwy15 on 2017/9/21.
 */

public class Message {
    private String Msg;
    private int sender;
    private int receiver;

    public Message(int sender,int receiver,String Msg){
        this.sender=sender;
        this.receiver=receiver;
        this.Msg=Msg;
    }

    public String getMsg() {
        return Msg;
    }

    public int getSender() {
        return sender;
    }

    public int getReceiver() {
        return receiver;
    }
}
