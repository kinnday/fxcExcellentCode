package com.design23.grop2structure.s3Proxy.dynamicstandard;

import java.lang.reflect.InvocationHandler;

//注意看DynamicProxy类，它是一个通用类，不具有业务意义，如果我们再产生一个实现类是不是就很有意义了呢

//具体业务的动态代理
public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject) {
        //获得   ClassLoader
        ClassLoader loader = subject.getClass().getClassLoader();
        //获得接口数组
        Class<?>[] classes = subject.getClass().getInterfaces();
        //获得handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, classes, handler);
    }
}
