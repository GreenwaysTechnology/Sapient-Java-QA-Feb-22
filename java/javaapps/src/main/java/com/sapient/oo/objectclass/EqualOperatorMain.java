package com.sapient.oo.objectclass;


public class EqualOperatorMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        Greeting greeting1 = new Greeting(1,"Hello", "Subramanian");
        Greeting greeting2 = new Greeting(1,"Hai", "Ram");

        if (greeting1 == greeting2) {
            System.out.println("Greetings are equal");
        } else {
            System.out.println("Greetings are not equal");
        }

        //Equal condition with single object
        Greeting greeting3 = new Greeting();
        Greeting greeting4 = greeting3;
        if (greeting3 == greeting4) {
            System.out.println("Greetings are equal");
        } else {
            System.out.println("Greetings are not equal");
        }


    }
}
