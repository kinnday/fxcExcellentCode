package com.designpatterns.create.singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class SessionCountEHan {
    private AtomicInteger count = new AtomicInteger(0);

    private static SessionCountEHan instance =new SessionCountEHan();;//饿汉式

    private SessionCountEHan(){
    }


    /***以下是业务方法***/
    public int plus(){
        return count.incrementAndGet();
    }

    public int decrease(){
        return count.decrementAndGet();
    }

    public void showMessage(){
        System.out.println("当前人数："+this.count.get());
    }


}
