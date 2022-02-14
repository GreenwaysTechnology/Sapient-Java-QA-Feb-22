package com.sapient.oo.abstraction;

public class ObjectCreationMain {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("Id :" + customer.id);
        System.out.println("Name " + customer.name);
        System.out.println("City " + customer.city);
        System.out.println("Invoice Value " + customer.invoiceValue);
    }
}
