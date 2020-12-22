package com.design23.grop2structure.s6Bridge.standard;

//使用快速变化的类图
// 抽象产品类
public abstract class Product {
    //甭管是什么产品它总要能被生产出来
    public abstract void beProducted();
    //生产出来的东西，一定要销售出去，否则亏本
    public abstract void beSelled();
}
