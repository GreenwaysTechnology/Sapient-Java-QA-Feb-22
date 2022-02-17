package com.sapient.oo.objectclass;

import java.util.Objects;

public class Greeting {

    private int id;
    private String message;
    private String name;

    public Greeting(){

    }

    public Greeting(int id,String message, String name) {
        this.id =id;
        this.message = message;
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Override to String method

    @Override
    public String toString() {
        return "Greeting{" +
                "message='" + message + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Greeting)) return false;
        Greeting greeting = (Greeting) o;
        return id == greeting.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
