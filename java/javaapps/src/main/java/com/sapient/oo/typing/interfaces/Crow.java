package com.sapient.oo.typing.interfaces;

public class Crow implements Flyable {
    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }
    public void buildNest(){
        System.out.println("Nest");
    }
}
