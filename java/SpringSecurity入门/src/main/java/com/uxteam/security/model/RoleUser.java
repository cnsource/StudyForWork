package com.uxteam.security.model;

import java.util.Date;

public class RoleUser {
    private int user_id;
    private int role_id;
    private Date create_time;
    private String creator;

    public RoleUser() {
    }

    public RoleUser(int user_id, int role_id, Date create_time, String creator) {
        this.user_id = user_id;
        this.role_id = role_id;
        this.create_time = create_time;
        this.creator = creator;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
