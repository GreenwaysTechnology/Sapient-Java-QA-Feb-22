package com.sapient.oo.typing.inheritance;

public class ProgramToSuperType {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        //call bark method
        Dog tmpDog= (Dog)dog; // cast Animal to Dog
        tmpDog.bark();

        //Object as Super type
        Object myDog = new Dog();
        Animal animal = (Animal) myDog;
        animal.eat();
        Dog tmpDog2 = (Dog) myDog;
        tmpDog2.bark();
    }
}
