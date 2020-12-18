package com.design23.group3behavior.b2Observer.clust;

import com.design23.group3behavior.b2Observer.base.IHanFeiZi;
import com.design23.group3behavior.b2Observer.base.ILiSi;
import com.design23.group3behavior.b2Observer.base.LiSi;

//通过聚集方式的被观察者
public class HanFeiZi implements IHanFeiZi {
    //把李斯声明出来
    private ILiSi liSi =new LiSi();
    //韩非子要吃饭了
    public void haveBreakfast(){
        System.out.println("韩非子:开始吃饭了...");
        //通知李斯
        this.liSi.update("韩非子在吃饭");
    }
    //韩非子开始娱乐了
    public void haveFun(){
        System.out.println("韩非子:开始娱乐了...");
        this.liSi.update("韩非子在娱乐");
    }
}