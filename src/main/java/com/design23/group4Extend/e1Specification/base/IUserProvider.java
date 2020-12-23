package com.design23.group4Extend.e1Specification.base;

import java.util.ArrayList;

//用户操作对象接口
public interface IUserProvider {
    //根据用户名查找用户 public
    ArrayList<User> findUserByNameEqual(String name);

    //年龄大于指定年龄的用户 public
    ArrayList<User> findUserByAgeThan(int age);
}
