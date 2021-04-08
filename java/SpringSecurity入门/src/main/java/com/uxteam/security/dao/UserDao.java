package com.uxteam.security.dao;

import com.uxteam.security.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface UserDao {
    @Insert("insert into user(username,password)values(#{username},#{password})")
    public int addUser(User user);
    @Select("select * from user")
    public List<User> findAllUser();
    @Select("select * from user where username = #{username}")
    User findUserByName(String username);
}
