package com.design23.grop1create.c2FactoryMethod.multiFactory;

import com.design23.grop1create.c2FactoryMethod.Human;
import com.design23.grop1create.c2FactoryMethod.HumanWhite;
import com.design23.grop1create.c2FactoryMethod.HumanYellow;

//  变种2：  升级为多个工厂类
public class YellowHumanFactory extends AbstractHumanFactory {

    @Override
    Human createHuman() {
        return new HumanYellow();
    }
}
