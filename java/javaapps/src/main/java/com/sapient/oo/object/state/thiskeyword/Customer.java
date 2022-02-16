package com.sapient.oo.object.state.thiskeyword;

public class Customer {
    private int id;
    private String name;

    //default constructor
    public Customer() {
//        this.id =1;
//        this.name ="foo";
        //call two arg constructor : constructor chaining
        this(1, "foo");
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
