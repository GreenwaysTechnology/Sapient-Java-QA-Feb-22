package com.sapient.oo.object.state.constructors.priv;

public class Container {
    private Container() {
        System.out.println("Container is created");
    }
    //static
    public static Container getInstance() {
        Container container = new Container();
        return container;
    }

    public String getInfo() {
        return "Container";
    }
}
