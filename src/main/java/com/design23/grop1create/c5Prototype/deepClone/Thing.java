package com.design23.grop1create.c5Prototype.deepClone;

import java.util.ArrayList;

//构造函数不会被执行
public class Thing implements Cloneable {
    //定义一个私有变量
    private java.util.ArrayList<String>    arrayList = new ArrayList<String>();

    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
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
