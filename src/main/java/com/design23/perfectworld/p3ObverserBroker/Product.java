package com.design23.perfectworld.p3ObverserBroker;

public class Product implements Cloneable {

    public Product clone( ){
        Product p = null;
        try{
            p = (Product) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return  p ;
    }
}
