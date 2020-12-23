package com.design23.perfectworld.p2FactorymethodStrategy.standard;

public enum StrategyMan {
    SteadyDeduction(SteadyDeduction.class.getName()),
    FreeDeduction(FreeDeduction.class.getName());
    String value = "";

    private StrategyMan(String _value) {
        this.value = _value;
    }

    public String getValue() {
        return this.value;
    }
}
