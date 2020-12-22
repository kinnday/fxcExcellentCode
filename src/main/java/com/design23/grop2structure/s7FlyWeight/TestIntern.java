package com.design23.grop2structure.s7FlyWeight;

public class TestIntern {
    public static void main(String[] args) {
        String str1 = "和谐";
        String str2 = "社会";
        String str3 = "和谐社会";
        String str4;
        str4 = str1 + str2;
//        fxc- 两个不同对象- false
        System.out.println(str3 == str4);
//        intern -直接读取对象池中的数据
//        如果是String的对象池中有该类型的值，则直接返回对象池中的对象，那当然相等了
        str4 = (str1 + str2).intern();
//        fxc- true
        System.out.println(str3 == str4);
    }
}
