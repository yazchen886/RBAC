package com.example.rbac.mapper;


import com.example.rbac.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface MenuMapper {
    //根据角色id和上级菜单id获取子菜单信息
    @Select("select * from TABLE ( menu ) where menu_id in(select menu_id from role_menu where role_id = #{roleId})" +
            "and perant_id = #{menuId}")
    public List<Menu> getRoleMenus(Integer roleId, Integer menuId);
}
