package com.design23.grop2structure.s2Decorator.base;

public class ClientFather2Sugar {
    public static void main(String[] args) {
        //把成绩单拿过来
//        SchoolReport sr = new FouthGradeSchoolReport();
        SchoolReport sr = new SugarFouthGradeSchoolReport();
        //看成绩单
        sr.report();
        //然后老爸，一看，很开心，就签名了
        sr.sign("老三");
        //我叫小三，老爸当然叫老三
    }
}

//这次考试语文最高是75，数学是78，自然是80
//尊敬的XXX家长:
// ......
// 语文 62 数学65 体育 98 自然 63
// .......
// 家长签名：
//我是排名第38名...
//家长签名为：老三