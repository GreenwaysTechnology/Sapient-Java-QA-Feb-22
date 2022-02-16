package com.sapient.oo.hasa;

public class HasAMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Subramanian");
        employee.setSalary(1000.89);
        Address address = new Address();
        address.setDoorno("10");
        address.setCity("Coimbatore");
        address.setState("Tamil Nadu");
        address.setZipcode("6000 001");
        //object binding or dependency injection
        employee.setAddress(address);

        //Access
        System.out.println("Id => " + employee.getId());
        System.out.println("Name => " + employee.getName());
        System.out.println("Salary => " + employee.getSalary());
        //address
        System.out.println("Address " + employee.getAddress());
        System.out.println("Door No =>" + employee.getAddress().getDoorno());
        System.out.println("City =>" + employee.getAddress().getCity());
        System.out.println("State =>" + employee.getAddress().getState());
        System.out.println("Zip code =>" + employee.getAddress().getZipcode());

        //with constructors
        Address address1 = new Address("11","Chennai","Tamil Nadu","6098823");
        Employee employee1 = new Employee(2,"John",7897.00,address1);

        System.out.println("Id => " + employee1.getId());
        System.out.println("Name => " + employee1.getName());
        System.out.println("Salary => " + employee1.getSalary());
        //address
        System.out.println("Address " + employee1.getAddress());
        System.out.println("Door No =>" + employee1.getAddress().getDoorno());
        System.out.println("City =>" + employee1.getAddress().getCity());
        System.out.println("State =>" + employee1.getAddress().getState());
        System.out.println("Zip code =>" + employee1.getAddress().getZipcode());



    }
}
