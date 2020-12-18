package com.design23.group3behavior.b10Mono.buildin;

public class Caretaker {
    //备忘录对象
    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
}
