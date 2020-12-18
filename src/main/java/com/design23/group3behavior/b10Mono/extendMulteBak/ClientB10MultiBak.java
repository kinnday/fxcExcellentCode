package com.design23.group3behavior.b10Mono.extendMulteBak;

import com.design23.group3behavior.b10Mono.define.Originator;

//内存溢出问题，该备份一旦产生就装入内存，没有任何销毁的意向，这是非常危险的
public class ClientB10MultiBak {
    public static void main(String[] args) {
        //定义出发起人
        Originator originator = new Originator();
        //定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        //创建两个备忘录
        caretaker.setMemento("001", originator.createMemento());
        caretaker.setMemento("002", originator.createMemento());
        //恢复一个指定标记的备忘录
        originator.restoreMemento(caretaker.getMemento("001"));
    }
}
