package com.sapient.oo.objectclass;
public class EqualsMethodMain {
    public static void main(String[] args) {
        Greeting greeting1 = new Greeting(1,"Hello","Subramanian");
        Greeting greeting2 = new Greeting(6,"Hello","Subramanian");
        System.out.println("Greeting 1 Hashcode " + greeting1.hashCode());
        System.out.println("Greeting 2 Hashcode " + greeting2.hashCode());

        //by default equals method test object reference equality using == operator
        System.out.println(greeting1.equals(greeting2) ? "Objects are equal" : "Objects are not equal");

    }
}
