package com.design23.grop2structure.s3Proxy.personality;

import com.design23.grop2structure.s3Proxy.GamePlayer;
import com.design23.grop2structure.s3Proxy.IGamePlayer;

//代理类不仅仅是可以有自己的运算方法，
// 通常的情况下代理的职责并不一定单一，它可以组合其他的真实角色，
// 也可以实现自己的职责，比如计算费用。
// 代理类可以为真实角色预处理消息、过滤消息、消息转发、事后处理消息等功能。
// 当然一个代理类，可以代理多个真实角色，并且真实角色之间可以有耦合关系
public class ClientS3Person {
    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayer("王五");
        //然后再定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy(gamePlayer);
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
//登录名为zhangSan的用户王五登录成功！
//王五在打怪！
//王五 又升了一级！
//升级总费用是：150元
//结束时间是：2009-8-26 03:40
