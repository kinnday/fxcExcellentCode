package com.design23.group4Extend.e1Specification.standard;

import com.design23.group4Extend.e1Specification.base.User;

//规格书接口
public interface IUserSpecification {
    //候选者是否满足要求
    public boolean isSatisfiedBy(User user);
}
