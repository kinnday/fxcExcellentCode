package com.design23.grop1create.c4Builder.real;

import com.design23.grop1create.c4Builder.BenzModel;
import com.design23.grop1create.c4Builder.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();

    public CarModel getCarModel() {
        return this.benz;
    }

    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }
}
