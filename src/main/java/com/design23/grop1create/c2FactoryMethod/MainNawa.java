package com.design23.grop1create.c2FactoryMethod;

public class MainNawa {
    public static void main(String [] args){
        AbstractHumanFactory yinyanglu = new FactoryHuman();
        HumanWhite white = yinyanglu.createHuman(HumanWhite.class);
        white.getColor();
        white.talk();

        HumanBlack black = yinyanglu.createHuman(HumanBlack.class);
        black.getColor();
        black.talk();

        HumanYellow yellow = yinyanglu.createHuman(HumanYellow.class);
        yellow.getColor();
        yellow.talk();
    }
}
