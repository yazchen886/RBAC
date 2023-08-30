package com.example.rbac.service;

import com.example.rbac.pojo.Menu;

import java.util.List;

public interface MenuService {
    public List<Menu> getRoleMenus(Integer roleId,Integer menuId);
}
