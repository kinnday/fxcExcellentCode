package com.designpatterns.create.fatory.fatoryMethod;

import com.designpatterns.entity.Bag;
import com.designpatterns.entity.bag.BananaBag;

/**
 * 工厂方法模式
 */
public class BananaBagFactory implements BagFactory{
    public Bag getBag(){
        return new BananaBag();
    }
}
