package com.design23.group3behavior.b10Mono.extendClone;

//Clone方式的备忘录 - 发起人自主备份和恢复
public class OriginatorSelf implements Cloneable {
    private OriginatorSelf backup;
    //内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建一个备忘录
    public void createMemento() {
        this.backup =  this.clone();
    }

    //恢复一个备忘录
    public void restoreMemento() {
        //在进行恢复前应该进行断言，防止空指针
        this.setState(this.backup.getState());
    }

    //克隆当前对象
    @Override
    protected OriginatorSelf clone() {
        try {
            return (OriginatorSelf) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
