package com.design23.grop2structure.s4Facade.standard;

import com.design23.grop2structure.s4Facade.base.ILetterProcess;
import com.design23.grop2structure.s4Facade.base.LetterProcessImpl;

//增加现代化邮局的类图
//现代化邮局
//负责对一个比较复杂的信件处理过程的封装，然后高层模块只要和它有交互就成了
public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();

    //写信，封装，投递，一体化
    public void sendLetter(String context, String address) {
        //帮你写信
        letterProcess.writeContext(context);
        //写好信封
        letterProcess.fillEnvelope(address);
        //把信放到信封中
        letterProcess.letterInotoEnvelope();
        //邮递信件
        letterProcess.sendLetter();
    }
}
