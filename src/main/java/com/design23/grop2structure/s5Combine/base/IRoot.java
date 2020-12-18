package com.design23.grop2structure.s5Combine.base;

import java.util.ArrayList;

//公司的人事架构是这样的吗
//最容易想到的组织架构类图
public interface IRoot {
    //得到总经理的信息
    public String getInfo();

    //总经理下边要有小兵，那要能增加小兵，比如研发部总经理，这是个树枝节点
    public void add(IBranch branch);

    //那要能增加树叶节点
    public void add(ILeaf leaf);

    //既然能增加，那还要能够遍历，不可能总经理不知道他手下有哪些人 public
    ArrayList getSubordinateInfo();
}
