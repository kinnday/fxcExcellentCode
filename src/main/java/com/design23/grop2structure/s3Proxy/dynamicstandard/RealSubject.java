package com.design23.grop2structure.s3Proxy.dynamicstandard;

public class RealSubject implements Subject {
    //业务操作
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}
