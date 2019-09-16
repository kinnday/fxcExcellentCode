package com.designpatterns.action.strategy;

import com.designpatterns.action.template.OtherPayShopping;
import com.designpatterns.action.template.ShoppingCart;
import com.designpatterns.create.fatory.simple.StaticFactory;
import com.designpatterns.entity.Fruit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * fxc-策略模式-注入不同对象，改变行为； 面向接口编程！！， 即为 IOC的思想
 */
public class DiscountClient {


    public static void main(String[] args) {
        Discount discount1= new FullDiscount();
        Discount discount2= new HolidayDiscount();
        Discount discount3= new NewerDiscount();
        Discount discount4= new SecondDiscount();
        discount1.calculate(300);
    }


}
