package com.chenwt.entity;

import java.io.Serializable;

/**
 * Created by feini on 2017/6/15.
 * 用户实体类.
 */
public class User  implements Serializable {

    private Long id;
    private Integer age;
    private Integer isDeleted;
    private String nickName;
    private String passWord;
    private Integer state;
    private String userName;

    public User(Long id, Integer age, Integer isDeleted, String nickName, String passWord, Integer state, String userName) {
        this.id = id;
        this.age = age;
        this.isDeleted = isDeleted;
        this.nickName = nickName;
        this.passWord = passWord;
        this.state = state;
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", isDeleted=" + isDeleted +
                ", nickName='" + nickName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", state=" + state +
                ", userName='" + userName + '\'' +
                '}';
    }
}
