package com.designpatterns.structure.adapter;

import com.designpatterns.entity.bag.AppleBag;
import com.designpatterns.entity.bag.OrangeBag;

/**
 * 桔子包装适配器
 */
public class OrangeBagAdapter extends OrangeBag {
    private AppleBag appleBag;

//    经典使用：mybatis-log模块
    public OrangeBagAdapter(AppleBag appleBag){
        this.appleBag = appleBag;
    }

    @Override
    public void pack() {
        appleBag.pack();
    }
}
