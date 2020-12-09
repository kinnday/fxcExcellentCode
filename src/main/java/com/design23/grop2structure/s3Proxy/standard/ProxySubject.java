package com.design23.grop2structure.s3Proxy.standard;

public class ProxySubject implements Subject {
    //要代理哪个实现类
    private Subject subject = null;

    //默认被代理者
    public ProxySubject() {
        this.subject = new ProxySubject();
    }

    //通过构造函数传递代理者
    public ProxySubject(Object... objects) {
    }

    //实现接口中定义的方法
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    //预处理
    private void before() {
        //do something
    }

    //善后处理
    private void after() {
        //do something
    }
}
