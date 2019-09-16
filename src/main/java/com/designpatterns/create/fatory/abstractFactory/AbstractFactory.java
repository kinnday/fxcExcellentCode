package com.designpatterns.create.fatory.abstractFactory;

import com.designpatterns.entity.Bag;
import com.designpatterns.entity.Fruit;

/**
 * 抽象水果工厂
 */
public abstract class AbstractFactory {
//    一个工厂-包含多个方法，需要具体的实现类工厂实现

    public abstract  Fruit getFruit();

    public abstract Bag getBag();

}
