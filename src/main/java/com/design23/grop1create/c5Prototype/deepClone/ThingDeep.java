package com.design23.grop1create.c5Prototype.deepClone;

import java.util.ArrayList;

//构造函数不会被执行
public class ThingDeep implements Cloneable {
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    public ThingDeep clone() {
        ThingDeep thing = null;
        try {
            thing = (ThingDeep) super.clone();
//          私有变量也拷贝
//            对私有的类变量进行独立的拷贝
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
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
