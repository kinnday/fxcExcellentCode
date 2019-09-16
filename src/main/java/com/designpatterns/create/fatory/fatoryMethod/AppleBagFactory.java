package com.designpatterns.create.fatory.fatoryMethod;

import com.designpatterns.entity.Bag;
import com.designpatterns.entity.bag.AppleBag;

/**
 * 工厂方法模式
 */
public class AppleBagFactory implements BagFactory{
    public Bag getBag(){
        return new AppleBag();
    }
}
