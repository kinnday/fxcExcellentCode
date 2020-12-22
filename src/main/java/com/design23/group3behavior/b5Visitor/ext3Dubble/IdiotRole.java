package com.design23.group3behavior.b5Visitor.ext3Dubble;

public class IdiotRole implements Role {
    //一个弱智角色

    //一个弱智角色，由谁来扮演
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
