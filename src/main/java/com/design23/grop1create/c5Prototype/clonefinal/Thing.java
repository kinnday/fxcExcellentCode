package com.design23.grop1create.c5Prototype.clonefinal;

import java.util.ArrayList;

// 注意　要使用clone方法，类的成员变量上不要增加final关键字。
public class Thing implements Cloneable {
//    仅仅增加了一个final关键字，然后编译器就报斜体部分错误
//    final类型你还想重赋值呀！你要实现深拷贝的梦想在final关键字的威胁下破灭了
    private final ArrayList<String>    arrayList = new ArrayList<String>();

    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
//            对私有的类变量进行独立的拷贝
//            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    //设置HashMap的值
    public void setValue(String value) {
        this.arrayList.add(value);
    }

    //取得arrayList的值
    public ArrayList<String> getValue() {
        return this.arrayList;
    }

}
