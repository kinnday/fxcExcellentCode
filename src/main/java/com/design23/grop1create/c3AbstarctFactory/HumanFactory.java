package com.design23.grop1create.c3AbstarctFactory;

//抽象工厂模式是工厂方法模式的升级版本
//缺点就是产品族扩展非常困难
//横向扩展容易，纵向扩展困难
public interface HumanFactory {
//    制造一个黄色人种
    public Human createYellowHuman();
    //制造一个白色人种
    public Human createWhiteHuman();
    //制造一个黑色人种
    public Human createBlackHuman();
}
