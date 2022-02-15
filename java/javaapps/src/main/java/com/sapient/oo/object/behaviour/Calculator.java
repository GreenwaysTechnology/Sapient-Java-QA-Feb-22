package com.sapient.oo.object.behaviour;

public class Calculator {
    //with parameters and no return
    void add(int a, int b) {
        int result = a + b;
        System.out.println("Add " + result);
    }
    //with return
    int multiply(int a, int b) {
        return a * b;
    }
}
