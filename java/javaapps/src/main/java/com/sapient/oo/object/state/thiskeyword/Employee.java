package com.sapient.oo.object.state.thiskeyword;

public class Employee {
    private int id;
//
//    public void setId(int id) {
//        id = id;
//    }
    public Employee(int id){
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
