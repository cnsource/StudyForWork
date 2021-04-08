package com.vue.test.dao;

import com.vue.test.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public List<User> findAll();
    public int addUser(User user);
    public int deleteUser(String id);
    public User findOne(String id);
    public int updateUser(User user);
    List<User> findUserByNameOrPhone(@Param("name") String name, @Param("phone") String phone);
}
