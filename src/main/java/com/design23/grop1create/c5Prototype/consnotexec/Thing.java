package com.design23.grop1create.c5Prototype.consnotexec;

//构造函数不会被执行
public class Thing implements Cloneable {
    public Thing() {
        System.out.println("构造函数被执行了...");
    }

    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

}
