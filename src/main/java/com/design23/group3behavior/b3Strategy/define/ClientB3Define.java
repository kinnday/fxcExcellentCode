package com.design23.group3behavior.b3Strategy.define;

// 策略模式就是这么简单，偷着乐吧，它就是采用了面向对象的继承和多态机制，其他没什么玄机
public class ClientB3Define {
    public static void main(String[] args) {
        //声明一个具体的策略
        Strategy strategy = new ConcreteStrategy1();
        //声明上下文对象
        Context context = new Context(strategy);
        //执行封装后的方法
        context.doAnythinig();
    }
}

//具体策略1的运算法则