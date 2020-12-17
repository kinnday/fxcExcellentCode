package com.design23.grop2structure.s1Adaptor.define;

public class ClientS1Define {
    public static void main(String[] args) {
        //原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        //现在增加了适配器角色后的业务逻辑
        Target target2 = new Adapter();
        target2.request();
    }
}
//if you need any help,pls call me!
//I'm kind of busy,leave me alone,pls!