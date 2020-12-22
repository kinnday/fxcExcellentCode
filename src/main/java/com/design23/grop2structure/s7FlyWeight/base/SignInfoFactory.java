package com.design23.grop2structure.s7FlyWeight.base;

public class SignInfoFactory {

    //报名信息的对象工厂
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }
}
