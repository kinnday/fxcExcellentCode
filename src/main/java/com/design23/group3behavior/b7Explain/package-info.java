package com.design23.group3behavior.b7Explain;

//● AbstractExpression——抽象解释器
//具体的解释任务由各个实现类完成，具体的解释器分别由TerminalExpression和Non-terminalExpression完成。
//
//● TerminalExpression——终结符表达式
//实现与文法中的元素相关联的解释操作，通常一个解释器模式中只有一个终结符表达式，但有多个实例，对应不同的终结符。具体到我们例子就是VarExpression类，表达式中的每个终结符都在栈中产生了一个VarExpression对象。
//
//● NonterminalExpression——非终结符表达式
//文法中的每条规则对应于一个非终结表达式，具体到我们的例子就是加减法规则分别对应到AddExpression和SubExpression两个类。非终结符表达式根据逻辑的复杂程度而增加，原则上每个文法规则都对应一个非终结符表达式。
//
//● Context——环境角色
//具体到我们的例子中是采用HashMap代替。



//使用的场景
//● 重复发生的问题可以使用解释器模式
//● 一个简单语法需要解释的场景