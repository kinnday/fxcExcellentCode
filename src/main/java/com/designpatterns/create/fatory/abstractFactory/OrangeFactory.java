package com.designpatterns.create.fatory.abstractFactory;

import com.designpatterns.entity.Bag;
import com.designpatterns.entity.Fruit;
import com.designpatterns.entity.bag.OrangeBag;
import com.designpatterns.entity.fruit.Orange;

/**
 * 水果工厂
 */
public class OrangeFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Orange("Peter",50);
    }

    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
