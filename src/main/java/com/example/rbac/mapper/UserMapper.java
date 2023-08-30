package com.example.rbac.mapper;

import com.example.rbac.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where user_name = #{userName} and pwd = #{pwd}")
    public User login(@Param("user_name") String userName, @Param("pwd") String pwd);

}