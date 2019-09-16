package com.designpatterns.action.command;

// 命令模式-增加一个抽象层，定义统一的抽象方法- 并增加对象的各个实现类
public abstract class Command {
    public abstract String execute();
}
