package com.design23.grop1create.c2FactoryMethod.replaceSingleton;

import java.lang.reflect.Constructor;

// 变种3： 替代单例模式
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try{
            Class cl = Class.forName(Singleton.class.getName());
            Constructor constructor = cl.getConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        }catch (Exception e){

        }
    }
    public static Singleton getSingleton(){
        return singleton;
    }
}
