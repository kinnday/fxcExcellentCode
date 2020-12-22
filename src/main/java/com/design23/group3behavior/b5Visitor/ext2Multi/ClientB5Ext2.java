package com.design23.group3behavior.b5Visitor.ext2Multi;

import com.design23.group3behavior.b5Visitor.standard.ClientB5Standard;
import com.design23.group3behavior.b5Visitor.standard.Employee;

public class ClientB5Ext2 {
    public static void main(String[] args) {
        //展示报表访问者
        IShowVisitor showVisitor = new ShowVisitor();
        //汇总报表的访问者
        ITotalVisitor totalVisitor = new TotalVisitor();
        for (Employee emp : ClientB5Standard.mockEmployee()) {
            emp.accept(showVisitor);
            //接受展示报表访问者
            emp.accept(totalVisitor);
            //接受汇总表访问者
        }
        //展示报表
        showVisitor.report();
        //汇总报表
        totalVisitor.totalSalary();
    }
}

//姓名：张三	性别：男	薪水：1800	工作：编写Java程序，绝对的蓝领、苦工加搬运工
//姓名：李四	性别：女	薪水：1900	工作：页面美工，审美素质太不流行了！
//姓名：王五	性别：男	薪水：18750	业绩： 基本上是负值，但是我会拍马屁呀
//
//本公司的月工资总额是101150