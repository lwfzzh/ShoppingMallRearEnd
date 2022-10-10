package com.example.shoppingmallrearend.publicClass.user.mapper;


import com.example.shoppingmallrearend.publicClass.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    int addUser(User user);

    List<User> queryUserById(int id);

    User changeUser(User user);
}
