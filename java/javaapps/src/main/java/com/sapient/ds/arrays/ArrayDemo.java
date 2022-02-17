package com.sapient.ds.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("length" + list.length);
        //iterate
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        //Array of employees
        Employee[] employees = {
                new Employee(1, "A"),
                new Employee(2, "B")
        };
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
