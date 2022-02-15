package com.sapient.oo.object.behaviour.setters;

public class SettersAndGettersMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        //initalize
        employee.setId(1);
        employee.setName("Subramanian");
        employee.setSalary(2000.89);
        //read
        System.out.println("Id " + employee.getId());
        System.out.println("Name " + employee.getName());
        System.out.println("Salary " + employee.getSalary());

    }
}
