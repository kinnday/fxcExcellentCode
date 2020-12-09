package com.design23.grop1create.c4Builder.standard;

//导演类起到封装的作用，避免高层模块深入到建造者内部的实现类。
// 当然，在建造者模式比较庞大时，导演类可以有多个。

//建造者模式的注意事项
// 建造者模式关注的是零件类型和装配工艺（顺序），这是它与工厂方法模式最大不同的地方，虽然同为创建类模式，但是注重点不同。
public class Director {
    private Builder builder = new ConcreteProduct();

    //构建不同的产品
    public Product getAProduct() {
        builder.setPart();
        /* * 设置不同的零件，产生不同的产品 */
        return builder.buildProduct();
    }
}
