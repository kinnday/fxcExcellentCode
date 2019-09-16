package com.designpatterns.action.observer.jdk;

import java.util.Observable;

// 事件监听-继承 Observable 抽象类
public class Mango extends Observable {
    private String name;

    public Mango(String name){
        this.name = name;
    }

    //芒果到货了
    public void perform(){
        this.setChanged();
        this.notifyObservers();
    }
}
