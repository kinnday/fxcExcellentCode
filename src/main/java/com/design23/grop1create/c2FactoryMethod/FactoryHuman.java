package com.design23.grop1create.c2FactoryMethod;

public class FactoryHuman extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> clz) {
        Human human = null;
        try{
            human = (T)Class.forName(clz.getName()).newInstance();
        }catch (Exception e){
            System.out.println("人种生成错误！");
        }
        return (T)human;
    }
}
