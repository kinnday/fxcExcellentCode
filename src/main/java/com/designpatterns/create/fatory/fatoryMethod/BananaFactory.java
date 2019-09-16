package com.designpatterns.create.fatory.fatoryMethod;

import com.designpatterns.entity.fruit.Banana;
import com.designpatterns.entity.Fruit;

/**
 * 工厂方法模式
 */
public class BananaFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Banana();
    }
}
