package com.cli.vue.service;

import com.cli.vue.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserService {
    User findOne(String id);
    List<User> findAllUser();
    List<User> findRange(@Param("page") int page, @Param("limit") int limit);
    int addUser(User user);
    int deleteUser(String id);
    int updateUser(User user);
}
