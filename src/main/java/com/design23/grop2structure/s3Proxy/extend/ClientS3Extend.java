package com.design23.grop2structure.s3Proxy.extend;

import com.design23.grop2structure.s3Proxy.IGamePlayer;

//代理模式扩展
public class ClientS3Extend {
    public static void main(String[] args) {
        //然后再定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy("张三");
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        proxy.login("zhangSan", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");
    }
}

//开始时间是：2009-8-25 10:45
//登录名为zhangSan的用户张三登录成功！
//张三在打怪！
//张三 又升了一级！
//结束时间是：2009-8-26 03:40