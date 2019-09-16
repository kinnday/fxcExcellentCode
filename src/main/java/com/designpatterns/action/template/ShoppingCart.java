package com.designpatterns.action.template;

import com.designpatterns.action.strategy.Discount;
import com.designpatterns.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板方法模式
 * 购物车费用结算过程
 * fxc-抽象类-定义基本流程，部分方法延迟到子类实现
 */
public abstract class ShoppingCart {
    private Discount discount;
    private List<Fruit> products = new ArrayList<>();

    public ShoppingCart(List<Fruit> products){
        this.products = products;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    //提交订单主流程
    public void submitOrder(){
        //计算商品金额
        int money = balance();
        System.out.println("商品总金额为："+money+"元");

        //优惠减免
        money = discount.calculate(money);
        System.out.println("优惠减免后："+ money+"元，");

        //保存订单
        pay(money);

        //送货上门
        sendHome();

    }

    //计算金额
    private int balance(){
        int money = 0;
        System.out.print("商品清单：");
        for (Fruit fruit : products){
            fruit.draw();
            System.out.print(",");
            money += fruit.price();
        }
        return money;
    }

    private void sendHome(){
        System.out.println("三公里以内，免费送货上门");
    }

    //提交保存
    protected abstract void pay(int money);

}
