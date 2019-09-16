package com.designpatterns.structure.proxy;

import com.designpatterns.service.OrderService;
import com.designpatterns.service.impl.OutOrderServiceImpl;

public class ProxyOrder implements OrderService {

    //真实的订单服务
    private OrderService orderService = new OutOrderServiceImpl();

//    静态代理- 当对外部开放流程类服务时建议使用
    @Override
    public int saveOrder() {
        System.out.println("开始海外下订单");
        return orderService.saveOrder();
    }
}
