package com.design23.group4Extend.e1Specification.base;

//查找出姓名中包含“国庆”两个字的用户

//规格模式的实现
public class User {
    //姓名
    private String name;
    //年龄
    private int age;

    public User(String _name, int _age) {
        this.name = _name;
        this.age = _age;
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

    //用户信息打印
    @Override
    public String toString() {
        return "用户名：" + name + "\t年龄：" + age;
    }
}
