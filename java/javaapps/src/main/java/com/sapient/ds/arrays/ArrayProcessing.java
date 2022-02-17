package com.sapient.ds.arrays;

import java.util.Arrays;

public class ArrayProcessing {
    public static void main(String[] args) {
        int[] list = {8, 3, 1, 2, 0, 4, 5};
        System.out.println("Before Sorting");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        Arrays.sort(list);
        System.out.println("After Sorting");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        Employee[] employees = {
                new Employee(4, "A"),
                new Employee(1, "B")
        };
        System.out.println("Before Sorting -Employees");

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        Arrays.sort(employees);
        System.out.println("After Sorting -Employees");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        //using comparaator
        Employee[] employeeList = {
                new Employee(4, "A"),
                new Employee(5, "B"),
                new Employee(3, "C"),
                new Employee(1, "D"),
        };
        System.out.println("Before Sorting -Employees");

        for (int i = 0; i < employeeList.length; i++) {
            System.out.println(employeeList[i]);
        }
        Arrays.sort(employeeList, new EmployeeIdAscendingOrder());

        System.out.println("After Sorting -Employees");

        for (int i = 0; i < employeeList.length; i++) {
            System.out.println(employeeList[i]);
        }
        System.out.println("After Sorting Decending order -Employees");
        Arrays.sort(employeeList, new EmployeeIdDecendingOrder());

        for (int i = 0; i < employeeList.length; i++) {
            System.out.println(employeeList[i]);
        }
    }
}
