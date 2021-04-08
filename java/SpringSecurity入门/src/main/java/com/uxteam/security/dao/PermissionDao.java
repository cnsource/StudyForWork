package com.uxteam.security.dao;

import com.uxteam.security.model.Permission;
import com.uxteam.security.model.RoleUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PermissionDao {

    @Select("select code from permission where id in " +
            "(select permission_id from role_permission where role_id = " +
            "(select role_id from role_user where user_id = #{id}))")
    List<String> getPermissionByUserId(int userid);

}
