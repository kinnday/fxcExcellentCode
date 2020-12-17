package com.design23.grop2structure.s1Adaptor.standard;

public class ClientS1 {
    public static void main(String[] args) {
        //没有与外系统连接的时候，是这样写的
        IUserInfo youngGirl = new UserInfo();
        //从数据库中查到101个
        for (int i = 0; i < 11; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
