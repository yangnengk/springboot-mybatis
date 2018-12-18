package com.itcast.springboot.service.impl;

import com.itcast.springboot.mapper.UserInfoMapper;
import com.itcast.springboot.model.UserInfo;
import com.itcast.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfo> queryAllUser() {
        return userInfoMapper.queryAllUser();
    }
}
