package com.designpatterns.create.fatory.abstractFactory;

import com.designpatterns.entity.Bag;
import com.designpatterns.entity.Fruit;
import com.designpatterns.entity.bag.AppleBag;
import com.designpatterns.entity.fruit.Apple;

/**
 * 水果工厂
 */
public class AppleFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
