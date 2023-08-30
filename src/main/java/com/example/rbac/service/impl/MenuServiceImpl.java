package com.example.rbac.service.impl;

import com.example.rbac.mapper.MenuMapper;
import com.example.rbac.pojo.Menu;
import com.example.rbac.service.MenuService;

import javax.annotation.Resource;
import java.util.List;

public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;
    @Override
    public List<Menu> getRoleMenus(Integer roleId, Integer menuId) {
        return menuMapper.getRoleMenus(roleId,menuId);
    }
}
