package com.example.websocket.server;

import com.example.websocket.entity.User;
import com.example.websocket.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author     ：Zgq
 * @ Date       ：Created in 13:22 2019/4/15
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@Service
public class UserService {

    /**
     * 注入mapper
     */
    @Autowired
    private UserMapper usermapper;


    public List<User> selectUser(){
        List<User> users = usermapper.selectUser();
        return users;
    }

    public int saveUser(User user){
        return usermapper.saveUser(user);
    }


}
