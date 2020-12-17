package com.design23.grop2structure.s1Adaptor.extend;

import com.design23.grop2structure.s1Adaptor.standard.IUserInfo;

//OuterUserInfo变成了委托服务，把IUserInfo接口需要的所有的操作都委托给其他三个接口下的实现类，
// 它的委托是通过对象层次的关联关系进行委托的，而不是继承关系。
// 我们需要给这种适配器起个名字，就是对象适配器，
//
// 我们之前讲的通过继承进行的适配，叫做类适配器
public class ClientS1Extend {
    public static void main(String[] args) {
        //外系统的人员信息
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
        //传递三个对象
        IUserInfo youngGirl = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
        //从数据库中查到101个
        for (int i = 0; i < 10; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
