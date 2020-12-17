package com.design23.group3behavior.b6Command.bestExec;

import com.design23.group3behavior.b6Command.define.Receiver;

// 最佳实践： 这确实简化了很多，每个命令完成单一的职责，而不是根据接收者的不同完成不同的职责。在高层模块的调用时就不用考虑接收者是谁的问题，
public abstract class Command {

    //定义一个子类的全局共享变量
    protected  final Receiver receiver;

    //实现类必须定义一个接收者
    public Command(Receiver _receiver) {
        this.receiver = _receiver;
    }

    //每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}
