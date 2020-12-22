package com.design23.group3behavior.b11Status.base;

//场景类
public class ClientB11Base {
    public static void main(String[] args) {
        ILift lift = new Lift();
        //首先是电梯门开启，人进去
        lift.open();
        //然后电梯门关闭
        lift.close();
        //再然后，电梯运行起来，向上或者向下
        lift.run();
        //最后到达目的地，电梯停下来
        lift.stop();
    }
}
