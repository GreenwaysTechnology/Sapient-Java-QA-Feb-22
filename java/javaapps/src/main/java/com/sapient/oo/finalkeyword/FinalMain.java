package com.sapient.oo.finalkeyword;

public class FinalMain {
    public static void main(String[] args) {
        Container container = new Container();
        System.out.println(container.a);
        //container.a =100;
        System.out.println(Container.PI);
        container.getValue();
        container.setValue();

        MyString myString = new MyString();
        myString.setValue();

    }
}
