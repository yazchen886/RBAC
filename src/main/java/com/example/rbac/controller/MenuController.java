package com.example.rbac.controller;

import com.example.rbac.pojo.Menu;
import com.example.rbac.pojo.User;
import com.example.rbac.service.MenuService;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MenuController {
    @Resource
    private MenuService menuService;
    @GetMapping("/getRoleMenus")
    public List<Menu> getRoleMenus(String menuId, HttpSession session) {
        User user = (User)session.getAttribute("user");
        Integer roleId = user.getRoleId();
        List<Menu> menus = menuService.getRoleMenus(roleId, Integer.parseInt(menuId));
        return menus;
    }
}
