package com.designpatterns.create.fatory.fatoryMethod;

import com.designpatterns.entity.Bag;
import com.designpatterns.entity.Fruit;

/**
 * 水果店测试
 * Created by Peter on 10/8 008.
 */
public class FruitStoreTest {

    private static FruitFactory fruitFactory;
    private static BagFactory bagFactory;

    public static void main(String[] args) {
        pack();
    }

    /**
     * 邮寄打包
     * 一种类型一个工厂，继承统一接口，满足开闭原则
     */
    public static void pack(){
        //初始化苹果工厂
        fruitFactory = new AppleFactory();//猎取工厂不对应
        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();

        //初始化苹果包装工厂
        bagFactory = new BananaBagFactory();
        Bag bag = bagFactory.getBag();

        bag.pack();

        //....邮寄业务
    }


}
