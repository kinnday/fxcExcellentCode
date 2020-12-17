package com.design23.group3behavior.b6Command.define;

// 调用者
public class Invoker {
    private Command command;
    //受气包，接受命令
    public void setCommand(Command _command){
        this.command = _command;
    }
    //执行命令
    public void action(){
        this.command.execute();
    }
}
