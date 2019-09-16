package com.designpatterns.entity.fruit;

import com.designpatterns.action.visit.Visit;
import com.designpatterns.entity.Fruit;
import com.designpatterns.entity.bag.OrangeBag;

/**
 * 桔子
 * Created by Peter on 10/9 009.
 */
public class Orange implements Fruit {
    private String name = "";
    private int price = 70;

    public Orange(String name,int price){
        this.price = price;
        this.name = name;
    }

    public void pack(OrangeBag bag){
        bag.pack();
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public void draw() {
        System.out.print("砂糖桔");
    }

//    fxc-访问者模式-双重委派，这里的this指代 Orange对象，而不是 Fruit.
    public int accept(Visit visit){
        return visit.sell(this);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
