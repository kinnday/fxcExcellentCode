package com.design23.grop2structure.s7FlyWeight.base;

public class ClientS7Base {

    public static void main(String[] args) {
        //从工厂中获得一个对象
        SignInfo signInfo = SignInfoFactory.getSignInfo();
        //进行其他业务处理
        System.out.println(signInfo.toString());
    }
}
