package com.design23.perfectworld.p1CommandChain.standard.ls;

import com.design23.perfectworld.p1CommandChain.standard.Command;
import com.design23.perfectworld.p1CommandChain.standard.CommandName;
import com.design23.perfectworld.p1CommandChain.standard.CommandVO;

//具体的ls命令
public class LSCommand extends Command {
    public  String execute(CommandVO vo){
        //返回链表的首节点
        CommandName firstNode = super.buildChain(AbstractLS.class).get(0);
        return firstNode.handleMessage(vo);
    }
}
