package com.designpatterns.create.fatory.abstractFactory;

import com.designpatterns.entity.Bag;
import com.designpatterns.entity.Fruit;
import com.designpatterns.entity.bag.BananaBag;
import com.designpatterns.entity.fruit.Banana;

/**
 * 水果工厂
 */
public class BananaFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
