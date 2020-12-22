package com.design23.group3behavior.b5Visitor.ext3Dubble;

public class ClientB5Ext3 {
    public static void main(String[] args) {
        //定义一个演员
        AbsActor actor = new OldActor();
        //定义一个角色
        Role role = new KungFuRole();
        //开始演戏

//      fxc1-静态分派- 方法重载，Role参数方法
        actor.act(role);

//      fxc2-动态分派- 父子类 复写同名方法，使用 OldActor
        actor.act(new KungFuRole());
    }
}
//AbsActor-演员可以扮演任何角色
//OldActor-年龄大了，不能演功夫角色