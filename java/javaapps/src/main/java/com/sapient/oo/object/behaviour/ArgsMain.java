package com.sapient.oo.object.behaviour;

public class ArgsMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //
        calculator.add(10,10);
        System.out.println(calculator.multiply(10,10));
    }
}
