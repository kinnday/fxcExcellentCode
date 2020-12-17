package com.design23.grop2structure.s2Decorator.define;

//缺点：多层的装饰是比较复杂的。
// 就像剥洋葱一样，你剥到了最后才发现是最里层的装饰出现了问题，
// 因此，尽量减少装饰类的数量，以便降低系统的复杂度
public class ClientS2Define {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        //第一次修饰
        component = new ConcreteDecorator1(component);
        //第二次修饰
        component = new ConcreteDecorator2(component);
        //修饰后运行
        component.operate();
    }
}

//method1 修饰
//do Something
//method2 修饰