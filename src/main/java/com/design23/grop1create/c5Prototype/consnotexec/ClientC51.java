package com.design23.grop1create.c5Prototype.consnotexec;

//对象拷贝时构造函数确实没有被执行，这点从原理来讲也是可以讲得通的，
// Object类的clone方法的原理是从内存中（具体地说就是堆内存）以二进制流的方式进行拷贝，重新分配一个内存块，那构造函数没有被执行也是非常正常的了。
public class ClientC51 {
    public static void main(String[] args) {
        //产生一个对象
        Thing thing = new Thing();
        //拷贝一个对象
        Thing cloneThing = thing.clone();
    }
}
