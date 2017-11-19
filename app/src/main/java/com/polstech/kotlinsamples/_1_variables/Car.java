package com.polstech.kotlinsamples._1_variables;

import _1_variables.CarKt;

/**
 * Created by prashantspol on 11/9/2017.
 */

public class Car {
    private String color;
    private Boolean dieselEngine;

    public Car(String color, Boolean dieselEngine) {
        this.color = color;
        this.dieselEngine = dieselEngine;

        CarKt carKt = new CarKt("model", true);
        carKt.setColor("red");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getDieselEngine() {
        return dieselEngine;
    }

    public void setDieselEngine(Boolean dieselEngine) {
        this.dieselEngine = dieselEngine;
    }
}
