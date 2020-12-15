package com.design23.group3behavior.b9Broker.define;

// 抽象同事类
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator _mediator) {
        this.mediator = _mediator;
    }
}
