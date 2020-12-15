package com.design23.grop1create.c5Prototype;

import com.design23.grop1create.c5Prototype.base0.AdvTemplate;

import java.util.Random;

// 标准的原型实现...
public class ClietMainC5Standard {

    //发送账单的数量，这个值是从数据库中获得
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        //模拟发送邮件
        int i = 0;
        //把模板定义出来，这个是从数据中获得
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
            //以下是每封邮件不同的地方
//           fxc- 这种不通过new关键字来产生一个对象，而是通过对象复制来实现的模式就叫做原型模式。
            Mail cloneMail = mail.clone();

            cloneMail.setAppellation(getRandString(5) + " 先生（女士）");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            //然后发送邮件
            sendMail(cloneMail);
            i++;
        }
    }

    //发送邮件
    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人： " + mail.getReceiver() + "\t...发送成功！");
    }

    //获得指定长度的随机字符串
    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}

//标题：XX银行国庆信用卡抽奖活动	收件人： KOVAX@oEukvjEf.com	...发送成功！
//        标题：XX银行国庆信用卡抽奖活动	收件人： nJdYs@UbGrmeBq.com	...发送成功！
//        标题：XX银行国庆信用卡抽奖活动	收件人： rjEBM@lvwBLXCR.com	...发送成功！
//        标题：XX银行国庆信用卡抽奖活动	收件人： PQyJR@RSjauwWO.com	...发送成功！
//        标题：XX银行国庆信用卡抽奖活动	收件人： nhknC@QWsHdXEM.com	...发送成功！
//        标题：XX银行国庆信用卡抽奖活动	收件人： RvBXH@VAodgIVJ.com	...发送成功！