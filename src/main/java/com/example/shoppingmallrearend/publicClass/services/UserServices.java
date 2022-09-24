package com.example.shoppingmallrearend.publicClass.services;

import com.example.shoppingmallrearend.publicClass.entity.User;
import com.example.shoppingmallrearend.publicClass.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices implements UserServicesImpl{
    @Autowired
    UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public List<User> queryUserById(int id) {
        return userMapper.queryUserById(id);
    }
}
