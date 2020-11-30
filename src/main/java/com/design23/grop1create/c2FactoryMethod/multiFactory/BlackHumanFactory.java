package com.design23.grop1create.c2FactoryMethod.multiFactory;

import com.design23.grop1create.c2FactoryMethod.Human;
import com.design23.grop1create.c2FactoryMethod.HumanBlack;

//    升级为多个工厂类
public class BlackHumanFactory extends AbstractHumanFactory {

    @Override
    Human createHuman() {
        return new HumanBlack();
    }
}
