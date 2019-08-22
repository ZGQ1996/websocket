package com.example.websocket.mapper;

import com.example.websocket.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface UserMapper {


    /**
     * 最新一条老师的步数
     * @return
     */
    List<User> selectUser();

    int saveUser(User user);


}