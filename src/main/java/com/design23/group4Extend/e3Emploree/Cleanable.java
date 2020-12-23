package com.design23.group4Extend.e3Emploree;

//可以被清洁的对象
public interface Cleanable {
    //被清洁
    public void celaned();
}

//花园
class Garden implements Cleanable {
    public void celaned() {
        System.out.println("花园被清洁干净");
    }
}

//厨房
class Kitchen implements Cleanable {
    public void celaned() {
        System.out.println("厨房被清洁干净");
    }
}

//衣服
class Cloth implements Cleanable {
    public void celaned() {
        System.out.println("衣服被清洁干净");
    }
}