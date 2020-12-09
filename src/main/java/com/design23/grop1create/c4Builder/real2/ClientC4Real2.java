package com.design23.grop1create.c4Builder.real2;

public class ClientC4Real2 {
    public static void main(String[] args) {
        Director director = new Director();
        //1万辆A类型的奔驰车
        for (int i = 0; i < 3; i++) {
            director.getABenzModel().run();
        }
        //100万辆B类型的奔驰车
        for (int i = 0; i < 4; i++) {
            director.getBBenzModel().run();
        }
        //1000万辆C类型的宝马车
        for (int i = 0; i < 5; i++) {
            director.getCBMWModel().run();
        }
    }
}
