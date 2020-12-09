package com.design23.grop2structure.s3Proxy.mustproxy;

//强制代理的概念就是要从真实角色查找到代理角色，不允许直接访问真实角色。
// 高层模块只要调用getProxy就可以访问真实角色的所有方法，它根本就不需要产生一个代理出来，代理的管理已经由真实角色自己完成
public class ClientS3MustProxyOK {
    public static void main(String[] args) {
        //定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三");
        //获得指定的代理
        IGamePlayer proxy = player.getProxy();
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