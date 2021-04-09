package com.cli.vue.domain;

public class User {
    private String id;
    private String name;
    private String sex;
    private int age;
    private String phone;
    private String birth;

    public User() {
    }

    public User(String id, String name, String sex, int age, String phone, String birth) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.birth = birth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }
}
