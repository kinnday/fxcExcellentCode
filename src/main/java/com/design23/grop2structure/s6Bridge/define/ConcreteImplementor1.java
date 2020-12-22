package com.design23.grop2structure.s6Bridge.define;

//具体实现化角色
public class ConcreteImplementor1 implements Implementor {
    public void doSomething(){
        System.out.println(this.getClass().getName() + "-doSomething");
        //业务逻辑处理
    }
    public void doAnything(){
        //业务逻辑处理
        System.out.println(this.getClass().getName() + "-doAnything");
    }
}
