package com.design23.grop1create.c4Builder.standard;

//抽象建造者
public abstract class Builder {
    //设置产品的不同部分，以获得不同的产品
//其中，setPart方法是零件的配置
    public abstract void setPart();

    //建造产品
    public abstract Product buildProduct();
}
