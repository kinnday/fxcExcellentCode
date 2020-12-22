package com.design23.group3behavior.b5Visitor.define;

public class ConcreteElement2 extends Element {
    //完善业务逻辑
    public void doSomething() {
        //业务处理
        System.out.println(this.getClass().getName() + "-doSomething");
    }

    //允许那个访问者访问
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
