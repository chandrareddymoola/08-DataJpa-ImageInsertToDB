package com.tcs.entity;

import jakarta.persistence.*;

import java.util.Arrays;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uesrId;
    private String  userName;
    private String userEmail;
    @Lob
    private byte[] usr_Image;

    public Integer getUesrId() {
        return uesrId;
    }

    public void setUesrId(Integer uesrId) {
        this.uesrId = uesrId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public byte[] getUsr_Image() {
        return usr_Image;
    }

    public void setUsr_Image(byte[] usr_Image) {
        this.usr_Image = usr_Image;
    }

    @Override
    public String toString() {
        return "User{" +
                "uesrId=" + uesrId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", usr_Image=" + Arrays.toString(usr_Image) +
                '}';
    }
}
