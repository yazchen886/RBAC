package com.example.rbac.controller;
import com.example.rbac.pojo.User;
import com.example.rbac.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


@RestController
public class UserController {
    @Resource
    private UserService userService;
    @PostMapping("/login")
    public Boolean userLogin(String userName, String pwd, HttpSession session) {
        User user = userService.login(userName,pwd);
        session.setAttribute("user",user);
        return user!=null;
    }



}
