package com.example.shoppingmallrearend.publicClass.mapper;


import com.example.shoppingmallrearend.publicClass.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    int addUser(User user);

    List<User> queryUserById(int id);
}
