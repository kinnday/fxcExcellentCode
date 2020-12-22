package com.design23.group3behavior.b7Explain.define;

public class NonterminalExpression extends Expression {
    //每个非终结符表达式都会对其他表达式产生依赖
    public NonterminalExpression(Expression... expression){
    }
    public Object interpreter(Context ctx) {
        //进行文法处理
        return null;
    }
}
