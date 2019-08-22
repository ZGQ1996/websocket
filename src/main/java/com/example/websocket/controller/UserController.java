package com.example.websocket.controller;


import com.example.websocket.entity.User;
import com.example.websocket.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

/**
 * @ Author     ：Zgq
 * @ Date       ：Created in 13:22 2019/4/15
 * @ Description：在本行按ctrl + alt + v 自动填充变量
 * @ Modified By：
 * @Version: $
 */
@Controller
@RequestMapping(value={"/user"})
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectUser.do")
    @ResponseBody
    public List<User> selectUser(){
        int size = userService.selectUser().size();
        System.out.println("================================="+size);
        return userService.selectUser();
    }

    @RequestMapping(value = "/saveUser.do")
    @ResponseBody
    public int saveUser( User user) throws IOException {
        MyWebSocket.sendInfo("张三","来了来了");
        return userService.saveUser(user);
    }






}
