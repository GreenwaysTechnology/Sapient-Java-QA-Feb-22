package com.sapient.oo.object.behaviour;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        //access car initial speed
        System.out.println("Speed :" + car.speed);
        //change the state
        car.start();
        System.out.println("Speed :" + car.speed);
        car.changeGear(4);
        System.out.println("Speed :" + car.speed);

    }
}
