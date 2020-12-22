package com.design23.group3behavior.b5Visitor.define;

// 抽象元素
public abstract class Element {

    //定义业务逻辑
    public abstract void doSomething();
    //允许谁来访问
    public abstract void accept(IVisitor visitor);

}
