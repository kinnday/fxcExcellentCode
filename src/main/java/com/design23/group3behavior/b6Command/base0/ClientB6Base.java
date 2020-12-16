package com.design23.group3behavior.b6Command.base0;

public class ClientB6Base {

    public static void main(String[] args) {
        //首先客户找到需求组说，过来谈需求，并修改
        System.out.println("-----------客户要求增加一项需求---------------");
        Group rg = new RequirementGroup();
        //找到需求组
        rg.find();
        //增加一个需求
        rg.add();
        //要求变更计划
        rg.plan();


        //首先客户找到美工组说，过来谈页面，并修改
        System.out.println("----------客户要求删除一个页面--------------");
        Group pg = new PageGroup();
        //找到需求组
        pg.find();
        //删除一项需求
        pg.delete();
        //要求变更计划
        pg.plan();
    }
}
//-----------客户要求增加一项需求---------------
//找到需求组...
//客户要求增加一项需求...
//客户要求需求变更计划...