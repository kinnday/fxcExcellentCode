package com.design23.grop2structure.s2Decorator.base;

//17.1 罪恶的成绩单
public abstract class SchoolReport {

    //成绩单主要展示的就是你的成绩情况
    public abstract void report();
    //成绩单要家长签字，这个是最要命的
    public  void sign() {
    }
    public abstract void sign(String name);
}
