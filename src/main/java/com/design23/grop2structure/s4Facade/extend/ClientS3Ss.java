package com.design23.grop2structure.s4Facade.extend;

public class ClientS3Ss {
    public static void main(String[] args) {
        //现代化的邮局，有这项服务，邮局名称叫Hell Road
        ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
        //你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作
        //定义一个地址
        String address = "Happy Road No. 666,God Province,Heaven";
        //信的内容
        String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to....";
        //你给我发送吧
        hellRoadPostOffice.sendLetter(context, address);
    }

}

//填写信的内容...Hello,It's me,do you know who I am? I'm your old lover. I'd like to....
//填写收件人地址及姓名...Happy Road No. 666,God Province,Heaven
//com.design23.grop2structure.s4Facade.base.LetterProcessImpl@7adf9f5f 信件已经检查过了...
//把信放到信封中...
//邮递信件...