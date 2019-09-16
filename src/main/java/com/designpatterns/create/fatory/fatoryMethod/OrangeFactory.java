package com.designpatterns.create.fatory.fatoryMethod;

import com.designpatterns.entity.Fruit;
import com.designpatterns.entity.fruit.Orange;

/**
 * 工厂方法模式
 */
public class OrangeFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Orange("Peter",80);
    }
}
