package com.design23.group4Extend.e1Specification.standard;

import com.design23.group4Extend.e1Specification.base.User;

import java.util.ArrayList;

public interface IUserProvider {

    //根据条件查找用户
    public ArrayList<User> findUser(IUserSpecification userSpec);
}
