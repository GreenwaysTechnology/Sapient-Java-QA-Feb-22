package com.sapient.oo.typing.interfaces;

public class AirPlan implements Flyable{
    @Override
    public void fly() {
        System.out.println("Airplan is flying");
    }
}
