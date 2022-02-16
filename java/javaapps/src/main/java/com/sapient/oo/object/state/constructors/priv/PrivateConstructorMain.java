package com.sapient.oo.object.state.constructors.priv;

public class PrivateConstructorMain {
    public static void main(String[] args) {
        //Container container = new Container(); //calling constructor
        Container container = Container.getInstance();
        System.out.println(container.getInfo());
    }
}
