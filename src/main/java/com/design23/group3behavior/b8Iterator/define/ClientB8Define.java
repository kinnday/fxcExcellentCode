package com.design23.group3behavior.b8Iterator.define;

//如果你是做Java开发，尽量不要自己写迭代器模式！
// 省省吧，使用Java提供的Iterator一般就能满足你的要求了。
public class ClientB8Define {
    public static void main(String[] args) {
        //声明出容器
        Aggregate agg = new ConcreteAggregate();
        //产生对象数据放进去
        agg.add("abc");
        agg.add("aaa");
        agg.add("1234");
        //遍历一下
        Iterator iterator = agg.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

//abc
//aaa
//1234

