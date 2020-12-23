package com.design23.group4Extend.e1Specification.standard2;

import com.design23.group4Extend.e1Specification.base.User;

public class OrSpecification extends CompositeSpecification {
    //传递两个规格书进行and操作
    private IUserSpecification left;
    private IUserSpecification right;

    public OrSpecification(IUserSpecification _left, IUserSpecification _right) {
        this.left = _left;
        this.right = _right;
    }

    //进行and运算 @Override
    public boolean isSatisfiedBy(User user) {
        return left.isSatisfiedBy(user) || right.isSatisfiedBy(user);
    }
}
