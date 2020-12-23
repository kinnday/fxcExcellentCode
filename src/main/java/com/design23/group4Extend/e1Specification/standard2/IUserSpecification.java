package com.design23.group4Extend.e1Specification.standard2;

import com.design23.group4Extend.e1Specification.base.User;

public interface IUserSpecification {

    //候选者是否满足要求
    public boolean isSatisfiedBy(User user);
     //and操作
    public IUserSpecification and(IUserSpecification spec);

    //or操作
    public IUserSpecification or(IUserSpecification spec);

    //not操作
    public IUserSpecification not();
}
