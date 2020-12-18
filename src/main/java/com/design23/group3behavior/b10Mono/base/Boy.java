package com.design23.group3behavior.b10Mono.base;

//如此追女孩子，你还不乐
//尼古拉斯·凯奇主演的《Next》（中文译名为《预见未来》）
public class Boy {
    //男孩的状态
    private  String state = "";
    //认识女孩子后状态肯定改变，比如心情、手中的花等
    public void changeState(){
        this.state = "心情可能很不好";
    }
    public  String getState() { return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
