package com.design23.grop2structure.s3Proxy.dynamicstandard;

public class BeforeAdvice implements IAdvice {
    public void exec(){
        System.out.println("我是前置通知，我被执行了！");
    }
}
