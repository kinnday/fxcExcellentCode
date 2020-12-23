package com.design23.group4Extend.e1Specification.standard;

import com.design23.group4Extend.e1Specification.base.User;

import java.util.ArrayList;

//复合查询
public class ClientE1Standard2 {
    public static void main(String[] args) {
        //首先初始化一批用户
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("苏大", 3));
        userList.add(new User("牛二", 8));
        userList.add(new User("张三", 10));
        userList.add(new User("李四", 15));
        userList.add(new User("王五", 18));
        userList.add(new User("赵六", 20));
        userList.add(new User("马七", 25));
        userList.add(new User("杨八", 30));
        userList.add(new User("侯九", 35));
        userList.add(new User("布十", 40));
        userList.add(new User("国庆11", 40));
        userList.add(new User("国庆12", 10));
        userList.add(new User("国庆13", 20));
        //定义一个用户查询类
        IUserProvider userProvider = new UserProvider(userList);


        IUserSpecification userSpec1 = new UserByNameLike("%国庆%");
        IUserSpecification userSpec2 = new UserByAgeThan(20);
        userList = userProvider.findUser(userSpec1);
        IUserProvider userProvider2 = new UserProvider(userList);
        for (User u : userProvider2.findUser(userSpec2)) {
            System.out.println(u);
        }
    }
}
