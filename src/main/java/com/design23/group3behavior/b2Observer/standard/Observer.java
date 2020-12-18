package com.design23.group3behavior.b2Observer.standard;

//观察者接口
public interface Observer {

    //一发现别人有动静，自己也要行动起来
    public void update(String context);
}
