package com.example.asus.traininggroup.db;

import android.media.Image;

/**
 * Created by xwy15 on 2017/9/21.
 */

public class Question {
    private int id;
    private String question;
    private Image[] images;

    public Question(int Id,String question,Image[] images){
        this.id=Id;
        this.question=question;
        this.images=images;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public Image[] getImages() {
        return images;
    }
}
