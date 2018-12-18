package com.itcast.springboot.controller;

import com.itcast.springboot.model.UserInfo;
import com.itcast.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybatisController {

    @Autowired
    private UserService userService;

    @RequestMapping("/boot/getUser")
    public List<UserInfo> getUser(){
        return userService.queryAllUser();
    }
}
