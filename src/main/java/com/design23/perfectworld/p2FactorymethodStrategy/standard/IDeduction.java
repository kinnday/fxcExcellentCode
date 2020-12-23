package com.design23.perfectworld.p2FactorymethodStrategy.standard;

// 扣款策略接口
public interface IDeduction {

    //扣款，提供交易和卡信息，进行扣款，并返回扣款是否成功
    public boolean exec(Card card,Trade trade);
}
