package com.example.shoppingmallrearend.publicClass.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int id;
    private String userName;
    private String userPassword;
    private String userIdCard;
    private String userPhone;
    private int userType;
    private String userEmail;
    private String userAvatar;
    private Date createTime;
}
