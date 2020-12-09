package com.design23.grop2structure.s3Proxy.personality;

import com.design23.grop2structure.s3Proxy.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer, IProxy {
    private IGamePlayer gamePlayer = null;

    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }

    //代练杀怪
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    //代练登录
    public void login(String user,
                      String password) {
        this.gamePlayer.login(user, password);
    }

    //代练升级
    //实现了IProxy接口，同时在upgrade方法中调用该方法，完成费用结算，其他的类都没有任何改动，运行结果如下：
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    //计算费用
    public void count() {
        System.out.println("升级总费用是：150元");
    }
}
