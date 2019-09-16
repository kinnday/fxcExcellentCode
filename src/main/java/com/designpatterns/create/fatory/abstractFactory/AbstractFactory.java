package com.designpatterns.create.fatory.abstractFactory;

import com.designpatterns.entity.Bag;
import com.designpatterns.entity.Fruit;

/**
 * 抽象水果工厂
 */
public abstract class AbstractFactory {

    public abstract  Fruit getFruit();

    public abstract Bag getBag();

}
