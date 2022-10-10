package com.example.shoppingmallrearend.publicClass.user.services;

import com.example.shoppingmallrearend.publicClass.user.entity.User;

import java.util.List;

public interface UserServicesImpl {
    int addUser(User user);

    List<User> queryUserById(int id);

    User changeUser(User user);
}
