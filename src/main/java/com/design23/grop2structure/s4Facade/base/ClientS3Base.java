package com.design23.grop2structure.s4Facade.base;

public class ClientS3Base {
    public static void main(String[] args) {
        //创建一个处理信件的过程
        ILetterProcess letterProcess = new LetterProcessImpl();
        //开始写信
        letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your old lover. I'd like to...");
        //开始写信封
        letterProcess.fillEnvelope("Happy Road No. 666,God Province,Heaven");
        //把信放到信封里，并封装好
        letterProcess.letterInotoEnvelope();
        //跑到邮局把信塞到邮箱，投递
        letterProcess.sendLetter();
    }
}
//填写信的内容...Hello,It's me,do you know who I am? I'm your old lover. I'd like to...
//填写收件人地址及姓名...Happy Road No. 666,God Province,Heaven
//把信放到信封中...
//邮递信件...