package com.example.shoppingmallrearend.publicClass.user.controller;

import com.example.shoppingmallrearend.configure.ResponseResult;
import com.example.shoppingmallrearend.publicClass.user.entity.User;
import com.example.shoppingmallrearend.publicClass.user.services.UserServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserServicesImpl userServices;

    @PostMapping("/addUser")
    public ResponseResult<User> addUser(@RequestBody User user){
        user.setCreateTime(new Date());
        user.setUserPassword(DigestUtils.md5DigestAsHex(user.getUserPassword().getBytes(StandardCharsets.UTF_8)));
        user.setUserType(0);
        System.out.println(user);
        userServices.addUser(user);
        return new ResponseResult(user);
    }

    @RequestMapping("/queryUserById")
    public ResponseResult<User> queryUserById(@RequestBody Map<String, Object> data){
        int id = (int) data.get("id");
        List<User> users = userServices.queryUserById(id);
        return new ResponseResult(users);
    }

    @PostMapping("/changeUser")
    public ResponseResult<User> changeUser(@RequestBody User user){

        userServices.changeUser(user);
        System.out.println(user);
        return new ResponseResult(user);
    }

}
