package com.design23.grop1create.c3AbstarctFactory;

public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println(this.getClass().getName());
    }

    @Override
    public void talk() {
        System.out.println(this.getClass().getName());

    }

}
