package com.design23.group4Extend.e1Specification.standard;

import com.design23.group4Extend.e1Specification.base.User;

public class UserByNameEqual implements IUserSpecification {
    //基准姓名
    private String name;

    //构造函数传递基准姓名
    public UserByNameEqual(String _name) {
        this.name = _name;
    }

    //检验用户是否满足条件
    public boolean isSatisfiedBy(User user) {
        return user.getName().equals(name);
    }
}
