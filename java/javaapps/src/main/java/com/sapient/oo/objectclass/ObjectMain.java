package com.sapient.oo.objectclass;

public class ObjectMain {
    public static void main(String[] args) {
        Greeting greeting = new Greeting(1,"Hello","Subramanian");
        //System.out.println(greeting.getMessage() + " " +greeting.getName());
        //toString
        System.out.println(greeting.toString());
        System.out.println(greeting); //here toString is called automatically
        System.out.println(greeting.hashCode());
    }
}
