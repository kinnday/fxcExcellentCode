package com.design23.grop2structure.s3Proxy.dynamicproxy;

import com.design23.grop2structure.s3Proxy.GamePlayer;
import com.design23.grop2structure.s3Proxy.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

// 压轴大戏-动态代理
//既没有创建代理类，也没有实现IGamePlayer接口，这就是动态代理。
public class ClientProxy {
    public static void main(String[] args) throws Throwable {
        //定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        //定义一个handler
        InvocationHandler handler = new GamePlayIH(player);
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        //获得类的class loader
        ClassLoader cl = player.getClass().getClassLoader();
        //动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        //登录
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