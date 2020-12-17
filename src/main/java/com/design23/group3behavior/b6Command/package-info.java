package com.design23.group3behavior.b6Command;
/***
  * @Author: fu.xc
  * @Description: 命令模式定义
 * ● Receive接收者角色
 * 该角色就是干活的角色，命令传递到这里是应该被执行的，具体到我们上面的例子中就是Group的三个实现类。
 *
 * ● Command命令角色
 * 需要执行的所有命令都在这里声明。
 *
 * ● Invoker调用者角色
 * 接收到命令，并执行命令。在例子中，我（项目经理）就是这个角色。
  * @Date: 2020/12/15
 *
 * 缺点：
 * 请看Command的子类：如果有N个命令，问题就出来了，Command的子类就可不是几个，而是N个，这个类膨胀得非常大
  **/