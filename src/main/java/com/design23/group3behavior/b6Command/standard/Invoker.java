package com.design23.group3behavior.b6Command.standard;

//负责人
public class Invoker {
    //什么命令
    private Command command;
    //客户发出命令
    public void setCommand(Command command){
        this.command = command;
    }
    //执行客户的命令
    public void action(){
        this.command.execute();
    }
}
