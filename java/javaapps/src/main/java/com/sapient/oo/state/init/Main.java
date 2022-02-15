package com.sapient.oo.state.init;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee();
        System.out.println(employee.getId() + " => " + employee.getName() + " " + employee.getSalary());
        System.out.println(employee.getGender());
        employee.city = "coimbatore";
        System.out.println(employee.city);
        employee.setCity("Coimbatore");
        System.out.println(employee.getCity());
    }
}
