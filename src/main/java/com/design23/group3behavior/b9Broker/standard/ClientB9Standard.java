package com.design23.group3behavior.b9Broker.standard;


public class ClientB9Standard {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        //采购人员采购电脑
        System.out.println("------采购人员采购电脑--------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
        //销售人员销售电脑
        System.out.println("\n------销售人员销售电脑--------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        //库房管理人员管理库存
        System.out.println("\n------库房管理人员清库处理--------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
//-----采购人员采购电脑--------
//IBM电脑的销售情况为：53
//采购IBM电脑：50台
//
//------销售人员销售电脑--------
//库存数量为：99
//销售IBM电脑1台
//
//------库房管理人员清库处理--------
//清理存货数量为：99
//折价销售IBM电脑99台
//不再采购IBM电脑
//
//Process finished with exit code 0