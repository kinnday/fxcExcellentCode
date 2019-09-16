package com.designpatterns.entity;

import com.designpatterns.action.visit.Visit;

/**
 * 水果接口
 */
public interface Fruit {

    int price();

    void draw();

//  访问者模式，增加accept方法
    int accept(Visit visit);

}
