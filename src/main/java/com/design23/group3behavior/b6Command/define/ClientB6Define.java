package com.design23.group3behavior.b6Command.define;

public class ClientB6Define {
    public static void main(String[] args) {
        //首先声明调用者 Invoker
        Invoker invoker = new Invoker();
        //定义接收者
        Receiver receiver = new ConcreteReciver1();
        //定义一个发送给接收者的命令
        Command command = new ConcreteCommand1(receiver);
        //把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();
    }
}
