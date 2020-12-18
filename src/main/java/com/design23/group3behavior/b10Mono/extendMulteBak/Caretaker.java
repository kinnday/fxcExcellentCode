package com.design23.group3behavior.b10Mono.extendMulteBak;

import com.design23.group3behavior.b10Mono.define.Memento;

import java.util.HashMap;

//多备份的备忘录
public class Caretaker {
    //容纳备忘录的容器
    private HashMap<String, Memento> memMap = new HashMap<String,Memento>();
    public Memento getMemento(String idx) { return memMap.get(idx);
    }
    public void setMemento(String idx,Memento memento) {
        this.memMap.put(idx, memento);
    }
}
