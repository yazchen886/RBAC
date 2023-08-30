package com.example.rbac.service.impl;

import com.example.rbac.mapper.UserMapper;
import com.example.rbac.pojo.User;
import com.example.rbac.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public User login(String userName,String pwd) {
        return userMapper.login(userName,pwd);
    }

}
