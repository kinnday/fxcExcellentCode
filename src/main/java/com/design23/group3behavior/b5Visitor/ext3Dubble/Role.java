package com.design23.group3behavior.b5Visitor.ext3Dubble;

//双分配
//单分派语言处理一个操作是根据请求者的名称和接收到的参数决定的，
// 在Java中有静态绑定和动态绑定之说，它的实现是依据重载（overload）和覆写（override）实现的
public interface Role {
//
    //演员要扮演的角色
//演员要扮演的角色
public void accept(AbsActor actor);
}
