package com.itcast.springboot.service;

import com.itcast.springboot.model.UserInfo;

import java.util.List;

public interface UserService {

    List<UserInfo> queryAllUser();
}
