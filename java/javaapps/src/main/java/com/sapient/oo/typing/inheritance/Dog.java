package com.sapient.oo.typing.inheritance;

public class Dog extends Animal {
    @Override
    public void eat() {
//        super.eat();
        System.out.println("Dog eats");
    }

    //extra method
    public void bark() {
        System.out.println("dog is barking");
    }
}
