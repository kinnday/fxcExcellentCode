package com.design23.grop1create.c2FactoryMethod.simpleFactory;

import com.design23.grop1create.c2FactoryMethod.AbstractHumanFactory;
import com.design23.grop1create.c2FactoryMethod.Human;

//变种： 简单工厂模式
//一个模块仅需要一个工厂类，没有必要把它产生出来，使用静态的方法就可以了
public class SimpleFactoryHuman  {
    public static  <T extends Human> T createHuman(Class<T> clz) {
        Human human = null;
        try{
            human = (T)Class.forName(clz.getName()).newInstance();
        }catch (Exception e){
            System.out.println("人种生成错误！");
        }
        return (T)human;
    }
}
