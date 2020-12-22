package com.design23.group3behavior.b5Visitor.ext3Dubble;

//不管演员类和角色类怎么变化，我们都能够找到期望的方法运行，这就是双反派
//双分派意味着得到执行的操作决定于请求的种类和两个接收者的类型，它是多分派的一个特例。
// 从这里也可以看到Java是一个支持双分派的单分派语言
public class ClientB5Ext3_2 {
    public static void main(String[] args) {
        //定义一个演员
        AbsActor actor = new OldActor();
        //定义一个角色
        Role role = new KungFuRole();
        //开始演戏
        role.accept(actor);
//        fxc - KungFuRole.accept () -- >>  AbsActor.act() [error!!!]
//        fxc - KungFuRole.accept () -- >>  OldActor.act() [error!!!]
    }
}
//OldActor-年龄大了，不能演功夫角色