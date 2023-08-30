package com.example.rbac.service;

import com.example.rbac.pojo.User;

public interface UserService {
    public User login(String userName,String pwd);
}
