package com.designpatterns.structure.facade;

/**
 * 客户服务一条龙
 * fxc-对外提供一个接口即可，内部实现一系列流程处理
 */
public class CustomerClient {


    public static void main(String[] args){
//        doOrderFacade();
        doOrder();
    }

//    普通方式调用
    public static void doOrder(){

        PickService pickService = new PickService();
        PackService packService = new PackService();
        SendService sendService = new SendService();

        //采摘
        System.out.println("--------------");
        pickService.doPick();

        //包装
        System.out.println("--------------");
        packService.doPack();
        //快递
        System.out.println("--------------");
        sendService.doSend();

    }

//    外观模式
    public static void doOrderFacade(){
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.doOrder();
    }


}
