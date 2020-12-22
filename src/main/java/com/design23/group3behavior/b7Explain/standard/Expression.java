package com.design23.group3behavior.b7Explain.standard;

import java.util.HashMap;

//初步分析加减法类图
//抽象表达式类
public abstract class Expression {

    //解析公式和数值，其中var中的key值是公式中的参数，value值是具体的数字
    public abstract int interpreter(HashMap<String,Integer> var);
}
