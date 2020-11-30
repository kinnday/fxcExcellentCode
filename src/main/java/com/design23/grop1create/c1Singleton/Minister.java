package com.design23.grop1create.c1Singleton;

import java.util.stream.LongStream;

//大臣参拜皇帝
public class Minister {

    public static void main(String[] args){
        int num =5;
        LongStream.range(0,5).forEach(
                i -> {
                    Emperor emp  = Emperor.getInstance();
                    System.out.print("第"+(i+1)+"个大臣参拜的是：");
                    emp.say();
                }
        );
    }
}
