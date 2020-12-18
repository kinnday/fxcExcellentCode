package com.design23.group3behavior.b10Mono.standard;

//备忘录管理者
//需要备份的时候就创建一个备份，然后丢给备忘录管理者进行管理，要取的时候再从管理者手中拿到这个备份
public class Caretaker {
    //备忘录对象
    private Memento memento;
    public Memento getMemento() { return memento;
    }
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
