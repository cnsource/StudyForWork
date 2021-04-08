package com.vue.test.domain;

public class User {
    private String id;
    private String name;
    private int age;
    private String phone;
    private double salary;

    public User() {
    }
    public User(String name, int age, String phone, double salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }
    public User(String id, String name, int age, String phone, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                '}';
    }
}
