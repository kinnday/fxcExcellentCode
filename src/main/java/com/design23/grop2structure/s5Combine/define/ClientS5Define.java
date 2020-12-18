package com.design23.grop2structure.s5Combine.define;

//只要是树形结构，就要考虑使用组合模式
public class ClientS5Define {
    public static void main(String[] args) {
        //创建一个根节点
        Composite root = new Composite();
        root.doSomething();
        //创建一个树枝构件
        Composite branch = new Composite();
        //创建一个叶子节点
        Leaf leaf = new Leaf();
        //建立整体
        root.add(branch);
        branch.add(leaf);
    }

//    Component-doSomething


    //通过递归遍历树
    public static void display(Composite root) {
        for (Component c : root.getChildren()) {
            if (c instanceof Leaf) {
                //叶子节点
                c.doSomething();

            } else {
                //树枝节点
                display((Composite) c);
            }
        }
    }

}
