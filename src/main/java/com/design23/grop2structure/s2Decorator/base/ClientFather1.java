package com.design23.grop2structure.s2Decorator.base;

public class ClientFather1 {
    public static void main(String[] args) {
        //把成绩单拿过来
        SchoolReport sr = new FouthGradeSchoolReport();
        //看成绩单
        sr.report();
        //签名？休想！
    }
}

//尊敬的XXX家长:
// ......
// 语文 62 数学65 体育 98 自然 63
// .......
// 家长签名：