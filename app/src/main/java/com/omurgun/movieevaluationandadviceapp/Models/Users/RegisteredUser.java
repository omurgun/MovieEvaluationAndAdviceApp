package com.omurgun.movieevaluationandadviceapp.Models.Users;

public class RegisteredUser {

    private String Email;
    private String Password;
    private String UserName;
    private String PhoneNumber;
    private String Uid;


    public RegisteredUser()
    {

    }

    public RegisteredUser(String email, String userName,String phoneNumber,String password, String uid) {
        Email = email;
        Password = password;
        UserName = userName;
        PhoneNumber = phoneNumber;
        Uid = uid;
    }


    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
