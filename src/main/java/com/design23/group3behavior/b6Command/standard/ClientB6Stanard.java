package com.design23.group3behavior.b6Command.standard;

public class ClientB6Stanard {
    public static void main(String[] args) {
        //定义我们的接头人
        Invoker xiaoSan = new Invoker();
        //接头人就是小三
        //客户要求增加一项需求
        //客户给我们下命令来
//        System.out.println("------------客户要求增加一项需求---------------");
//        Command command = new AddRequirementCommand();

        System.out.println("------------客户要求删除一个页面---------------");
        Command command = new DeletePageCommand();
        //接头人接收到命令
        xiaoSan.setCommand(command);
        //接头人执行命令
        xiaoSan.action();
    }
}
//------------客户要求增加一项需求---------------
//找到需求组...
//客户要求增加一项需求...
//客户要求需求变更计划...