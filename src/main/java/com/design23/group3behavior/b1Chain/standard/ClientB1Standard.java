package com.design23.group3behavior.b1Chain.standard;

import com.design23.group3behavior.b1Chain.base.IWomen;

import java.util.ArrayList;
import java.util.Random;

public class ClientB1Standard {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen>  arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
//        定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
//        设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : arrayList) {
            father.HandleMessage(women);
        }
    }
}

//--------女儿向父亲请示-------
//女儿的请求是：我要出去逛街
//父亲的答复是:同意
//
//--------女儿向父亲请示-------
//女儿的请求是：我要出去逛街
//父亲的答复是:同意
//
//---没地方请示了，按不同意处理---
//
//---没地方请示了，按不同意处理---
//
//--------女儿向父亲请示-------
//女儿的请求是：我要出去逛街
//父亲的答复是:同意