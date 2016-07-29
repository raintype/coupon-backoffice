package com.raintype.dto;

/**
 * Created by raintype on 2016. 7. 28..
 */
public class LoginDTO {
    private String user_id;
    private String user_pw;

    public LoginDTO() {}

    public LoginDTO(String user_id, String user_pw) {
        this.user_id = user_id;
        this.user_pw = user_pw;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_pw() {
        return user_pw;
    }

    public void setUser_pw(String userpw) {
        this.user_pw = user_pw;
    }
}