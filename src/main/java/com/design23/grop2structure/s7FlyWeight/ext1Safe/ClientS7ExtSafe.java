package com.design23.grop2structure.s7FlyWeight.ext1Safe;

import com.design23.grop2structure.s7FlyWeight.base.SignInfo;

// 设置的享元对象数量太少，导致每个线程都到对象池中获得对象，然后都去修改其属性，于是就出现一些不和谐数据。
public class ClientS7ExtSafe {
    public static void main(String[] args) {
        //在对象池中初始化4个对象
        SignInfoFactory.getSignInfo("科目1");
        SignInfoFactory.getSignInfo("科目2");
        SignInfoFactory.getSignInfo("科目3");
        SignInfoFactory.getSignInfo("科目4");
        //取得对象
        SignInfo signInfo = SignInfoFactory.getSignInfo("科目2");
        while (true) {
            signInfo.setId("ZhangSan");
            signInfo.setLocation("ZhangSan");
            (new MultiThread(signInfo)).start();
            signInfo.setId("LiSi");
            signInfo.setLocation("LiSi");
            (new MultiThread(signInfo)).start();
        }
    }
}
//编号：ZhangSan
//考试地址：LiSi
//线程不安全了！


//享元模式是让我们使用共享技术，而Java的多线程又有如此问题，该如何设计呢？
//没什么可以参考的标准，只有依靠经验，在需要的地方考虑一下线程安全，在大部分的场景下都不用考虑。
//我们在使用享元模式时，对象池中的享元对象尽量多，多到足够满足业务为止。
