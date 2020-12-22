package com.design23.group3behavior.b5Visitor.ext3Dubble;

public class KungFuRole implements Role {
    //武功天下第一的角色

    //武功天下第一的角色
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}