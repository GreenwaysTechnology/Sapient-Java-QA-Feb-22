package com.sapient.ds.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListProcessingMain {
    public static void processIntList() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(1);
        list.add(2);
        list.add(200);
        System.out.println("Before Sorting");
        for (Integer val : list) {
            System.out.println(val);
        }
        Collections.sort(list);
        System.out.println("After Sorting");
        for (Integer val : list) {
            System.out.println(val);
        }
    }

    public static void processEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "A1", 100.89));
        employeeList.add(new Employee(3, "A3", 1070.89));
        employeeList.add(new Employee(2, "A2", 10330.89));
        employeeList.add(new Employee(5, "A5", 10670.89));
        System.out.println("Before Sorting");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        Collections.sort(employeeList);
        System.out.println("After Sorting");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        Collections.sort(employeeList,new EmployeeIdDecendingOrder());
        System.out.println("After Sorting");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        processEmployeeList();
    }
}
