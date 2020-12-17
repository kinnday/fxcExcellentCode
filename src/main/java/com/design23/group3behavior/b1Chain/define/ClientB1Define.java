package com.design23.group3behavior.b1Chain.define;

//责任链有两个非常显著的缺点：
// 一是性能问题，每个请求都是从链头遍历到链尾，特别是在链比较长的时候，性能是一个非常大的问题。
// 二是调试不很方便，特别是链条比较长，环节比较多的时候，由于采用了类似递归的方式，调试的时候逻辑可能比较复杂。
public class ClientB1Define {
    public static void main(String[] args) {
        //声明所有的处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        //设置链中的阶段顺序1-->2-->3
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        //提交请求，返回结果
        Response response = handler1.handleMessage(new Request());
    }
}
