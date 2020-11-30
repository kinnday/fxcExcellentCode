package com.design23.grop1create.c1Singleton;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.LongStream;

/**
  * @Author: fu.xc
  * @Description: 固定数量的皇帝类(单例， 如线程池)
  * @Date 2020/11/30/030
  **/
public class Emperor {
    private static int maxNum = 2;
    private static ArrayList<String> nameList = new ArrayList();
    private static ArrayList<Emperor> emperorList = new ArrayList();

    private static int currtNum = 0;

    static {
        LongStream.range(0,maxNum).forEach(
                i -> emperorList.add(new Emperor("皇帝-"+i))
        );
    }
    private Emperor(String name){
        nameList.add(name);
    }

    public static Emperor getInstance(){
        Random random = new Random();
        currtNum = random.nextInt(maxNum);
        return emperorList.get(currtNum);
    }

    public static void say(){
        System.out.println(nameList.get(currtNum));
    }
}
