package com.design23.grop2structure.s4Facade.defineContext;


import com.design23.grop2structure.s4Facade.define.ClassA;
import com.design23.grop2structure.s4Facade.define.ClassC;

// 封装类
public class Context {
    //委托处理
    private ClassA a = new ClassA();
    private ClassC c = new ClassC();
    //复杂的计算
    public void complexMethod(){
        this.a.doSomethingA();
        this.c.doSomethingC();
    }

}
