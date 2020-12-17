package com.design23.group3behavior.b8Iterator.define;

import java.util.Vector;

//容器实现类
public class ConcreteAggregate implements Aggregate{
    //容纳对象的容器
    private Vector vector = new Vector();

    //增加一个元素
    public void add(Object object) {
        this.vector.add(object);
    }

    //返回迭代器对象
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }

    //删除一个元素
    public void remove(Object object) {
        this.remove(object);
    }
}
