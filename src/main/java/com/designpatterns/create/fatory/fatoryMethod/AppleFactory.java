package com.designpatterns.create.fatory.fatoryMethod;

import com.designpatterns.entity.fruit.Apple;
import com.designpatterns.entity.Fruit;

/**
 * 工厂方法模式
 */
public class AppleFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Apple();
    }
}
