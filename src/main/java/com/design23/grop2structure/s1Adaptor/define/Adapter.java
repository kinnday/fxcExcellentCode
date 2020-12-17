package com.design23.grop2structure.s1Adaptor.define;

//适配器角色
public class Adapter extends Adaptee implements Target {
    public void request() {
        super.doSomething();
    }
}
