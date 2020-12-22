package com.design23.group3behavior.b11Status;

//● State——抽象状态角色
//接口或抽象类，负责对象状态定义，并且封装环境角色以实现状态切换。
//
//● ConcreteState——具体状态角色
//每一个具体状态必须完成两个职责：本状态的行为管理以及趋向状态处理，通俗地说，就是本状态下要做的事情，以及本状态如何过渡到其他状态。
//
//● Context——环境角色
//定义客户端需要的接口，并且负责具体状态的切换。


//使用场景
//● 行为随状态改变而改变的场景
//这也是状态模式的根本出发点，例如权限设计，人员的状态不同即使执行相同的行为结果也会不同，在这种情况下需要考虑使用状态模式。
//
//● 条件、分支判断语句的替代者
//在程序中大量使用switch语句或者if判断语句会导致程序结构不清晰，逻辑混乱，使用状态模式可以很好地避免这一问题，它通过扩展子类实现了条件的判断处理。