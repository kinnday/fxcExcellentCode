package com.design23.group3behavior.b1Chain.standard;

import com.design23.group3behavior.b1Chain.base.IWomen;

public class Father extends Handler {
    //父亲只处理女儿的请求
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    //父亲的答复
    protected void response(IWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
