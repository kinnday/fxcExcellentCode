package com.design23.group3behavior.b3Strategy.extend;

public class Context {
    private CalculatorGood cal = null;

    public Context(CalculatorGood _cal) {
        this.cal = _cal;
    }

    public int exec(int a, int b, String symbol) {
        return this.cal.exec(a, b,symbol);
    }
}
