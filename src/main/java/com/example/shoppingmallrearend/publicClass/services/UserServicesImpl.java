package com.example.shoppingmallrearend.publicClass.services;

import com.example.shoppingmallrearend.publicClass.entity.User;

import java.util.List;

public interface UserServicesImpl {
    int addUser(User user);

    List<User> queryUserById(int id);
}
