package com.design23.group3behavior.b3Strategy.extend;

import java.util.Arrays;

public class ClientB3Extend1 {
    public static void main(String[] args) {

        args = new String[]{"22","-","333"};
        //输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        //符号
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为：" + Arrays.toString(args));
        //生成一个运算器
        Calculator cal = new Calculator();
        System.out.println("运行结果为：" + a + symbol + b + "=" + cal.exec(a, b, symbol));
    }
}

//输入的参数为：[22, -, 333]
//运行结果为：22-333=-311
