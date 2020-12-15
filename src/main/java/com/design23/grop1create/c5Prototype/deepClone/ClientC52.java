package com.design23.grop1create.c5Prototype.deepClone;


//浅拷贝测试
public class ClientC52 {
    public static void main(String[] args) {
        //产生一个对象
        Thing thing = new Thing();
        //设置一个值
        thing.setValue("张三");
        //拷贝一个对象
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }
}
//[张三, 李四]