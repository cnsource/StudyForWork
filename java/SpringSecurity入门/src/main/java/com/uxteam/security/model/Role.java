package com.uxteam.security.model;

import java.util.Date;

public class Role {
    private int id;
    private String role_name;
    private String description;
    private Date create_time;
    private Date update_time;
    private int status;

    public Role() {
    }

    public Role(int id, String role_name, String description, Date create_time, Date update_time, int status) {
        this.id = id;
        this.role_name = role_name;
        this.description = description;
        this.create_time = create_time;
        this.update_time = update_time;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
