package com.design23.group3behavior.b3Strategy.enum2;

import java.util.Arrays;

//策略枚举是一个非常优秀和方便的模式，但是它受枚举类型的限制，
// 每个枚举项都是public、final、static的，扩展性受到了一定的约束，
// 因此在系统开发中，策略枚举一般担当不经常发生变化的角色。
public class ClientB3Enum {
    public static void main(String[] args) {
        args = new String[]{"122","-","333"};
        //输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        //符号
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为：" + Arrays.toString(args));
        System.out.println("运行结果为：" + a + symbol + b + "=" + Calculator.ADD.exec(a, b));
    }
}

//输入的参数为：[122, -, 333]
//运行结果为：122-333=455
