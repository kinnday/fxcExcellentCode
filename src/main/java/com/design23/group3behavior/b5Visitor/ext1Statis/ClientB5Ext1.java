package com.design23.group3behavior.b5Visitor.ext1Statis;

import com.design23.group3behavior.b5Visitor.standard.ClientB5Standard;
import com.design23.group3behavior.b5Visitor.standard.Employee;

public class ClientB5Ext1 {
    public static void main(String[] args) {
        IVisitor visitor = new Visitor();
        for (Employee emp : ClientB5Standard.mockEmployee()) {
//            emp.accept(visitor);
        }
        System.out.println("本公司的月工资总额是：" + visitor.getTotalSalary());
    }
}
