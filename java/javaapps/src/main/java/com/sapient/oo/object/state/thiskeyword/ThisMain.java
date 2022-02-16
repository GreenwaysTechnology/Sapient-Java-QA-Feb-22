package com.sapient.oo.object.state.thiskeyword;

public class ThisMain {
    public static void main(String[] args) {
        Employee employee = new Employee(1);
        employee.setId(100);
        System.out.println(employee.getId());
        //
        Customer customer = new Customer();
        System.out.println(customer.getId() + " " + customer.getName());
    }
}
