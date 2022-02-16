package com.sapient.oo.typing.interfaces;

public class Math implements Calculator{
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void substract(int a, int b) {
        System.out.println(a-b);

    }
}
