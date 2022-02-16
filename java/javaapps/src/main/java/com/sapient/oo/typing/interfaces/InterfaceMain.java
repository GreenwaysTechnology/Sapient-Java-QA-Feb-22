package com.sapient.oo.typing.interfaces;

public class InterfaceMain {
    public static void main(String[] args) {
        Crow crow = new Crow();
        crow.fly();

        //program to super type
        Flyable crow1 = new Crow();
        crow1.fly();
        Crow tmpCrow = (Crow) crow1;
        tmpCrow.buildNest();

        //
        Flyable flyable = null;
        //birds
        flyable = new Crow();
        flyable.fly();

        //aircraft
        flyable = new AirPlan();
        flyable.fly();

        Calculator calculator = new Math();
        calculator.add(100,100);
        calculator.substract(20,10);


    }
}
