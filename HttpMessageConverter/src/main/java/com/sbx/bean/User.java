package com.sbx.bean;

/**
 * @author :sbx
 * @date :2022/3/8 18:20
 * @description :
 * @version: :1.0.0
 */
public class User {
    private  Integer id;
    private String username;
    private  String password;
    private  Integer gender;

    public User() {
    }

    public User(Integer id, String username, String password, Integer gender) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
