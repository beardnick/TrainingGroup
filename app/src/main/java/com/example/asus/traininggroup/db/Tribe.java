package com.example.asus.traininggroup.db;

/**
 * Created by xwy15 on 2017/9/21.
 */
//部落
public class Tribe {
    private String tribeId;
    private String tribeName;


    public Tribe(){}

    public Tribe(String tribeId,String tribeName){
        this.tribeId=tribeId;
        this.tribeName=tribeName;
    }

    public String getTribeId() {
        return tribeId;
    }

    public Tribe setTribeId(String tribeId) {
        this.tribeId = tribeId;
        return this;
    }

    public String getTribeName() {
        return tribeName;
    }

    public Tribe setTribeName(String tribeName) {
        this.tribeName = tribeName;
        return this;
    }
}
