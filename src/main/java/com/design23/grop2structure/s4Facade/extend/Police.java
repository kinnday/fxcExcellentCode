package com.design23.grop2structure.s4Facade.extend;

import com.design23.grop2structure.s4Facade.base.ILetterProcess;

//扩展后的系统类图
// 警察检查信件 - 对用户透明的
public class Police {
    //检查信件，检查完毕后警察在信封上盖个戳：此信无病毒
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess + " 信件已经检查过了...");
    }
}
