package com.sapient.oo.object.state.constructors;

public class ConstructorMain {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer.getId() + "=>" + customer.getName());

        //new object with id and name
        Customer newCustomer = new Customer(10, "Subramanian");
        System.out.println(newCustomer.getId() + "=>" + newCustomer.getName());

        Customer newCustomer1 = new Customer("Ram");
        System.out.println(newCustomer1.getId() + "=>" + newCustomer1.getName());
    }
}
