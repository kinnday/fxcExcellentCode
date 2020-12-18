package com.design23.group3behavior.b2Observer.define;

public class ConcreteObserver implements Observer {
    //实现更新方法
    public void update() {
        System.out.println("接收到信息，并进行处理！");
    }
}
