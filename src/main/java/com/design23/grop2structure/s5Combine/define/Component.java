package com.design23.grop2structure.s5Combine.define;

// 抽象构件
public abstract class Component {
    //个体和整体都具有的共享
    public void doSomething(){
        //编写业务逻辑
        System.out.println("Component-doSomething");
    }

}
