package com.design23.group3behavior.b2Observer.define;

public class ConcreteSubject extends Subject {
    //具体的业务
    public void doSomething() {
        /* * do something */
        super.notifyObservers();
    }
}
