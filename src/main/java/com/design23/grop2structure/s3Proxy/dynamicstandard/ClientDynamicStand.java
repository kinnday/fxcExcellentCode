package com.design23.grop2structure.s3Proxy.dynamicstandard;

import java.lang.reflect.InvocationHandler;

public class ClientDynamicStand {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义一个Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        //定义主题的代理
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass(). getClassLoader(), subject.getClass().getInterfaces(),handler);
        //代理的行为
        proxy.doSomething("Finish");
    }
}

//我是前置通知，我被执行了！
//do something!---->Finish
