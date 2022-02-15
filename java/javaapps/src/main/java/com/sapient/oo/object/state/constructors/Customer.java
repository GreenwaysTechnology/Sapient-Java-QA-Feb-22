package com.sapient.oo.object.state.constructors;

public class Customer {
    private int id;
    private String name;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //constructor - no arg constructor
    public Customer() {
        this.id = 10;
        this.name = "foo";
    }

    //two args
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //only Name
    public Customer(String name){
        this.name = name;
    }
    public Customer(String city,int id){
        this.city = city;
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
