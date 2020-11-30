package com.design23.grop1create.c2FactoryMethod;

public abstract class AbstractHumanFactory {
    abstract <T extends Human> T createHuman(Class<T> clz);
}
