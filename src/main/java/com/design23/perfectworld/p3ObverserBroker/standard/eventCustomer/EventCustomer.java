package com.design23.perfectworld.p3ObverserBroker.standard.eventCustomer;

import com.design23.perfectworld.p3ObverserBroker.standard.ProductEvent;

import java.util.Vector;

//定义了3个事件处理者，分别是乞丐、平民和贵族。
// 乞丐只能获得别人遗弃的物品，
// 平民消费自己生产的东西，自给自足，
// 而贵族则可以获得精修的产品或者是绿色产品（也就是我们这里的克隆产品，不用自己劳动获得的产品）

//抽象的事件处理者
public abstract class EventCustomer {
    //容纳每个消费者能够处理的级别
    private Vector<EventCustomType> customType = new Vector<EventCustomType>();

    //每个消费者都要声明自己处理哪一类别的事件
    public EventCustomer(EventCustomType _type) {
        addCustomType(_type);
    }

    //每个消费者可以消费多个事件
    public void addCustomType(EventCustomType _type) {
        customType.add(_type);
    }

    //得到自己的处理能力
    public Vector<EventCustomType> getCustomType() {
        return customType;
    }

    //每个事件都要对事件进行声明式消费
    public abstract void exec(ProductEvent event);
}
