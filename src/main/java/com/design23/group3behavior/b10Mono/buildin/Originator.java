package com.design23.group3behavior.b10Mono.buildin;

//使用内置类的备忘录模式
public class Originator {
    //内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建一个备忘录
    public IMemento createMemento() {
        return new Memento(this.state);
    }

    //恢复一个备忘录
    public void restoreMemento(IMemento _memento) {
        this.setState(((Memento) _memento).getState());
    }


//    内置类Memento全部是private的访问权限，也就是说除了发起人外，别人休想访问到，
//    那如果要产生关联关系又应如何处理呢？
//    通过接口！别忘记了我们还有一个空接口是公共的访问权限，
    //内置类
    private class Memento implements IMemento {
        //发起人的内部状态
        private String state = "";

        //构造函数传递参数
        private Memento(String _state) {
            this.state = _state;
        }

        private String getState() {
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }
    }
}
