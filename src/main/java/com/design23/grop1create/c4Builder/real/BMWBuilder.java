package com.design23.grop1create.c4Builder.real;

import com.design23.grop1create.c4Builder.BMWModel;
import com.design23.grop1create.c4Builder.BenzModel;
import com.design23.grop1create.c4Builder.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();

    public CarModel getCarModel() {
        return  this.bmw;
    }

    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }
}
