package com.design23.group3behavior.b3Strategy.extend;

public class CalculatorGood {
    //加符号
    private final static String ADD_SYMBOL = "+";
    //减符号
    private final static String SUB_SYMBOL = "-";

    public int exec(int a, int b, String symbol) {
        return symbol.equals(ADD_SYMBOL) ? a + b : a - b;
    }
}
