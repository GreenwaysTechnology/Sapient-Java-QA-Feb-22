package com.sapient.oo.hasa;

public class Address {
    private String doorno;
    private String city;
    private String state;
    private String zipcode;

    public  Address(){

    }

    public Address(String doorno, String city, String state, String zipcode) {
        this.doorno = doorno;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getDoorno() {
        return doorno;
    }

    public void setDoorno(String doorno) {
        this.doorno = doorno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
