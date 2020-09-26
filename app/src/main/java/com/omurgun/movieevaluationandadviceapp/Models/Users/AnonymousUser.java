package com.omurgun.movieevaluationandadviceapp.Models.Users;

public class AnonymousUser {

    private String Uid;

    public AnonymousUser() {

    }
    public AnonymousUser(String uid) {
        Uid = uid;
    }


    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }
}
