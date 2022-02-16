package com.sapient.oo.typing.abstractcls;

public class AbstractClassMain {
    public static void main(String[] args) {
        Animal animal = null;
        animal = new Dog();
        animal.eat();
        System.out.println(animal.saveAnimals());

        animal = new Tiger();
        animal.eat();
        System.out.println(animal.saveAnimals());

    }
}
