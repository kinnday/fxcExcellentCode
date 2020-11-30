package com.design23.group4Extend.e5NullObject;

// 传统写法
public class Person  {
    public void hear(Animal animal){
        if(animal !=null){
            animal.makeSound();
        }
    }
}
