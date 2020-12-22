package com.design23.grop2structure.s6Bridge.base;

//服装公司改头换面后的类图
//iPod山寨公司
public class IPodCorp extends Corp {
    //我开始生产iPod了
    protected void produce() {
        System.out.println("我生产iPod...");
    }
    //山寨的iPod很畅销，便宜嘛
    protected void sell() {
        System.out.println("iPod畅销...");
    }
    //狂赚钱
    public void makeMoney(){ super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}
